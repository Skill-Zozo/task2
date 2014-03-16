import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class BinarySearchTreeTest {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BinarySearchTree<Integer, String> names = new BinarySearchTree<Integer, String>();
		BinarySearchTree<Integer, String> surnames = new BinarySearchTree<Integer, String>();
		FileReader fr  = new FileReader(new File("toSearchIn.txt"));
		BufferedReader br = new BufferedReader(fr);
		String[] temp = new String[2];
		for(String newLine = br.readLine(); newLine != null; newLine = br.readLine()) {
			temp = newLine.split(" ");			
			//temp stores in the name of the person in temp[0] and the surname in temp[1], it does this for each person
			int key1 = getStringValue(temp[0]);
			int key2 = getStringValue(temp[1]);
			names.add(key1, temp[0]);
			surnames.add(key2, temp[1]);
		}
		br.close();
		names.printInOrder();
		System.out.println("....................................................................");
		surnames.printPostOrder();
	}

	private static int getStringValue(String s) {
		// TODO Auto-generated method stub
		int val = 0;
		for(int i = 0; i < s.length(); i++) {
			val += (int)(s.charAt(i));
		}
		return val;
	}

}
