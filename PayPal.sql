create database PayPal;
use PayPal;

-- creating Account table
create table Account
(
	actId int identity(1,1) primary key,
	email varchar(100),
	passwd varchar(50),
	_name varchar(50),
	phoneNum varchar(50)
)

-- creating Admin account
create table AdminAccount
(
	adminId int identity(1,1) primary key,
	actId int foreign key references Account(actId),
	privileges int,
)

-- creating user account table, it will hold both normi and business users
create table UserAccount
(
	actId int primary key foreign key references Account(actId),
	_address varchar(200),
	_status varchar(100),
	_type int,
	businessName varchar(200) null
)


-- creating invoice table
create table Invoice
(
	invoiceId int identity(1,1) primary key,
	bill float,
	dateGen date,
	receipt varchar(100)
);

create table CreditCard
(
	id int identity(1,1) primary key,
	expirationDate date,
	cvv int,
	cardNum varchar(50),
	balance float
)

create table UserCards
(
	id int identity(1,1) primary key,
	cardId int foreign key references CreditCard(id),
	userId int foreign key references Account(actId)
)

-- creating shipment table
create table Shipment
(
	shipmentId int identity(1,1) primary key,
	_address varchar(200),
	_status varchar(100),
	_User int foreign key references Account(actId),
	dispatchDate date,
	arrivalDate date,
	details varchar(200),
	fee float
)


-- Creating a Table Standard Transaction
create table Transactions
(
	id int identity(1,1) primary key,
	datePerformed date,
	amount float,
	invoiceId int foreign key references Invoice(invoiceId),
	transStatus varchar(100),
	instant bit,
	shipmentID int foreign key references Shipment(shipmentId) null,
	beneficiary int foreign key references Account(actId),
	benefactor int foreign key references Account(actId),
	_type int
)


-- creating Request table
create table Request
(
	reqId int identity(1,1) primary key,
	_message varchar(200),
	_status varchar(200),
	requester int foreign key references Account(actId)
)

-- creating Monetary request
create table monetaryReq
(
	reqId int foreign key references Request(reqId),
	id int identity(1,1) primary key,
	amount float,
	requestee int foreign key references Account(actId)
)

-- creating Report table
create table Report
(
	id int identity(1,1) primary key,
	reqId int foreign key references Request(reqId),
	response varchar(200),
	adminAct int foreign key references AdminAccount(adminId),
	reportedAct int foreign key references Account(actId)
)

create table UserOrders
(
	id int identity(1,1) primary key,
	orderId int foreign key references Shipment(shipmentId),
	userId int foreign key references Account(actId)
)



-- proc to add a std user to UserAccount
go
create proc addStdUser
@name varchar(50),
@email varchar(100),
@passwd varchar(50),
@phone varchar(50),
@addr varchar(200)
as
begin
	insert into dbo.Account values(@email,@passwd,@name,@phone);
	
	declare @id int = 0
	
	select @id=actId
	from Account
	where Account._name = @name and Account.email=@email

	insert into UserAccount values(@id,@addr,'active',1,null);
	return;
end

-- proc to add business user to UserAcccount
go
create proc addBsnUser
@name varchar(50),
@email varchar(100),
@passwd varchar(100),
@phone varchar(100),
@addr varchar(200),
@bnName varchar(200)
as
begin
	insert into dbo.Account values(@email,@passwd,@name,@phone);
	
	declare @id int = 0
	
	select @id=actId
	from Account
	where Account._name = @name and Account.email=@email

	insert into UserAccount values(@id,@addr,'active',2,@bnName);
	return;
end

-- proc to add an Admin account to Accounts and AdminAccounts
go
create proc addAdmin
@name varchar(50),
@email varchar(100),
@passwd varchar(100),
@phone varchar(100),
@priv int
as
begin
	insert into dbo.Account values(@email,@passwd,@name,@phone);
	
	declare @id int = 0
	
	select @id=actId
	from Account
	where Account._name = @name and Account.email=@email

	insert into AdminAccount values(@id,@priv);
	return;
end

-- proc that returns the table of all user accounts
go
create proc getAllUserAccounts
as
begin
	select *
	from Account join UserAccount on Account.actId = UserAccount.actId
end

