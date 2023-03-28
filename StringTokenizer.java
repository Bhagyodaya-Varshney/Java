import java.util.StringTokenizer;
public class StringTokenizer{
	public static void main(String [] args){
		StringTokenizer st = new StringTokenizer("Bhagyodaya varshney");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}
}
