/*
 * PostgreSQL v 13 
 * Run online: https://www.db-fiddle.com/f/5bXNchkW4D8ffRjMXnE5yR/1
 * Read therory: https://www.essentialsql.com/what-is-the-difference-between-an-inner-and-outer-join/
 *		 https://www.diffen.com/difference/Inner_Join_vs_Outer_Join
 */

CREATE TABLE prices (
	row_id serial UNIQUE NOT NULL,
  	product VARCHAR ( 50 ) PRIMARY KEY UNIQUE NOT NULL,
	price NUMERIC (100, 2 ) NOT NULL
);

INSERT INTO prices (product, price)
values
('potato', 3.00), 
('avocado', 4.00), 
('kiwi', 2.00),
('onion', 3.00);


CREATE TABLE quantities (
	row_id serial UNIQUE NOT NULL,
  	product VARCHAR ( 50 ) PRIMARY KEY UNIQUE NOT NULL,
	qty VARCHAR ( 50 ) NOT NULL
);

INSERT INTO quantities (product, qty)
VALUES
('potato', 30.00), 
('avocado', 20.00), 
('kiwi', 10.00),
('melon', 5.00);


/* returns only mathced rows*/
/*
select p.*, q.qty
from prices p
inner join quantities q
on p.product = q.product;
*/

/* returns mathced rows and unmatched rows from table in from clause (with NULL values for the unexisting columns in the return set)*/
/*
select p.*, q.qty
from prices p
left outer join quantities q
on p.product = q.product;
*/

/* returns mathced rows and unmatched rows from table in join clause (with NULL values for the unexisting columns in the return set)*/
/*
select p.*, q.qty
from prices p
right outer join quantities q
on p.product = q.product;
*/
