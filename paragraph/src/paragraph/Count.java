package paragraph;

import java.util.HashMap;

public class Count {
	public static void main(String[] args) {

		int count = 0;

		HashMap<String, Integer> parmap = new HashMap<>();
		// String str="Randomly permutes the specified list using a default source of
		// randomness. All permutations occur with approximately equal likelihood. The
		// hedge approximately is used in the foregoing description because default
		// source of randomness is only approximately an unbiased source of
		// independently chosen bits. If it were a perfect source of randomly chosen
		// bits, then the algorithm would choose permutations with perfect uniformity.
		// This implementation traverses the list backwards, from the last element up to
		// the second, repeatedly swapping a randomly selected element into the current
		// position. Elements are randomly selected from the portion of the list that
		// runs from the first element to the current position, inclusive. This method
		// runs in linear time. If the specified list does not implement the
		// RandomAccess interface and is large, this implementation dumps the specified
		// list into an array before shuffling it, and dumps the shuffled array back
		// into the list. This avoids the quadratic behavior that would result from
		// shuffling a sequential access list in place.";
		String str = "the the the the, hallo. hallo hi the halo. alo sugalle sugalle nthaan nthaan";
		String str1 = str.replaceAll("\\.", "");
		String str2 = str1.replaceAll("\\,", "");
		String par[] = str2.split("[ ]");
		for (String ch : par) {
			

			if (parmap.containsKey(ch)) {
				count = parmap.get(ch);
				parmap.put(ch, ++count);
			} else {
				parmap.put(ch,1);
			}
			if(parmap.put(ch, 0)!=null) {
				count=parmap.get(ch);
				parmap.put(ch, null);
			}

		}

		System.out.println(parmap);

	}
}
