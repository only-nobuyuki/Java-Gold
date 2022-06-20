package problem5._9;

public class PostalCode {

	private String code;
	private String prefectures;
	private String city;
	private String town;
	private String prefecturesByRomanAlphabet;
	private String cityByRomanAlphabet;
	private String townByRomanAlphabet;

	public PostalCode(String code, String prefectures, String city, String town, String prefecturesByRomanAlphabet,
			String cityByRomanAlphabet, String townByRomanAlphabet) {
		super();
		this.code = code;
		this.prefectures = prefectures;
		this.city = city;
		this.town = town;
		this.prefecturesByRomanAlphabet = prefecturesByRomanAlphabet;
		this.cityByRomanAlphabet = cityByRomanAlphabet;
		this.townByRomanAlphabet = townByRomanAlphabet;
	}

	@Override
	public String toString() {

		return code + " " + prefectures + " " + city + " " + town + " " + prefecturesByRomanAlphabet + " "
				+ cityByRomanAlphabet
				+ " " + townByRomanAlphabet;
	}
}
