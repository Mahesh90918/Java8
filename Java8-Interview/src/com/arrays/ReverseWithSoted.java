public class ReverseWithSoted {
	public static void main(String[] args) {
		Integer[] arr = { 123, 456, 789, 123 };

		List<Integer> asList = Arrays.asList(arr);
		System.out.println(asList);
		
		asList.stream().map(t -> {

			int rev = 0;
			while (t > 0) {
				rev = rev * 10 + t % 10;
				t = t / 10;
			}
			return rev;

		}).sorted().forEach(System.out::println);

	}
}
