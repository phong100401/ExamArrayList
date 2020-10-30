package ArrayExam;

import java.util.ArrayList;

public class MoiveList {
    private ArrayList<String> movieList = new ArrayList<>();

    public void addMovieItem(String item){
        movieList.add(item);
    }
    public void printMovieList(){
        System.out.println("You have"+movieList.size()+"items in your Movie list");
        for (int i = 0; i<movieList.size();i++){
            System.out.println((i+1)+", "+movieList.get(i));
        }
    }

    public void modifyMoiveItem(int position, String newItem){
        movieList.set(position, newItem);
        System.out.println("Movie item "+(position+1)+"has been modified.");
    }
    public String findItem(String searchItem){
        boolean exists = movieList.contains(searchItem);
        int position = movieList.indexOf(searchItem);
        if(position >= 0){
            return movieList.get(position);
        }
        return null;
    }

    public static void main(String[] args) {
        MoiveList list = new MoiveList();
        list.addMovieItem("Mắt Biếc");
        list.addMovieItem("Mắt Lé");
        list.addMovieItem("Mắt Xanh");
        list.addMovieItem("Mắt Đỏ");
        list.addMovieItem("Mắt Vàng");
        list.addMovieItem("Mắt Tím");
        list.addMovieItem("Mắt Cam");
        list.printMovieList();

        String search = list.findItem("Mắt Biếc");
        System.out.println(search);

        list.modifyMoiveItem(1,"Mắt đen");
        list.printMovieList();
    }
}
