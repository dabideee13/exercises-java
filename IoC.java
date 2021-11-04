/**
 * Example of Dependency Injection and Inversion of Control
 * Source: https://www.youtube.com/watch?v=EPv9-cHEmQw
 *
 *
 * XML Configuration
 *
 * <bean id="MySql" class="com.java.MySql"/>
 * <bean id="Oracle" class="com.java.Oracle"/>
 *
 * <bean id="user" class="com.java.user"/>
 *    <arg ref="MySql"/>
 *    <arg ref="Oracle"/>
 * </bean>
 */

public class IoC {
   public static void main(String[] args) {
      IoC container = new IoC();
      User user = container.new User(container.new MySqlDatabase());
      user.add("This is some data!");
   }

   // Business Layer Logic
   public class User {
      Database database;

      public User(Database database) {
         this.database = database;
      }

      public void add(String data) {
         database.persist(data);
      }
   }

   public interface Database {
      void persist(String data);
   }

   // Database Access Layer
   public class MySqlDatabase implements Database {
      public void persist(String data) {
         System.out.println("Mysql has persisted: " + data);
      }
   }

   public class OracleDatabase implements Database {
      public void persist(String data) {
         System.out.println("Oracle has persisted: " + data);
      }
   }
}