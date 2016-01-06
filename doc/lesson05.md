# Занятие 5 онлайн проекта <a href="https://github.com/JavaWebinar/topjava05">Topjava</a>

## <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFfmctT3oyNW1qaVhDb2p0bGpyTFVlaUJ2VVpOdVgtWF9KTUFBMWFaR2xVYVE">Материалы урока</a>

## <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFVFVVUGctMUxxSkE">Разбор вопросов</a>
- <a href="http://stackoverflow.com/questions/8994864/how-would-i-specify-a-hibernate-pattern-annotation-using-a-regular-expression">Validate by RegExp</a>
- <a href="http://www.objectdb.com/java/jpa/persistence/managed#Entity_Object_Life_Cycle">Working with JPA Entity Objects</a>
- <a href="https://en.wikibooks.org/wiki/Java_Persistence/Relationships">Java Persistence/Relationships</a>
- <a href="http://articles.javatalks.ru/articles/17">Использование ThreadLocal переменных</a>
- <a href="http://stackoverflow.com/questions/1069992/jpa-entitymanager-why-use-persist-over-merge">Merge vs Persist</a>
- <a href="http://www.youtube.com/watch?v=1KphwODu1gg">Видео: работа в ZK с OpenJPA (в чем Hibernate хуже)</a>
- <a href="https://developer.jboss.org/wiki/OpenSessionInView">Паттерн- открытие транзакции в фильтре</a> и <a href="http://stackoverflow.com/questions/1103363/why-is-hibernate-open-session-in-view-considered-a-bad-practice">почему это bad-practice</a>
- <a href="https://en.wikibooks.org/wiki/Java_Persistence/Identity_and_Sequencing#Sequence_Strategies">Sequence Strategies</a>
- <a href="http://stackoverflow.com/questions/9470442/why-is-the-hibernate-default-generator-for-postgresql-sequencegenerator-not?lq=1">SequenceGenerator/IdentityGenerator in PostgreSql</a>

## <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFNFMyMGJCZWE4elk">HW4: JPA. @Rule</a>
-  **<a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFU2QyM1dlQUxXR28">1_ HW4.patch</a>**
-  **<a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFbHZwbTgzQjd3ZG8">2_ HW4_ Optional.patch</a>**

Изменения в проекте:

-  <a href="https://hibernate.atlassian.net/browse/HHH-8844">Add support for Java 8 date and time types (JSR-310)</a>
-  <a href="http://stackoverflow.com/questions/14892125/what-is-the-best-practice-to-determine-the-execution-time-of-the-bussiness-relev#27868954">Stopwatch</a>

## <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFZENCVEhDMkZiV00">Транзакции</a>
-  <a href="https://ru.wikipedia.org/wiki/Транзакция_(информатика)">wiki Транзакция</a>
-  <a href="https://jira.spring.io/browse/DATAJPA-601">readOnly и Propagation.SUPPORTS</a>

## <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFNW0yVWhXcGNPU2M">Профили Maven и Spring</a>
-  **<a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFcGw0a19PdVJSbG8">3_ profiles_ connection_ pool.patch</a>**

 > Для переключения на HSQLDB необходимо:
 >  - поменять в окне Maven Projects профиль (Profiles) на `hsqldb` и сделать `Reimport All Maven Projects` (1я кнопка)
 >  - поменять в UserServiceTest/UserMealServiceTest `@ActiveProfiles(Profiles.HSQLDB)`

## <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFTWJOdHduOWtNcTA">Пул коннектов</a>

-  Выбор реализации пула коннектов: <a href="http://jolbox.com/">BoneCP</a>, <a href="http://commons-dbcp.apache.org">Commons Database Connection Pooling</a>, <a href="https://github.com/brettwooldridge/HikariCP">HikariCP</a>
-  <a href="http://blog.trustiv.co.uk/2014/06/battle-connection-pools">Battle of the Connection Pools</a>
-  <a href="http://blog.ippon.fr/2013/03/13/improving-the-performance-of-the-spring-petclinic-sample-application-part-3-of-5">Tomcat pool</a>

## <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFYVdyMFYxRUR6bWM">Spring Data JPA</a>
- **<a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFRHNMaXNKNkRQb3M">4_ spring_ data_ jpa.patch</a>**

