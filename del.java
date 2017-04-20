package warmUpPrograms;

/**
 * Created by brijesh on 17/4/17.
 */
public class del {
    /*Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.
    delDel("adelbc") → "abc"
    delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
*/

    public String delDel(String string){
        if (string.length() >= 4 && string.substring(1,4).equals("del")){
            return string.substring(0,1) + string.substring(4);
        }
        return string;
    }

    public static void main(String[] args) {
        del de = new del();
        System.out.println(de.delDel("adelbc"));
        System.out.println(de.delDel("adelHello"));
        System.out.println(de.delDel("adedbc"));
    }
}
