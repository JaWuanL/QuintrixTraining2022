import org.testng.annotations.Test;

public class Sql {
  @Test
  public void f() {
	  1. Get 10 cities in descending alphabetical order.
	  SELECT Name FROM world_x.city
	  ORDER by Name DESC
	  limit 10;

	  2. Get all films with "airplane" in the title.
	  SELECT * FROM sakila.film
	  WHERE title = "Airplane"

	  3. Get the highest payment amount.
	  SELECT max(amount) FROM sakila.payment 


	  4. Get the number of records in the customer table for store id #1.
	  SELECT * FROM sakila.customer 
	  WHERE store_id = 1

	  5. Get all payment records for customer with email address "NANCY.THOMAS@sakilacustomer.org"
	  SELECT * FROM sakila.customer
	  WHERE email = "NANCY.THOMAS@sakilacustomer.org"

	  6. Use a View to get the film info for actor Bob Fawcett.
	  SELECT * FROM sakila.actor
	  WHERE first_name = "Bob" && last_name = "Fawcett"

	  7. Use a Stored Procedure to get the 4 inventory ids for the film "Alien Center" at Store #2. 
	  set @p_film_count = 0;
	  call sakila.film_in_stock(15, 2, @p_film_count);
	  select @p_film_count;

	  8. Insert a new store. Ensure that you use TRANSACTION. (This one is possible but it's tough! Pay attention to constraints and the order that you are inserting data.)
	  Start TRANSACTION;
	  INSERT INTO sakila.store(store_id,manager_staff_id,address_id,last_update) 
	  VALUES('3','3','3','2020-04-15')		

	  9. Update the timestamp to the current date/time for the new store you entered in the previous question. 
	  UPDATE store 
	  SET last_update = '2022-04-18'
	  WHERE store_id = 3

	  10. Delete the new store.
	  DELETE FROM sakila.store
	  WHERE store_id = 3
  }
}
