/*
Készítsd el a Site (telek) nevű osztályt. Egy telek jellemzői, páros vagy páratlan oldalon található, (0 = páros oldal 1 = páratlan oldal),
a telek hossza méterben. Illetve egy Fence enum, ami a kerítés állapotát írja le. A kerités állapota lehet, PERFECT, NEED_UPGRADE, NO_FENCE.
(konstruktor, getterek)
Készítsd el a Street nevű osztályt, melyben eladott telkek listája található. Kezdetben ez egy üres lista.
Készíts egy sellSite(Site site) metódust, ami egy telek eladását reprezentálja, vagyis hozzádunk egy telket a listához.
Határozd meg az utoljára eladott telek (lista utolsó eleme) házszámát, ha tudjuk, hogy a telkeket a két oldalon egymás után adták el!
(páros oldalon kettőtől, páratlan oldalon 1-től indul a számozás)
pl:
0 10 PERFECT
0 7 NEED_UPGRADE
1 12 NEED_UPGRADE
0 9 PERFECT
0 11 NO_FENCE
1 13 PERFECT
A példában a házszámok rendre: 2,4,1,6,8,3
Készíts statisztikát, ami a kerítés állapota alapján visszaadja, hogy mennyi telket adtak el kerítésfajtánként! (Egy metódus legyen,
a visszatérési értéket ti döntitek el, de abból legyen egyértelmű, hogy melyikből mennyit adtak el.)
 */
package week12d2;

import java.util.ArrayList;
import java.util.List;

public class Street {

    private List<Site> soldSites = new ArrayList<>();

    public void sellSite(Site site) {
        soldSites.add(site);

    }

    public int lastSoldSite() {
        Site lastSite = soldSites.get(soldSites.size() - 1);
        int result = 0;
        for (Site site : soldSites) {
            if (lastSite.getEvenOdd() == site.getEvenOdd()) {
                result++;
            }
        }
        return lastSite.getEvenOdd() == 0 ? result * 2 : result * 2 - 1;
    }

    public List<FenceCondition> statOfFences() {
        List<FenceCondition> result = new ArrayList<>();
        for (Fence fence : Fence.values()) {
            int counter = 0;
            for (Site site : soldSites) {
                if (site.getFence() == fence) {
                    counter++;
                }
            }
            result.add(new FenceCondition(fence, counter));
        }
        return new ArrayList<>(result);
    }

    public List<FenceCondition> statOfFences2() { // nem jo, ha valtozik az enum, nem lesz automatikus
        List<FenceCondition> result = new ArrayList<>();
        int counterPerfect = 0;
        int counterUpdate = 0;
        int counterNoFence = 0;
        for (Site site : soldSites) {
            if (site.getFence() == Fence.PERFECT) {
                counterPerfect++;
            }
            if (site.getFence() == Fence.NEED_UPGRADE) {
                counterUpdate++;
            }
            if (site.getFence() == Fence.NO_FENCE) {
                counterNoFence++;
            }
        }
        result.add(new FenceCondition(Fence.PERFECT, counterPerfect));
        result.add(new FenceCondition(Fence.NEED_UPGRADE, counterUpdate));
        result.add(new FenceCondition(Fence.NO_FENCE, counterNoFence));
        return result;
    }

    public List<Site> getSoldSite() {
        return new ArrayList<>(soldSites);
    }

}
