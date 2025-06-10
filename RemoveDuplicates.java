import java.util.*;
public class RemoveDuplicates {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
List<String> i = new ArrayList<>();
System.out.println("Enter items (type 'end' to stop):");
while(true) {
String item = sc.nextLine();
if (item.equalsIgnoreCase("end")) break;
i.add(item);
}
Set<String> uniqueItems = new LinkedHashSet<>(i);
System.out.println("List after removing duplicates (order preserved):");
for(String s:uniqueItems)
{
System.out.println(s);
}
sc.close();
}
}