# Selecteren van testcases

Testclasses should end with `Test`, otherwise you need to define (in pom.xml) which test you like to execute. 
````
<includes>
    <include>/browser/structured/answers/**</include>
</includes>
````

# Execute via maven
## In Chrome
`mvn clean test -DseleniumGrid=false -DseleniumBrowser=chrome`

## In Firefox
`mvn clean test -DseleniumGrid=false -DseleniumBrowser=firefox`

## Via Grid in Chrome
`mvn clean test -DseleniumGrid=true -DseleniumBrowser=chrome`

## Via Grid in Firefox
`mvn clean test -DseleniumGrid=true -DseleniumBrowser=firefox`

## Via specific Grid in Chrome
`mvn clean test -DseleniumGrid=true -DseleniumBrowser=chrome -DseleniumGridUrl=http://localhost:4444/wd/hub`

## Via specific Grid in Firefox
`mvn clean test -DseleniumGrid=true -DseleniumBrowser=firefox -DseleniumGridUrl=http://localhost:4444/wd/hub`


# Generate report
`mvn allure:report`