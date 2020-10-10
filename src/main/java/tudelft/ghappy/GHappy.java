package tudelft.ghappy;

public class GHappy {

    public boolean gHappy(String str) {
        assert str!=null;
        if ( str.length() == 1 )
            return false;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'g') {
                if(str.length() == 2){
                    if(str.charAt(i+1) == 'g'){
                        return true; }
                    else
                        return false;
                }
                if (i > 0 && str.charAt(i-1) == 'g') { continue; }
                if (i+1 < str.length() && str.charAt(i+1) == 'g') { continue; }
                return false;
            }
        }

        return true;

    }
}
