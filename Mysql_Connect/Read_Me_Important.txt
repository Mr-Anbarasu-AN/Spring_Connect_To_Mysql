


===========================APPLICATION PROPERTIES===================================================
 1) Database name = "spring_connect" and you create a database in mysql
 2) After you entered your "root" and root password
 3) After you change you database name and root password.
 
 
 ===========================POSTMAN STEPS==========================================================
 
 POST OR CREATE Id and Name
 ===========================
 
 
 1) Download Postman then open postman or open postman website.
 2) click the "+" icon. 
 3) In the Dropdown option choose "POST".
 4) In the address bar type this word "localhost:8080/addDetails".
 5) Then choose "Body" after choose "Raw"
 6) copy the below code and paste the code in box in postman 
 
 
 
 {
    "sid":1,
    "sname":"AnyName"
 }
 
       
 
 7) Then Click the Send Button.
 8) Then Boom*; 
 
 
 ====================================================================================================
 
 
 GET OR READ TABLE
 ==================
 
 
 1)click the "+" icon. 
 2) In the Dropdown option choose "GET".
 3) In the address bar type this word "localhost:8080/showDetails".
 4) Then Click the Send Button.
 5) Then Boom*; 
 
 
 =======================================================================================================
 
 
 PUT OR UPDATE TABLE
 ====================
 
 
 
 1) click the "+" icon. 
 2) In the Dropdown option choose "PUT".
 3) In the address bar type this word "localhost:8080/updateDetails".
 4) Then choose "Body" after choose "Raw"
 5) copy the below code and paste the code in box in postman 
 
 
 
 {
    "sid":1,
    "sname":"AnyName"
 }
 
       
 
 6) Then Click the Send Button.
 7) Then Boom*; 
 
 
 
 
 ====================================================================================================
 
 
 DELETE TABLE DETAILS
 ====================
 
 
 
 1) click the "+" icon. 
 2) In the Dropdown option choose "DELETE".
 3) In the address bar type this word "localhost:8080/deleteDetails/id".
 
 Example:localhost:8080/deleteDetails/1
 
       
 
 4) Then Click the Send Button.
 5) Then this message is Displayed "Details is Deleted Successfully". 
 
 
 
 
 ======================================================================================================
 