# Selecteren van testcases

Testclasses moeten standaard eindigen op `Test`, anders moet je specifiek aangeven (in pom.xml) welke test je wilt uitvoeren. 
````
<includes>
    <include>/browser/structured/answers/**</include>
</includes>
````                  
van de maven-surefire-plugin

# Uitvoeren via maven
## In Chrome
`mvn clean test -DseleniumGrid=false -DseleniumBrowser=chrome`

## In Firefox
`mvn clean test -DseleniumGrid=false -DseleniumBrowser=firefox`

## Via Grid in Chrome
`mvn clean test -DseleniumGrid=true -DseleniumBrowser=chrome`

## Via Grid in Firefox
`mvn clean test -DseleniumGrid=true -DseleniumBrowser=firefox`

## Via specifiek Grid in Chrome
`mvn clean test -DseleniumGrid=true -DseleniumBrowser=chrome -DseleniumGridUrl=http://localhost:4444/wd/hub`

## Via specifiek Grid in Firefox
`mvn clean test -DseleniumGrid=true -DseleniumBrowser=firefox -DseleniumGridUrl=http://localhost:4444/wd/hub`


# Genereren rapport
`mvn allure:report`