-  <a class="anchor" id="datajpa"></a><a href="http://projects.spring.io/spring-data-jpa/">Spring Data JPA</a>
-  Замена AbstractDAO: <a href="http://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.repositories">JPA Repositories</a>
-  Разрешение зависимостей: <a href="http://howtodoinjava.com/2014/02/18/maven-bom-bill-of-materials-dependency/">Maven BOM [Bill Of Materials] Dependency</a>
-  <a href="http://habrahabr.ru/post/232381/">Делегирование. (Spring Data JPA)</a>
-  <a href="http://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation">Query methods</a>
-  <a href="http://jeeconf.com/archive/jeeconf-2013/materials/spring-data/">Spring Data – новый взгляд на persistence (JeeConf)</a>
    
-  Ресурсы:
   -  <a href="https://github.com/spring-projects?query=spring-data">Github repositories</a></li>
   -  <a href="http://www.petrikainulainen.net/spring-data-jpa-tutorial">Spring Data JPA Tutorial</a></li>
   -  <a href="https://blog.42.nl/articles/spring-data-jpa-with-querydsl-repositories-made-easy/">Spring Data JPA with QueryDSL</a></li>

## <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFajd2Y2RLQVVJWUU">Spring кэш</a>
> В конфигурации кэш размещаем в `java.io.tmpdir`:

> http://stackoverflow.com/questions/1924136/environment-variable-to-control-java-io-tmpdir  

-  **<a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFbWlHeWNlZ0w5OTQ">5_ spring_ cache</a>**

-  <a href="http://habrahabr.ru/post/113945/">Кеширование в Spring Framework</a>
-  <a href="http://www.ehcache.org/">EHCACHE</a>

-  Ресурсы:
   -  <a href="http://docs.spring.io/spring-framework/docs/current/spring-framework-reference/html/cache.html">Spring cache Abstraction</a>
   -  <a href="http://habrahabr.ru/post/25140/">Распределённая система кеша ehcache</a>
   -  Починка JUnit: <a href="http://stackoverflow.com/questions/10013288/another-unnamed-cachemanager-already-exists-in-the-same-vm-ehcache-2-5">один кэш на JVM</a>

## <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFZFdWWFdwams0eGM">Домашнее задание HW05</a>
     Имплементировать DataJpaUserMealRepositoryImpl 
     Разделить реализации Repository по профилям Spring: jdbc, jpa, datajpa 
            (общее в профилях можно объединять, например <beans profile="datajpa,jpa">)
     Сделать тесты всех реализаций (jdbc, jpa, datajpa) через наследование (без дублирования),
             общее из UserMealServiceTest.java и UserServiceTest.java вынеси в базовый класс.
     Запустить все тесты: mvn test
                          или в IDEA Maven Lifecycle- test (кнопку skipTest отжать)

Optional     
     
     Починить MealServlet / SpringMain (добавить профили)

     Сделать и протестировать в сервисах методы (можно сделать разные варианты, реализация DataJpa):
     -  достать по id пользователя вместе с его едой
     -  достать по id еду вместе с пользователем
     Обращения к DB сделать в одной транзакции

## Ваши вопросы
> В <a href="https://github.com/spring-projects/spring-petclinic/tree/master/src/main/java/org/springframework/samples/petclinic/repository/springdatajpa">spring-petclinic</a> DataJpa реализована без проксирования и без доп. классов. В таком виде как у них, spring data смотрится, конечно, намного лаконичней других реализаций, но у нас получилось  вдвое больше кода, чем с тем же jpa или jdbc. Плюс, как я увидела, только пожалуй в том, что query находятся прямо в репозитории, а  не где-то там в другом пакете. Так что получается, spring data лучше подходит для простейших crud без всяких "фишек"? или в чем его достоинство для больших и сложных проектов?

Достоинство DATA-JPA по сравнению например с JPA: есть типизация, готовые реализации типовых методов CRUD а также paging, data-common, когда мы можем переключить реализацию, например, на mongoDb и пр. Подробнее о них есть в видео <a href="http://jeeconf.com/archive/jeeconf-2013/materials/spring-data/">Spring Data – новый взгляд на persistence</a>.
Я ввел доп. проксирование для устранения минусов подхода DATA-JPA: невозможность дебага и привязка к интерфейсу JpaRepository.
Кода становится побольше, но выигрыш этого стоит. Вообще, думаю, для средних размеров проектов такой подход может заменить слой сервисов.

## Подсказки по HW05
- Для того, чтобы не запускались родительские классы тестов нужно сделать их `abstract`
- Для IDEA не забудте выставить Spring Profiles в `spring-db.xml`: нарпимер `datajpa, postgres`
- Починка MealServlet / SpringMain предполагает погуглить на тему: поднять Spring контекст с профилями без использования VM опций
