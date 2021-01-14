//A Series osztályban hozz létre egy calculateSeriesType() metódust, mely egész számok listáját kapja, és eldönti, hogy növekvő,
//csökkenő vagy össze-vissza sorozatról van-e szó! Feltétel, hogy a bemeneti lista nem tartalmaz egymás után egyenlő értékeket.
//Ha a lista üres, vagy csak egy elemből áll, dobj kivételt! Mivel térnél vissza?
package week06d03.senior;

import java.util.List;

public class Series {

    public SeriesType calculateSeriesType(List<Integer> numbers) {
        if (numbers == null || numbers.size() == 1) {
            throw new IllegalArgumentException("Invalis list!");
        }
        SeriesType type = numbers.get(0) < numbers.get(1) ? SeriesType.ASCENDING : SeriesType.DESCENDING;
        for (int i = 2; i < numbers.size(); i++) {
            if (numbers.get(i) > numbers.get(i - 1) && type == SeriesType.DESCENDING || numbers.get(i) < numbers.get(i - 1) && type == SeriesType.ASCENDING) {
                return type = SeriesType.OTHER;
            }
        }
        return type;
    }
}
