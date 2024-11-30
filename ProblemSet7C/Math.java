import java.util.ArrayList;

public class Math{
    public ArrayList<Integer> SofE(int n){
        ArrayList<Integer> all = new ArrayList();
        for(int i = 2; i <= n; i++){
            all.add(i);
        }
        int p = 2;
        while(p < n && all.indexOf(p) != all.size()-1){
            for(int i = all.indexOf(p)+1; i < all.size(); i++){
                if(all.get(i) % p == 0){
                    all.remove(i);
                    i--;
                }
            }
            p = all.get(all.indexOf(p) + 1);
        }
        return all;
    }
    
    public String GC(int n){
        ArrayList<Integer> SofE = SofE(n);
        String r = "";
        for(int i = 0; i < SofE.size(); i++){
            for(int j = i+1; j < SofE.size(); j++){
                if(SofE.get(i) + SofE.get(j) == n) 
                    r = SofE.get(i) + "+" + SofE.get(j);
            }
        }
        return r;
    }
    
    public ArrayList<Integer> AB(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> sum = new ArrayList();
        int len = 0;
        boolean ifa = false;
        if(a.size() > b.size()){
            len = b.size();
            ifa = true;
        }else if(b.size() < a.size()){
            len = a.size();
            ifa = false;
        }
        boolean inc = false;
        boolean inc1 = false;
        int x = 0;
        while(x < len){
            if(a.get(a.size()-x-1) + b.get(b.size()-x-1) + 1 > 9){
                inc = true;
            }else inc = false;
            if(inc){
                if(inc1){
                    sum.add(0, (a.get(a.size()-x-1) + b.get(b.size()-x-1) + 1)%10);
                }else 
                    sum.add(0, (a.get(a.size()-x-1) + b.get(b.size()-x-1))%10);
                inc1 = true;
            }else{
                if(inc1){
                    if(a.get(a.size()-x-1) + b.get(b.size()-x-1) + 1 > 9){
                        sum.add(0, (a.get(a.size()-x-1) + b.get(b.size()-x-1) + 1)%10);
                    }else{
                       sum.add(0, (a.get(a.size()-x-1) + b.get(b.size()-x-1)));
                       inc1 = false;
                    }
                }else
                    sum.add(0, a.get(a.size()-x-1) + b.get(b.size()-x-1));
            }
            x++;
        }
        if(a.size() == b.size() && inc) sum.add(0, 1);
        
        if(ifa){
            if(inc)sum.add(0, a.get(a.size()-len-1) + 1);
            else sum.add(0, a.get(a.size()-len-1));
            if(a.size()-len-2 > 1){
                for(int i = a.size()-len-2; i >= 0; i++){
                    sum.add(0, a.get(i));
                }
            }
        }else{
            if(inc) sum.add(0, b.get(b.size()-len-1) + 1);
            else sum.add(0, b.get(b.size()-len-1));
            if(b.size()-len-2 > 1){
                for(int i = b.size()-len-2; i >= 0; i++){
                    sum.add(0, b.get(i));
                }
            }
        }
        return sum;
    }
}
