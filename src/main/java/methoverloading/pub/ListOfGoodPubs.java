package methoverloading.pub;

import java.util.List;

public class ListOfGoodPubs {

    private List<Pub> goodPubs;

    public ListOfGoodPubs(List<Pub> goodPubs) {
        isEmpty(goodPubs);
        this.goodPubs = goodPubs;
    }

    public Pub findTheBest() {
        Pub bestPub = goodPubs.get(0);
        for (int i = 0; i < goodPubs.size(); i++) {
            if(goodPubs.get(i).getOpeningTime().isEarlier(bestPub.getOpeningTime())){
                bestPub=goodPubs.get(i);
            }
        }
        return bestPub;
    }

    private void isEmpty(List<Pub> goodPubs) {
        if (goodPubs == null || goodPubs.size() == 0) {
            throw new IllegalArgumentException("No list or it is empty");
        }
    }
}
