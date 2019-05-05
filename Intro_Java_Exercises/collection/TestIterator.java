import java.util.*;
/**
 * TestIterator
 */
public class TestIterator {
    public static void main(String[] args) {
        Collection<String> collection =  new ArrayList<>();
        collection.add("New York");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Madison");

        Iterator<String> iterator = collection.iterator();  
        // 直接使用colloection.iterator()而不是new Iterator，是直接将Iterator转化为collection类型

        while (iterator.hasNext()) { //检查列表中是否还有下一项元素
            System.out.print(iterator.next().toUpperCase() + " "); // 使用.next()访问列表中的下一个元素
        }
        System.out.println();

        for (String e : collection) {
            System.out.print(e.toUpperCase() + " ");
        }
        System.out.println();

        // lambda表达式，遍历整个列表并输出
        collection.forEach(e -> System.out.print(e.toUpperCase() + " ")); 
        System.out.println();
    }
    
}