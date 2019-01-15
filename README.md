# env-app

Example app to explain how to use env variables.

## Installation

Install dependencies using the command `lein deps`.


## Usage

Launch the application for dev using the command `lein run`.
For example:
```
$ lein run
dev runtime variables for MySQL: {:dbtype mysql, :host localhost, :port 3306, :user user, :password password, :dbname dbname}
dev runtime variables for Redis: {:host localhost, :port 6379}
```
Launch the application for prod using the command `lein with-profile prod run`.
For example:
```
$ lein with-profile prod run
prod runtime variables for MySQL: {:dbtype mysql, :host prod_host, :port prod_port, :user prod_user, :password prod_password, :dbname prod_dbname}
prod runtime variables for Redis: {:host prod_host, :port prod_port}
```

## License
