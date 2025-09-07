//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.List;
//
//public class SortStock {
//
//    private String name;
//    private int price;
//    private int stockLevel;
//    private int promotionStatus;
//
//
//    SortStock(String name, int price, int stockLevel, int promotionStatus){
//        this.name  = name;
//        this.price = price;
//        this.stockLevel = stockLevel;
//        this.promotionStatus = promotionStatus;
//    }
//
//    private void sortByPromotionStatus(SortStock [] sortStocks){
//        //can create a map and sort for promotionstatus
//        //promoted products
//        Arrays.sort(sortStocks, Comparator.comparingInt(p -> p.promotionStatus));
//    }
//
//    private void sortByPriceOnPromotedProducts(){
//
//    }
//
//    private void sortNonPromotedProducts(){
//
//    }
//
//    private int calculateSales(int demandFactor, int availability){
//        int canbeSold= 0;
//        if(demandFactor>availability){
//            canbeSold = demandFactor;
//        }
//        else if(demandFactor<availability){
//            canbeSold = availability;
//        }
//        return canbeSold;
//    }
//    public static void main(String args[]){
//        List<SortStock> products = new ArrayList<>();
//        products.add(new SortStock("Product A", 100, 50 , 1));
//        products.add(new SortStock("Product B", 50, 30 , 0));
//        products.add(new SortStock("Product C", 150, 20 , 1));
//        products.add(new SortStock("Product D", 120, 60 , 0));
//        products.add(new SortStock("Product E", 200, 10 , 1));
//
//        Arrays.sort(products, new Comparator<SortStock>(){
//
//        })
//    }
//}
