checker
=======
This webproject uses Spring MVC + Hibernate.
To set up your database connection for hibernate you need to create a file with name 'service.properties' and 
set enviroment variable 'checker.config.root' in your application server to point to the file's directory.

Requiered properties in the property file:
```
dataSource.driverClassName=e.g.: com.mysql.jdbc.Driver
dataSource.url=e.g.: jdbc:mysql://...
dataSource.username
dataSource.password

hibernate.dialect=e.g.: org.hibernate.dialect.MySQLDialect
hibernate.hbm2ddl.auto=e.g.: validate
```

You can find the binaries for the project [here](https://github.com/janosmeszaros/checker/tree/master/binary).