import java.util.ArrayList;
import java.util.List;

public class dcs 
{
	private List <Integer> minDeletionSize(String[] a) // finding incorrect coloumns
	{
		List<Integer> myList = new ArrayList<Integer>();
		boolean cont = true;

		for (int ch = 0; ch < a[0].length(); ch++) { 
			if(cont) {
				for (int col = 0; col < a.length - 1; col++) {
					if (a[col].length() == a[col+1].length()) {
						if (a[col].charAt(ch) > a[col+1].charAt(ch)) {
							myList.add(ch);
							break;
						}
					}
					else {
						cont = false;
					}
				}
			}
			else {
				myList.add(-1); // unequal string length
				break;
			}
		}
		return myList;
	}

	public static void main(String[] args)
	{
		String [] a = new String[] {"captain", "marvel", "tsr"};
		dcs s = new dcs();

		List<Integer> d = s.minDeletionSize(a);
		System.out.println(d.toString());
	}
}