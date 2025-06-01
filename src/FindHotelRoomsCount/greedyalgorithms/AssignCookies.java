package FindHotelRoomsCount.greedyalgorithms;

import java.util.Arrays;

//✅ 4. Assign Cookies to Children
//        (Greedy + Two Pointers)
//
//🧠 Intuition: Sort children and cookies, give smallest cookie that satisfies the child.

/**
 * 🧩 Greedy: Match smallest cookie to smallest possible child to save larger cookies.
 */
public class AssignCookies {

    public int assignCookies(int cookies[], int children[]){
        Arrays.sort(cookies);
        Arrays.sort(children);

        int i = 0, j = 0;

        while(i<cookies.length && j<children.length){
                  if(children[j]>= cookies[i]){
                              i++;
                              j++;
                  }
        }
        return i;

    }
}
