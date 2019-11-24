package tudelft.ghappy;

public class GHappy {

    public boolean gHappy(String str) {
        assert str!=null;
        boolean isHappy = false;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'g') {
                if (i > 0 && str.charAt(i-1) == 'g') { isHappy=true; continue;}
                if (i+1 < str.length() && str.charAt(i+1) == 'g') { isHappy=true; continue;}
                isHappy = false;
            }
        }

        return isHappy;

    }
}
