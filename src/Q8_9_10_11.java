public class Q8_9_10_11 {
    public static void main(String[] args) {
        String s = null;
        System.out.println(s.contains("a"));
    }
} //8 -  Cannot invoke "String.contains(java.lang.CharSequence)" because "s" is null

// 9 - When should we call garbage collection? when we need to clean the memory

// 10 - D - all of the above

// 11 - Does it make sense to use a try-finally block (without catch)?
//   yes it does, and we can.
//   finally block always executes even if you have exception or return statement in try block except in case of System.exit().

