package sourcefu.lib;

import java.util.ArrayList;
import java.util.Random;

public class Logo {

    ArrayList<String> logos = new ArrayList<String>();
    
    public Logo() {
    	initialize();
    	System.out.println(randomize());
    }
    	
    	
    public void initialize() {	
    	String s0 = "";
    	
        String s1 = " _______  _______           _______  _______  _______  _______         \n"+
        		    "(  ____ \\(  ___  )|\\     /|(  ____ )(  ____ \\(  ____ \\(  ____ \\|\\     /|  \n"+
        		    "| (    \\/| (   ) || )   ( || (    )|| (    \\/| (    \\/| (    \\/| )   ( |  \n"+
        		    "| (_____ | |   | || |   | || (____)|| |      | (__    | (__    | |   | |  \n"+
        		    "(_____  )| |   | || |   | ||     __)| |      |  __)   |  __)   | |   | |  \n"+
        		    "      ) || |   | || |   | || (\\ (   | |      | (      | (      | |   | |  \n"+
        		    "/\\____) || (___) || (___) || ) \\ \\__| (____/\\| (____/\\| )      | (___) | \n"+
                    "\\_______)(_______)(_______)|/   \\__/(_______/(_______/|/       (_______)  \n" ;
        this.logos.add(s1);
        
        String s2 = "   .-'''-.     ,-----.      ___    _ .-------.        _______      .-''-.   ________   ___    _         \n" + 
        		"  / _     \\  .'  .-,  '.  .'   |  | ||  _ _   \\      /   __  \\   .'_ _   \\ |        |.'   |  | |        \n" + 
        		" (`' )/`--' / ,-.|  \\ _ \\ |   .'  | || ( ' )  |     | ,_/  \\__) / ( ` )   '|   .----'|   .'  | |        \n" + 
        		"(_ o _).   ;  \\  '_ /  | :.'  '_  | ||(_ o _) /   ,-./  )      . (_ o _)  ||  _|____ .'  '_  | |        \n" + 
        		" (_,_). '. |  _`,/ \\ _/  |'   ( \\.-.|| (_,_).' __ \\  '_ '`)    |  (_,_)___||_( )_   |'   ( \\.-.|        \n" + 
        		".---.  \\  :: (  '\\_/ \\   ;' (`. _` /||  |\\ \\  |  | > (_)  )  __'  \\   .---.(_ o._)__|' (`. _` /|        \n" + 
        		"\\    `-'  | \\ `\"/  \\  ) / | (_ (_) _)|  | \\ `'   /(  .  .-'_/  )\\  `-'    /|(_,_)    | (_ (_) _)        \n" + 
        		" \\       /   '. \\_/``\".'   \\ /  . \\ /|  |  \\    /  `-'`-'     /  \\       / |   |      \\ /  . \\ /        \n" + 
        		"  `-...-'      '-----'      ``-'`-'' ''-'   `'-'     `._____.'    `'-..-'  '---'       ``-'`-'' ";
        this.logos.add(s2); 
    }

    public String randomize () {
        Random random = new Random ();
        random.setSeed (System.currentTimeMillis ());
        int index = random.nextInt (this.logos.size ());
        return this.logos.get(index);
    }
/*


    logos.append("""
   .-'''-.     ,-----.      ___    _ .-------.        _______      .-''-.   ________   ___    _         
  / _     \  .'  .-,  '.  .'   |  | ||  _ _   \      /   __  \   .'_ _   \ |        |.'   |  | |        
 (`' )/`--' / ,-.|  \ _ \ |   .'  | || ( ' )  |     | ,_/  \__) / ( ` )   '|   .----'|   .'  | |        
(_ o _).   ;  \  '_ /  | :.'  '_  | ||(_ o _) /   ,-./  )      . (_ o _)  ||  _|____ .'  '_  | |        
 (_,_). '. |  _`,/ \ _/  |'   ( \.-.|| (_,_).' __ \  '_ '`)    |  (_,_)___||_( )_   |'   ( \.-.|        
.---.  \  :: (  '\_/ \   ;' (`. _` /||  |\ \  |  | > (_)  )  __'  \   .---.(_ o._)__|' (`. _` /|        
\    `-'  | \ `"/  \  ) / | (_ (_) _)|  | \ `'   /(  .  .-'_/  )\  `-'    /|(_,_)    | (_ (_) _)        
 \       /   '. \_/``".'   \ /  . \ /|  |  \    /  `-'`-'     /  \       / |   |      \ /  . \ /        
  `-...-'      '-----'      ``-'`-'' ''-'   `'-'     `._____.'    `'-..-'  '---'       ``-'`-'' """)


    print(color(random.choice(logos), random.randrange(31, 37)))
    print
    print(" SourceFu 0.01")
    print(" www.nowhere.org")
    print(" Copyright (c) 2017-infinite")
    print
    sys.stdout.flush()
	
	*/
	
}