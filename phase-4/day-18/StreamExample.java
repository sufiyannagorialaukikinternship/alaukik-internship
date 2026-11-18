
import java.util.*;
import java.util.stream.Collectors;

 class Main {
    public static void main(String[] args) {
        
        // 1. Initial Data Source
        List<String> currentList = Arrays.asList(
            "Laptop", "Mouse", "Keyboard", "Laptop", 
            "Monitor", "Headphones", "Mouse", "USB Hub", "Webcam"
        );

        System.out.println("==================================================");
        System.out.println("INITIAL DATA (Starting point):");
        System.out.println(currentList);
        System.out.println("==================================================\n");


        // --- 2. distinct() Operation ---
        System.out.println("-> OPERATION: distinct()");
        System.out.println("   [BEFORE]: " + currentList);
        
        currentList = currentList.stream()
                                 .distinct()
                                 .collect(Collectors.toList());
                                 
        System.out.println("   [AFTER] : " + currentList);
        System.out.println("   (Note: Duplicate 'Laptop' aur 'Mouse' remove ho gaye)\n");


        // --- 3. filter() Operation ---
        System.out.println("-> OPERATION: filter() [Sirf wohi rakho jinki length >= 6 ho]");
        System.out.println("   [BEFORE]: " + currentList);
        
        currentList = currentList.stream()
                                 .filter(item -> item.length() >= 6)
                                 .collect(Collectors.toList());
                                 
        System.out.println("   [AFTER] : " + currentList);
        System.out.println("   (Note: 'Mouse' aur 'USB Hub' hat gaye kyunki length 6 se kam thi)\n");


        // --- 4. map() Operation ---
        System.out.println("-> OPERATION: map() [Sabhi ko UPPERCASE mein convert karna]");
        System.out.println("   [BEFORE]: " + currentList);
        
        currentList = currentList.stream()
                                 .map(String::toUpperCase)
                                 .collect(Collectors.toList());
                                 
        System.out.println("   [AFTER] : " + currentList);
        System.out.println("   (Note: Saare words uppercase ho gaye)\n");


        // --- 5. sorted() Operation ---
        System.out.println("-> OPERATION: sorted() [Alphabetical order (A-Z) mein sort karna]");
        System.out.println("   [BEFORE]: " + currentList);
        
        currentList = currentList.stream()
                                 .sorted()
                                 .collect(Collectors.toList());
                                 
        System.out.println("   [AFTER] : " + currentList);
        System.out.println("   (Note: List alphabetical order mein arrange ho gayi)\n");


        // --- 6. limit() Operation ---
        System.out.println("-> OPERATION: limit() [Sirf shuru ke 3 items lena]");
        System.out.println("   [BEFORE]: " + currentList);
        
        currentList = currentList.stream()
                                 .limit(3)
                                 .collect(Collectors.toList());
                                 
        System.out.println("   [AFTER] : " + currentList);
        System.out.println("   (Note: Sirf pehle 3 products bache)\n");


        // --- 7. forEach() Operation ---
        System.out.println("-> OPERATION: forEach() [Har element par iterate karke print karna]");
        System.out.println("   [BEFORE]: " + currentList);
        System.out.print("   [OUTPUT]: ");
        
        currentList.stream().forEach(item -> System.out.print("[" + item + "] "));
        System.out.println("\n");


        // --- 8. reduce() Operation ---
        System.out.println("-> OPERATION: reduce() [Sabhi product names ki total characters ka sum nikalna]");
        System.out.println("   [BEFORE]: " + currentList);
        
        int totalChars = currentList.stream()
                                    .map(String::length)
                                    .reduce(0, (sum, len) -> sum + len);
                                    
        System.out.println("   [AFTER/RESULT]: Total character count = " + totalChars);
        System.out.println("==================================================");
            
    }
}