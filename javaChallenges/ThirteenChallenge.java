package javaChallenges;

public class ThirteenChallenge {

	public static void main(String[] args) {


		String [] input = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		int count =0;
		String result=" ";
		for(int i=0;i<input.length;i++) {
			String[] split = input[i].split(" ");
			if(split.length>count) {
				count=split.length;
				result=input[i];
			}
		}
		System.out.println(count);
		System.out.println(result);

	}

}