-- proc that returns the table of all admins
go
create proc getAllAdmins
as
begin
	select * 
	from Account join AdminAccount on Account.actId = AdminAccount.actId
end

-- proc that returns account specified by actId
go
create proc getAccount
@actId int
as
begin
	if @actId  in (select actId from UserAccount)
		select *
		from Account join UserAccount on Account.actId =UserAccount.actId
		where Account.actId = @actId

	else if @actId in (select actId from AdminAccount)
			select *
			from Account join AdminAccount on Account.actId = AdminAccount.actId
			where Account.actId = @actId
end

-- proc to add a new transaction
go
create proc AddTransaction
@dtPerf date,
@amount float,
@invId int,
@tStat varchar(100),
@inst bit,
@ship int,
@receiver int,
@sender int,
@type int
as
begin
	insert into Transactions values (@dtPerf,@amount,@invId,@tStat,@inst,@ship,@receiver,@sender,@type);
end

-- proc to get transaction by id
go
create proc getTransaction
@transId int
as
begin
	if @transId in (select id from Transactions)
		select *
		from Transactions
		where id =@transId
end

-- proc to get all transactions
go
create proc getAllTransactions
as
begin
	select * from Transactions;
end

-- proc to add a credit card
go 
create proc addCreditCard
@expDate date,
@cvv int,
@cardNum varchar(50),
@balance float,
@id int out
as
begin
	insert into CreditCard values(@expDate,@cvv,@cardNum,@balance);
	select @id=id
	from CreditCard
	where cardNum=@cardNum and cvv = @cvv
end

-- proc to get all cards of a user useing actId
go
create proc getAllCards
@actId int
as
begin
	select *
	from CreditCard join UserCards on CreditCard.id = UserCards.cardId
	where userId = @actId
end

-- proc to remove credit card using card id
go
create proc removeCard
@cardId int
as
begin
	delete from UserCards where cardId=@cardId;
	delete from CreditCard where id =@cardId;
end


-- proc to add a new request
go
create proc addRequest
@message varchar(200),
@stat varchar(200),
@requester int,
@id int out
as 
begin
	insert into Request values (@message,@stat,@requester);
	select @id = reqId
	from Request
	where requester = @requester
end

-- proc to add monetary request

go
create proc addMonetaryRequest
@message varchar(200),
@stat varchar(200),
@requester int,
@amount float,
@requestee int,
@id int out
as 
begin
	insert into Request values (@message,@stat,@requester);
	declare @rId int
	
	select @rId = reqId
	from Request
	where requester = @requester and _message = @message

	insert into monetaryReq (reqId,amount,requestee) values (@rId,@amount,@requestee);

	select @id = id
	from monetaryReq
	where reqId = @rId

end





-- all test funcs
declare @gId int
exec addMonetaryRequest
@message = 'yar 500 dedo',
@stat ='unresolved',
@requester =1,
@amount =500,
@requestee = 2,
@id =@gId out;
select @gId


declare @oId int
exec addRequest
@message ='Yar paise leke bhag gya koi',
@stat = 'unresolved',
@requester = 1,
@id = @oId out;
select @oId

select * from Request

exec getAllAdmins
exec getAllUserAccounts	
exec getAccount
@actId = 3;

insert into Invoice values(20.56,'2011/3/18','Credit Share (Friendly)');
exec AddTransaction
@dtPerf = '2011/3/18',
@amount =20.56,
@invId = 1,
@tStat ='pending',
@inst = 0,
@ship = null,
@receiver =2,
@sender = 1,
@type =1;

exec getTransaction
@transId=2;

exec getAllTransactions

declare @gId int
exec addCreditCard
@expDate = '2022/3/18',
@cvv = 1439,
@cardNum = '1575321439',
@balance = 4000,
@id = @gId out;
select @gId

insert into CreditCard values ('2025/12/14',5722,'1575325722',10000);
insert into UserCards values(1,1)
insert into UserCards values(2,1);
exec getAllCards
@actId =1;

exec removeCard
@cardId =2




select * from Account
select * from AdminAccount
select * from UserAccount
select * from Invoice
select * from Transactions
select * from CreditCard
select * from UserCards
select * from Request
select * from monetaryReq

