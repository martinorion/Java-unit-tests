# Java-unit-tests

Ulohou cviceni je napisat unit testy na kod, ktory sa nachadza: src/main/java/com/example/demo/widget
V tomto balicku je webova aplikacia, ktora umoznuje vytvorit, upravit, precitat alebo vymazat widgety.
Widgety su ulozene v DB, k tim sa pristupuje pomocou triedy WidgetRepository a logika je umiestnena 
v triede WidgetService. WidgetRestController 

Repository tests

src/test/java/com/example/demo/widget/repository/WidgetRepositoryTest.java

Service tests

Controller testy

Controller testy, testuju endpoints daneho controllera.
pomocou triedy Mocksville je mozne vykonat request na danu metodu v controllery
a otestovat, či vracia korektné dáta.

How to run tests

how to run tests with coverage

Testy je mozne spustit priamo cez intellij. Je mozne spustit vsetky testy v danej triede alebe konkretny test.
Taktiez je možné spustit testy spolu s coverage, ktore poskytuje informacie o percentualnom pokryti testovanrho kodu.
