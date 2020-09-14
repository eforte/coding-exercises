//openjdk version '11.0.7'
//Run online at: https://repl.it/@eforte/StringEquality#StringEquality.java

class StringEquality
{  
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String str1 = "using comparison operator";
        String str2 = "using comparison operator";
        String str3 = new String("using comparison operator");
        
        boolean result1 = str1 == str2;
        boolean result2 = str1 == str3;
        
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        
        boolean result3 = str1.equals(str2);
        boolean result4 = str1.equals(str3);
        
        System.out.println("result3: " + result3);
        System.out.println("result4: " + result4);
        
    }
}

/*
javac -classpath .:/run_dir/junit-4.12.jar:target/dependency/* -d . StringEquality.java
java -classpath .:/run_dir/junit-4.12.jar:target/dependency/* StringEquality
Hello, World!
result1: true
result2: false
result3: true
result4: true
*/
