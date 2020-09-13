/*
 * PostgreSQL v 13 
 * Run online: https://www.db-fiddle.com/f/pjMs26Nq8sJQuQWBKhzCe3/2
 * Problem:
 * Create the sql query to determine what is the value corresponding to a given input date for a give id:
 * id
 * 1
 * 2
 *
 * id start_date  end_date    value
 * 1       jun1       jul1     5.0
 * 1       jul1       aug1     6.0
 * 1       aug1       sep1     7.0
 * 2       jun1       jul1     8.0
 * 2       jul1       aug1     9.0
 * 2       aug1       sep1     4.0
 */


CREATE TABLE dates (
  id INTEGER not NULL,
  start_date DATE not NULL,
  end_date DATE not NULL,
  val NUMERIC not NULL,
  PRIMARY KEY (id, start_date, end_date)
);

INSERT INTO dates (id, start_date, end_date, val)
VALUES
(1, '2020-06-01', '2020-07-01', 5.0),
(1, '2020-07-01', '2020-08-01', 6.0),
(1, '2020-08-01', '2020-09-01', 7.0),
(2, '2020-06-01', '2020-07-01', 8.0),
(2, '2020-07-01', '2020-08-01', 9.0),
(2, '2020-08-01', '2020-09-01', 4.0);

/*
Gets the value corresponding to a given input date for a give id. E.g. id = 1, date = 2020-08-02 show return 7.0.
*/
/*
select val from dates where 
id = '1'
and start_date < '2020-08-02'
and end_date > '2020-08-02';

Returns:

val
---
7.0

*/
