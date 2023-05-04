# Exercise

## Install

This project uses [node](http://nodejs.org) and [npm](https://npmjs.com). Go check them out if you don't have them locally installed.

```sh
$ mvn clean install
```

## Run

This project uses [node](http://nodejs.org) and [npm](https://npmjs.com). Go check them out if you don't have them locally installed.

```sh
$ mvn spring-boot:run
```


## API Endpoints

### Customer

Update
> PUT http://localhost:8080/customers with body of type CustomerResource

>Example:
> 
> {
"id": "853ec148-8a5e-4b37-9564-cc3d16aa3185",
"firstName": "Kris",
"lastName": "Bude",
"middleName": null,
"email": null,
"phoneNumber": null,
"birthDate": null
}

### Quotation

Create
> POST http://localhost:8080/quotations with body of type QuotationResource



### Subscription

Create
> POST http://localhost:8080/subscriptions with body of type SubscriptionResource

Get
> GET http://localhost:8080/subscriptions/{id}