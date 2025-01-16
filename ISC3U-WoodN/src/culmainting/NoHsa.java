
package culmainting;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
//import java.awt.Color;
import java.util.Scanner;

import javax.imageio.ImageIO;

import hsa_new.Console;
public class NoHsa {
	static Console c = new Console (40,150);
	//			static Console c = new Console (40,10);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/**
		Description: 
		Date: 2025-01-16
		@author Nathan Wood
		 */

		//Funky Variables
		int rounds = 0;

		//draw images 
		BufferedImage wordleFullKeyBoard = null;
		BufferedImage a = null;
		BufferedImage b = null;
		BufferedImage cc = null;
		BufferedImage d = null;
		BufferedImage ee = null;
		BufferedImage f = null;
		BufferedImage g = null;
		BufferedImage h = null;
		BufferedImage i = null;
		BufferedImage j = null;
		BufferedImage k = null;
		BufferedImage l = null;
		BufferedImage m = null;
		BufferedImage n = null;
		BufferedImage o = null;
		BufferedImage p = null;
		BufferedImage q = null;
		BufferedImage r = null;
		BufferedImage s = null;
		BufferedImage t = null;
		BufferedImage u = null;
		BufferedImage v = null;
		BufferedImage w = null;
		BufferedImage x = null;
		BufferedImage y = null;
		BufferedImage z = null;

		try {
			// These two lines load the image "robot.jpg" and give it the name "jpgImage"
			// Note that you have to include the package name in the file name when the image is in a folder
			wordleFullKeyBoard = ImageIO.read(new File("src/images/WordleFullKeyBoard.png"));
			a = ImageIO.read(new File("src/images/a.png"));
			b = ImageIO.read(new File("src/images/b.png"));
			cc = ImageIO.read(new File("src/images/c.png"));
			d = ImageIO.read(new File("src/images/d.png"));
			ee = ImageIO.read(new File("src/images/e.png"));
			f = ImageIO.read(new File("src/images/f.png"));
			g = ImageIO.read(new File("src/images/g.png"));
			h = ImageIO.read(new File("src/images/h.png"));
			i = ImageIO.read(new File("src/images/i.png"));
			j = ImageIO.read(new File("src/images/j.png"));
			k = ImageIO.read(new File("src/images/k.png"));
			l = ImageIO.read(new File("src/images/l.png"));
			m = ImageIO.read(new File("src/images/m.png"));
			n = ImageIO.read(new File("src/images/n.png"));
			o = ImageIO.read(new File("src/images/o.png"));
			p = ImageIO.read(new File("src/images/p.png"));
			q = ImageIO.read(new File("src/images/q.png"));
			r = ImageIO.read(new File("src/images/r.png"));
			s = ImageIO.read(new File("src/images/s.png"));
			t = ImageIO.read(new File("src/images/t.png"));
			u = ImageIO.read(new File("src/images/u.png"));
			v = ImageIO.read(new File("src/images/v.png"));
			w = ImageIO.read(new File("src/images/w.png"));
			x = ImageIO.read(new File("src/images/x.png"));
			y = ImageIO.read(new File("src/images/y.png"));
			z = ImageIO.read(new File("src/images/z.png"));



		} catch (IOException e) {
			System.err.println("There was an error loading the image.");
			e.printStackTrace(); //prints the error and line of code

		}

		
		
		//Wordlist
		String[]backupWords = {"ABACK","ABASE","ABATE","ABBEY","ABIDE","ABOUT","ABOVE","ABYSS","ACORN","ACRID","ACTOR","ACUTE","ADAGE","ADAPT","ADMIT","ADOBE","ADOPT","ADORE","ADULT","AFFIX","AFTER","AGAIN","AGAPE","AGATE","AGENT","AGILE","AGING","AGLOW","AGONY","AGREE","AHEAD","AISLE","ALBUM","ALIEN","ALIKE","ALIVE","ALLOW","ALOFT","ALONE","ALOOF","ALOUD","ALPHA","ALTAR","ALTER","AMASS","AMBER","AMISS","AMPLE","ANGEL","ANGER","ANGRY","ANGST","ANODE","ANTIC","ANVIL","AORTA","APART","APHID","APPLE","APPLY","APRON","APTLY","ARBOR","ARDOR","ARGUE","AROMA","ASCOT","ASIDE","ASKEW","ASSET","ATOLL","ATONE","AUDIO","AUDIT","AVAIL","AVERT","AWAIT","AWAKE","AWASH","AWFUL","AXIOM","AZURE","BACON","BADGE","BADLY","BAGEL","BAKER","BALSA","BANAL","BARGE","BASIC","BASIN","BATHE","BATON","BATTY","BAWDY","BAYOU","BEACH","BEADY","BEAST","BEAUT","BEEFY","BEGET","BEGIN","BEING","BELCH","BELIE","BELLY","BELOW","BENCH","BERET","BERTH","BESET","BEVEL","BINGE","BIOME","BIRCH","BIRTH","BLACK","BLADE","BLAME","BLAND","BLARE","BLAZE","BLEAK","BLEED","BLEEP","BLIMP","BLOCK","BLOKE","BLOND","BLOWN","BLUFF","BLURB","BLURT","BLUSH","BOAST","BOOBY","BOOST","BOOZE","BOOZY","BORAX","BOSSY","BOUGH","BOXER","BRACE","BRAID","BRAIN","BRAKE","BRASH","BRASS","BRAVE","BRAVO","BRAWN","BREAD","BREAK","BREED","BRIAR","BRIBE","BRIDE","BRIEF","BRINE","BRING","BRINK","BRINY","BRISK","BROAD","BROKE","BROOK","BROOM","BROTH","BROWN","BRUSH","BRUTE","BUDDY","BUGGY","BUGLE","BUILD","BUILT","BULKY","BULLY","BUNCH","BURLY","CABLE","CACAO","CACHE","CADET","CAMEL","CAMEO","CANDY","CANNY","CANOE","CANON","CAPER","CARAT","CARGO","CAROL","CARRY","CARVE","CATCH","CATER","CAULK","CAUSE","CEDAR","CHAFE","CHAIN","CHALK","CHAMP","CHANT","CHAOS","CHARD","CHARM","CHART","CHEAP","CHEAT","CHEEK","CHEER","CHEST","CHIEF","CHILD","CHILL","CHIME","CHOCK","CHOIR","CHOKE","CHORD","CHOSE","CHUNK","CHUTE","CIDER","CIGAR","CINCH","CIRCA","CIVIC","CLASS","CLEAN","CLEAR","CLEFT","CLERK","CLICK","CLIMB","CLING","CLOCK","CLONE","CLOSE","CLOTH","CLOUD","CLOWN","CLUCK","COACH","COAST","COCOA","COLON","COMET","COMMA","CONDO","CONIC","CORER","CORNY","COULD","COUNT","COURT","COVER","COVET","COWER","COYLY","CRAFT","CRAMP","CRANE","CRANK","CRASS","CRATE","CRAVE","CRAZE","CRAZY","CREAK","CREDO","CREPT","CRIME","CRIMP","CROAK","CRONE","CROSS","CROWD","CROWN","CRUMB","CRUSH","CRUST","CRYPT","CUMIN","CURLY","CYBER","CYNIC","DADDY","DAISY","DANCE","DANDY","DEATH","DEBIT","DEBUG","DEBUT","DECAL","DECAY","DECOY","DECRY","DELAY","DELTA","DELVE","DENIM","DEPOT","DEPTH","DETER","DEVIL","DIARY","DICEY","DIGIT","DINER","DINGO","DISCO","DITTO","DODGE","DOGMA","DOING","DOLLY","DONOR","DONUT","DOUBT","DOWRY","DOZEN","DRAIN","DRAWN","DREAM","DRINK","DRIVE","DROLL","DROOL","DROOP","DROVE","DUCHY","DUTCH","DUVET","DWARF","DWELL","DWELT","EAGLE","EARLY","EARTH","EASEL","EBONY","EDICT","EGRET","EJECT","ELDER","ELOPE","ELUDE","EMAIL","EMBER","EMPTY","ENACT","ENDOW","ENEMA","ENJOY","ENNUI","ENSUE","ENTER","EPOCH","EPOXY","EQUAL","EQUIP","ERODE","ERROR","ERUPT","ESSAY","ETHER","ETHIC","ETHOS","EVADE","EVENT","EVERY","EVOKE","EXACT","EXALT","EXCEL","EXERT","EXIST","EXPEL","EXTRA","EXULT","FACET","FAINT","FAITH","FARCE","FAULT","FAVOR","FEAST","FEIGN","FERAL","FERRY","FEWER","FIBER","FIELD","FIEND","FIFTY","FILET","FINAL","FINCH","FINER","FIRST","FISHY","FIXER","FJORD","FLAIL","FLAIR","FLAKE","FLAME","FLANK","FLARE","FLASH","FLASK","FLESH","FLICK","FLING","FLIRT","FLOAT","FLOCK","FLOOD","FLOOR","FLORA","FLOSS","FLOUR","FLOUT","FLOWN","FLUFF","FLUME","FLUNG","FLUNK","FLYER","FOCAL","FOCUS","FOGGY","FOLLY","FORAY","FORCE","FORGE","FORGO","FORTE","FORTH","FORTY","FOUND","FOYER","FRAIL","FRAME","FRANK","FRESH","FRIED","FROCK","FROND","FRONT","FROST","FROTH","FROWN","FROZE","FULLY","FUNGI","FUNKY","FUNNY","GAMER","GAMMA","GAMUT","GAUDY","GAUNT","GAUZE","GAWKY","GECKO","GENRE","GHOUL","GIANT","GIDDY","GIRTH","GIVEN","GLASS","GLAZE","GLEAM","GLEAN","GLIDE","GLOAT","GLOBE","GLOOM","GLORY","GLOVE","GLYPH","GNASH","GOING","GOLEM","GONER","GOOFY","GOOSE","GORGE","GOUGE","GRACE","GRADE","GRAIL","GRAIN","GRAND","GRANT","GRAPH","GRASP","GRATE","GREAT","GREEN","GREET","GRIEF","GRIME","GRIMY","GRIND","GRIPE","GROIN","GROOM","GROUP","GROUT","GROVE","GROWL","GRUEL","GUANO","GUARD","GUEST","GUIDE","GUILD","GUILE","GULLY","GUMMY","GUPPY","GUSTY","HAIRY","HALVE","HANDY","HAPPY","HARSH","HATCH","HATER","HAVOC","HEADY","HEARD","HEART","HEATH","HEAVE","HEAVY","HEFTY","HEIST","HELIX","HELLO","HENCE","HERON","HILLY","HINGE","HIPPO","HITCH","HOARD","HOBBY","HOMER","HONEY","HORDE","HORSE","HOTEL","HOUND","HOUSE","HOWDY","HUMAN","HUMID","HUMOR","HUMPH","HUNCH","HUNKY","HURRY","HUTCH","HYENA","HYPER","IGLOO","IMAGE","IMPEL","INANE","INDEX","INEPT","INERT","INFER","INLAY","INNER","INPUT","INTER","INTRO","IONIC","IRATE","IRONY","ISLET","ITCHY","IVORY","JAUNT","JAZZY","JELLY","JERKY","JIFFY","JOINT","JOKER","JOLLY","JOUST","JUDGE","JUICE","KARMA","KAYAK","KAZOO","KEBAB","KHAKI","KIOSK","KNAVE","KNEAD","KNEEL","KNELT","KNOCK","KNOLL","KOALA","LABEL","LABOR","LAGER","LANKY","LAPEL","LAPSE","LARGE","LARVA","LASER","LATTE","LAYER","LEAFY","LEAKY","LEAPT","LEARN","LEASH","LEAVE","LEDGE","LEECH","LEERY","LEGGY","LEMON","LEMUR","LIBEL","LIGHT","LILAC","LIMIT","LINEN","LINER","LINGO","LITHE","LIVER","LOCAL","LOCUS","LOFTY","LOGIC","LOOPY","LOSER","LOUSE","LOVER","LOWER","LOWLY","LOYAL","LUCID","LUCKY","LUNAR","LUNCH","LUNGE","LUSTY","LYING","MACAW","MADAM","MAGIC","MAGMA","MAIZE","MAJOR","MAMBO","MANIA","MANGA","MANLY","MANOR","MAPLE","MARCH","MARRY","MARSH","MASON","MASSE","MATCH","MATEY","MAUVE","MAXIM","MAYBE","MAYOR","MEALY","MEANT","MEDAL","MEDIA","MEDIC","MELON","MERCY","MERGE","MERIT","MERRY","METAL","METER","METRO","MICRO","MIDGE","MIDST","MIMIC","MINCE","MINER","MINUS","MODEL","MODEM","MOIST","MOLAR","MOMMY","MONEY","MONTH","MOOSE","MOSSY","MOTOR","MOTTO","MOULT","MOUNT","MOURN","MOUSE","MOVIE","MUCKY","MULCH","MUMMY","MURAL","MUSHY","MUSIC","MUSTY","NAIVE","NANNY","NASTY","NATAL","NAVAL","NEEDY","NEIGH","NERDY","NERVE","NEVER","NICER","NICHE","NIGHT","NINJA","NINTH","NOBLE","NOISE","NORTH","NYMPH","OCCUR","OCEAN","OCTET","OFFAL","OFTEN","OLDER","OLIVE","ONION","ONSET","OPERA","ORDER","ORGAN","OTHER","OUGHT","OUNCE","OUTDO","OUTER","OVERT","OWNER","OXIDE","PAINT","PANEL","PANIC","PAPAL","PAPER","PARER","PARRY","PARTY","PASTA","PATIO","PATTY","PAUSE","PEACE","PEACH","PEARL","PENNE","PERCH","PERKY","PESKY","PHASE","PHONE","PHONY","PHOTO","PIANO","PICKY","PIETY","PILOT","PINCH","PINEY","PINKY","PINTO","PIOUS","PIPER","PIQUE","PITHY","PIXEL","PIXIE","PLACE","PLAIT","PLANK","PLANT","PLATE","PLAZA","PLEAT","PLUCK","PLUMB","PLUNK","POINT","POISE","POKER","POLKA","POLYP","PORCH","POUND","POWER","PRESS","PRICE","PRICK","PRIDE","PRIME","PRIMO","PRIMP","PRINT","PRIOR","PRIZE","PROBE","PRONE","PRONG","PROUD","PROVE","PROWL","PROXY","PRUNE","PSALM","PULPY","PURGE","QUALM","QUART","QUEEN","QUERY","QUEST","QUEUE","QUICK","QUIET","QUIRK","QUITE","QUOTE","RADIO","RAINY","RAISE","RAMEN","RANCH","RANGE","RATIO","RAYON","REACT","READY","REALM","REBEL","REBUS","REBUT","RECAP","RECUR","REFER","REGAL","RELAX","RELIC","RENEW","REPAY","REPEL","RERUN","RESIN","RETCH","RETRO","RETRY","REVEL","RHINO","RHYME","RIDER","RIDGE","RIGHT","RIPER","RISEN","RIVAL","ROBIN","ROBOT","ROCKY","RODEO","ROGUE","ROOMY","ROUGE","ROUND","ROUSE","ROUTE","ROVER","ROYAL","RUDDY","RUDER","RUPEE","RUSTY","SAINT","SALAD","SALLY","SALSA","SALTY","SANDY","SASSY","SAUCY","SAUNA","SAUTE","SAVOR","SCALD","SCALE","SCANT","SCARE","SCARF","SCENT","SCOFF","SCOLD","SCONE","SCOPE","SCORN","SCOUR","SCOUT","SCOWL","SCRAM","SCRAP","SCRUB","SEDAN","SEEDY","SENSE","SERUM","SERVE","SEVEN","SEVER","SHADE","SHAFT","SHAKE","SHAKY","SHALL","SHAME","SHANK","SHAPE","SHARD","SHARE","SHARP","SHAVE","SHAWL","SHELL","SHIFT","SHINE","SHIRE","SHIRK","SHORE","SHORN","SHOUT","SHOVE","SHOWN","SHOWY","SHRUB","SHRUG","SHYLY","SIEGE","SIGHT","SINCE","SISSY","SIXTH","SKATE","SKIER","SKIFF","SKILL","SKIMP","SKIRT","SKUNK","SLANG","SLATE","SLEEK","SLEEP","SLICE","SLOPE","SLOSH","SLOTH","SLUMP","SLUNG","SMALL","SMART","SMASH","SMEAR","SMELT","SMILE","SMIRK","SMITE","SMITH","SMOCK","SMOKE","SNACK","SNAFU","SNAIL","SNAKE","SNAKY","SNARE","SNARL","SNEAK","SNOOP","SNORT","SNOUT","SOGGY","SOLAR","SOLID","SOLVE","SONIC","SOUND","SOWER","SPACE","SPADE","SPEAK","SPECK","SPELL","SPELT","SPEND","SPENT","SPICE","SPICY","SPIEL","SPIKE","SPILL","SPINE","SPIRE","SPLAT","SPOKE","SPOON","SPOUT","SPRAY","SPURT","SQUAD","SQUAT","STAFF","STAGE","STAID","STAIN","STAIR","STAKE","STALE","STALL","STAND","STARE","STARK","START","STASH","STATE","STEAD","STEAM","STEED","STEEL","STEIN","STERN","STICK","STIFF","STILL","STING","STINK","STINT","STOCK","STOIC","STOLE","STOMP","STONE","STONY","STOOL","STORE","STORM","STORY","STOUT","STOVE","STRAP","STRAW","STRAY","STUDY","STUNG","STYLE","SUGAR","SULKY","SUPER","SURER","SURLY","SUSHI","SWEAT","SWEEP","SWEET","SWELL","SWILL","SWINE","SWIRL","SWISH","SWOON","SWUNG","SYRUP","TABLE","TABOO","TACIT","TACKY","TAKEN","TALLY","TALON","TANGY","TAPER","TAPIR","TARDY","TASTE","TASTY","TAUNT","TAWNY","TEACH","TEARY","TEASE","TEMPO","TENTH","TEPID","TERSE","THANK","THEIR","THEME","THERE","THESE","THIEF","THIGH","THING","THINK","THIRD","THORN","THOSE","THREE","THREW","THROW","THUMB","THUMP","THYME","TIARA","TIBIA","TIDAL","TIGER","TILDE","TIPSY","TITAN","TITHE","TITLE","TODAY","TONIC","TOPAZ","TOPIC","TORCH","TORSO","TOTEM","TOUCH","TOUGH","TOWEL","TOXIC","TOXIN","TRACE","TRACT","TRADE","TRAIN","TRAIT","TRASH","TRAWL","TREAT","TREND","TRIAD","TRICE", "TRIED" ,"TRITE","TROLL","TROPE","TROVE","TRULY","TRUSS","TRUST","TRUTH","TRYST","TUTOR","TUNIC","TWANG","TWEAK","TWEED","TWICE","TWINE","TWIRL","TWIST","ULCER","ULTRA","UNCLE","UNDER","UNDUE","UNFED","UNFIT","UNIFY","UNITE","UNLIT","UNMET","UNTIE","UNTIL","UNZIP","UPSET","URBAN","USAGE","USHER","USING","USUAL","USURP","UTTER","UVULA","VAGUE","VALET","VALID","VALUE","VAPID","VAULT","VENOM","VERGE","VERVE","VIDEO","VIGOR","VINYL","VIOLA","VIRAL","VISOR","VITAL","VIVID","VODKA","VOICE","VOILA","VOTER","VOUCH","VYING","WACKY","WAGON","WALTZ","WASTE","WATCH","WEARY","WEDGE","WEIRD","WHACK","WHALE","WHEEL","WHELP","WHERE","WHICH","WHIFF","WHILE","WHINE","WHINY","WHIRL","WHISK","WHOOP","WIDEN","WINCE","WINDY","WITCH","WOKEN","WOMAN","WOOER","WORDY","WORLD","WORRY","WORSE","WORST","WOULD","WOVEN","WRATH","WREAK","WRIST","WRITE","WRONG","WROTE","WRUNG","YACHT","YEARN","YIELD","YOUNG","YOUTH","ZEBRA","ZESTY"};;
		ArrayList<String> wordList = new ArrayList<String>(Arrays.asList(backupWords));


		Scanner fsc;
		File file = new File("src/images/Words.txt");
		try {
			fsc = new Scanner(file);
			wordList.clear();
			while (fsc.hasNextLine()) {
				wordList.add(fsc.nextLine());
			}


		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			

		}
		//Answer List
		String[]backupAnswers = {"ABACK","ABASE","ABATE","ABBEY","ABIDE","ABOUT","ABOVE","ABYSS","ACORN","ACRID","ACTOR","ACUTE","ADAGE","ADAPT","ADMIT","ADOBE","ADOPT","ADORE","ADULT","AFFIX","AFTER","AGAIN","AGAPE","AGATE","AGENT","AGILE","AGING","AGLOW","AGONY","AGREE","AHEAD","AISLE","ALBUM","ALIEN","ALIKE","ALIVE","ALLOW","ALOFT","ALONE","ALOOF","ALOUD","ALPHA","ALTAR","ALTER","AMASS","AMBER","AMISS","AMPLE","ANGEL","ANGER","ANGRY","ANGST","ANODE","ANTIC","ANVIL","AORTA","APART","APHID","APPLE","APPLY","APRON","APTLY","ARBOR","ARDOR","ARGUE","AROMA","ASCOT","ASIDE","ASKEW","ASSET","ATOLL","ATONE","AUDIO","AUDIT","AVAIL","AVERT","AWAIT","AWAKE","AWASH","AWFUL","AXIOM","AZURE","BACON","BADGE","BADLY","BAGEL","BAKER","BALSA","BANAL","BARGE","BASIC","BASIN","BATHE","BATON","BATTY","BAWDY","BAYOU","BEACH","BEADY","BEAST","BEAUT","BEEFY","BEGET","BEGIN","BEING","BELCH","BELIE","BELLY","BELOW","BENCH","BERET","BERTH","BESET","BEVEL","BINGE","BIOME","BIRCH","BIRTH","BLACK","BLADE","BLAME","BLAND","BLARE","BLAZE","BLEAK","BLEED","BLEEP","BLIMP","BLOCK","BLOKE","BLOND","BLOWN","BLUFF","BLURB","BLURT","BLUSH","BOAST","BOOBY","BOOST","BOOZE","BOOZY","BORAX","BOSSY","BOUGH","BOXER","BRACE","BRAID","BRAIN","BRAKE","BRASH","BRASS","BRAVE","BRAVO","BRAWN","BREAD","BREAK","BREED","BRIAR","BRIBE","BRIDE","BRIEF","BRINE","BRING","BRINK","BRINY","BRISK","BROAD","BROKE","BROOK","BROOM","BROTH","BROWN","BRUSH","BRUTE","BUDDY","BUGGY","BUGLE","BUILD","BUILT","BULKY","BULLY","BUNCH","BURLY","CABLE","CACAO","CACHE","CADET","CAMEL","CAMEO","CANDY","CANNY","CANOE","CANON","CAPER","CARAT","CARGO","CAROL","CARRY","CARVE","CATCH","CATER","CAULK","CAUSE","CEDAR","CHAFE","CHAIN","CHALK","CHAMP","CHANT","CHAOS","CHARD","CHARM","CHART","CHEAP","CHEAT","CHEEK","CHEER","CHEST","CHIEF","CHILD","CHILL","CHIME","CHOCK","CHOIR","CHOKE","CHORD","CHOSE","CHUNK","CHUTE","CIDER","CIGAR","CINCH","CIRCA","CIVIC","CLASS","CLEAN","CLEAR","CLEFT","CLERK","CLICK","CLIMB","CLING","CLOCK","CLONE","CLOSE","CLOTH","CLOUD","CLOWN","CLUCK","COACH","COAST","COCOA","COLON","COMET","COMMA","CONDO","CONIC","CORER","CORNY","COULD","COUNT","COURT","COVER","COVET","COWER","COYLY","CRAFT","CRAMP","CRANE","CRANK","CRASS","CRATE","CRAVE","CRAZE","CRAZY","CREAK","CREDO","CREPT","CRIME","CRIMP","CROAK","CRONE","CROSS","CROWD","CROWN","CRUMB","CRUSH","CRUST","CRYPT","CUMIN","CURLY","CYBER","CYNIC","DADDY","DAISY","DANCE","DANDY","DEATH","DEBIT","DEBUG","DEBUT","DECAL","DECAY","DECOY","DECRY","DELAY","DELTA","DELVE","DENIM","DEPOT","DEPTH","DETER","DEVIL","DIARY","DICEY","DIGIT","DINER","DINGO","DISCO","DITTO","DODGE","DOGMA","DOING","DOLLY","DONOR","DONUT","DOUBT","DOWRY","DOZEN","DRAIN","DRAWN","DREAM","DRINK","DRIVE","DROLL","DROOL","DROOP","DROVE","DUCHY","DUTCH","DUVET","DWARF","DWELL","DWELT","EAGLE","EARLY","EARTH","EASEL","EBONY","EDICT","EGRET","EJECT","ELDER","ELOPE","ELUDE","EMAIL","EMBER","EMPTY","ENACT","ENDOW","ENEMA","ENJOY","ENNUI","ENSUE","ENTER","EPOCH","EPOXY","EQUAL","EQUIP","ERODE","ERROR","ERUPT","ESSAY","ETHER","ETHIC","ETHOS","EVADE","EVENT","EVERY","EVOKE","EXACT","EXALT","EXCEL","EXERT","EXIST","EXPEL","EXTRA","EXULT","FACET","FAINT","FAITH","FARCE","FAULT","FAVOR","FEAST","FEIGN","FERAL","FERRY","FEWER","FIBER","FIELD","FIEND","FIFTY","FILET","FINAL","FINCH","FINER","FIRST","FISHY","FIXER","FJORD","FLAIL","FLAIR","FLAKE","FLAME","FLANK","FLARE","FLASH","FLASK","FLESH","FLICK","FLING","FLIRT","FLOAT","FLOCK","FLOOD","FLOOR","FLORA","FLOSS","FLOUR","FLOUT","FLOWN","FLUFF","FLUME","FLUNG","FLUNK","FLYER","FOCAL","FOCUS","FOGGY","FOLLY","FORAY","FORCE","FORGE","FORGO","FORTE","FORTH","FORTY","FOUND","FOYER","FRAIL","FRAME","FRANK","FRESH","FRIED","FROCK","FROND","FRONT","FROST","FROTH","FROWN","FROZE","FULLY","FUNGI","FUNKY","FUNNY","GAMER","GAMMA","GAMUT","GAUDY","GAUNT","GAUZE","GAWKY","GECKO","GENRE","GHOUL","GIANT","GIDDY","GIRTH","GIVEN","GLASS","GLAZE","GLEAM","GLEAN","GLIDE","GLOAT","GLOBE","GLOOM","GLORY","GLOVE","GLYPH","GNASH","GOING","GOLEM","GONER","GOOFY","GOOSE","GORGE","GOUGE","GRACE","GRADE","GRAIL","GRAIN","GRAND","GRANT","GRAPH","GRASP","GRATE","GREAT","GREEN","GREET","GRIEF","GRIME","GRIMY","GRIND","GRIPE","GROIN","GROOM","GROUP","GROUT","GROVE","GROWL","GRUEL","GUANO","GUARD","GUEST","GUIDE","GUILD","GUILE","GULLY","GUMMY","GUPPY","GUSTY","HAIRY","HALVE","HANDY","HAPPY","HARSH","HATCH","HATER","HAVOC","HEADY","HEARD","HEART","HEATH","HEAVE","HEAVY","HEFTY","HEIST","HELIX","HELLO","HENCE","HERON","HILLY","HINGE","HIPPO","HITCH","HOARD","HOBBY","HOMER","HONEY","HORDE","HORSE","HOTEL","HOUND","HOUSE","HOWDY","HUMAN","HUMID","HUMOR","HUMPH","HUNCH","HUNKY","HURRY","HUTCH","HYENA","HYPER","IGLOO","IMAGE","IMPEL","INANE","INDEX","INEPT","INERT","INFER","INLAY","INNER","INPUT","INTER","INTRO","IONIC","IRATE","IRONY","ISLET","ITCHY","IVORY","JAUNT","JAZZY","JELLY","JERKY","JIFFY","JOINT","JOKER","JOLLY","JOUST","JUDGE","JUICE","KARMA","KAYAK","KAZOO","KEBAB","KHAKI","KIOSK","KNAVE","KNEAD","KNEEL","KNELT","KNOCK","KNOLL","KOALA","LABEL","LABOR","LAGER","LANKY","LAPEL","LAPSE","LARGE","LARVA","LASER","LATTE","LAYER","LEAFY","LEAKY","LEAPT","LEARN","LEASH","LEAVE","LEDGE","LEECH","LEERY","LEGGY","LEMON","LEMUR","LIBEL","LIGHT","LILAC","LIMIT","LINEN","LINER","LINGO","LITHE","LIVER","LOCAL","LOCUS","LOFTY","LOGIC","LOOPY","LOSER","LOUSE","LOVER","LOWER","LOWLY","LOYAL","LUCID","LUCKY","LUNAR","LUNCH","LUNGE","LUSTY","LYING","MACAW","MADAM","MAGIC","MAGMA","MAIZE","MAJOR","MAMBO","MANIA","MANGA","MANLY","MANOR","MAPLE","MARCH","MARRY","MARSH","MASON","MASSE","MATCH","MATEY","MAUVE","MAXIM","MAYBE","MAYOR","MEALY","MEANT","MEDAL","MEDIA","MEDIC","MELON","MERCY","MERGE","MERIT","MERRY","METAL","METER","METRO","MICRO","MIDGE","MIDST","MIMIC","MINCE","MINER","MINUS","MODEL","MODEM","MOIST","MOLAR","MOMMY","MONEY","MONTH","MOOSE","MOSSY","MOTOR","MOTTO","MOULT","MOUNT","MOURN","MOUSE","MOVIE","MUCKY","MULCH","MUMMY","MURAL","MUSHY","MUSIC","MUSTY","NAIVE","NANNY","NASTY","NATAL","NAVAL","NEEDY","NEIGH","NERDY","NERVE","NEVER","NICER","NICHE","NIGHT","NINJA","NINTH","NOBLE","NOISE","NORTH","NYMPH","OCCUR","OCEAN","OCTET","OFFAL","OFTEN","OLDER","OLIVE","ONION","ONSET","OPERA","ORDER","ORGAN","OTHER","OUGHT","OUNCE","OUTDO","OUTER","OVERT","OWNER","OXIDE","PAINT","PANEL","PANIC","PAPAL","PAPER","PARER","PARRY","PARTY","PASTA","PATIO","PATTY","PAUSE","PEACE","PEACH","PEARL","PENNE","PERCH","PERKY","PESKY","PHASE","PHONE","PHONY","PHOTO","PIANO","PICKY","PIETY","PILOT","PINCH","PINEY","PINKY","PINTO","PIOUS","PIPER","PIQUE","PITHY","PIXEL","PIXIE","PLACE","PLAIT","PLANK","PLANT","PLATE","PLAZA","PLEAT","PLUCK","PLUMB","PLUNK","POINT","POISE","POKER","POLKA","POLYP","PORCH","POUND","POWER","PRESS","PRICE","PRICK","PRIDE","PRIME","PRIMO","PRIMP","PRINT","PRIOR","PRIZE","PROBE","PRONE","PRONG","PROUD","PROVE","PROWL","PROXY","PRUNE","PSALM","PULPY","PURGE","QUALM","QUART","QUEEN","QUERY","QUEST","QUEUE","QUICK","QUIET","QUIRK","QUITE","QUOTE","RADIO","RAINY","RAISE","RAMEN","RANCH","RANGE","RATIO","RAYON","REACT","READY","REALM","REBEL","REBUS","REBUT","RECAP","RECUR","REFER","REGAL","RELAX","RELIC","RENEW","REPAY","REPEL","RERUN","RESIN","RETCH","RETRO","RETRY","REVEL","RHINO","RHYME","RIDER","RIDGE","RIGHT","RIPER","RISEN","RIVAL","ROBIN","ROBOT","ROCKY","RODEO","ROGUE","ROOMY","ROUGE","ROUND","ROUSE","ROUTE","ROVER","ROYAL","RUDDY","RUDER","RUPEE","RUSTY","SAINT","SALAD","SALLY","SALSA","SALTY","SANDY","SASSY","SAUCY","SAUNA","SAUTE","SAVOR","SCALD","SCALE","SCANT","SCARE","SCARF","SCENT","SCOFF","SCOLD","SCONE","SCOPE","SCORN","SCOUR","SCOUT","SCOWL","SCRAM","SCRAP","SCRUB","SEDAN","SEEDY","SENSE","SERUM","SERVE","SEVEN","SEVER","SHADE","SHAFT","SHAKE","SHAKY","SHALL","SHAME","SHANK","SHAPE","SHARD","SHARE","SHARP","SHAVE","SHAWL","SHELL","SHIFT","SHINE","SHIRE","SHIRK","SHORE","SHORN","SHOUT","SHOVE","SHOWN","SHOWY","SHRUB","SHRUG","SHYLY","SIEGE","SIGHT","SINCE","SISSY","SIXTH","SKATE","SKIER","SKIFF","SKILL","SKIMP","SKIRT","SKUNK","SLANG","SLATE","SLEEK","SLEEP","SLICE","SLOPE","SLOSH","SLOTH","SLUMP","SLUNG","SMALL","SMART","SMASH","SMEAR","SMELT","SMILE","SMIRK","SMITE","SMITH","SMOCK","SMOKE","SNACK","SNAFU","SNAIL","SNAKE","SNAKY","SNARE","SNARL","SNEAK","SNOOP","SNORT","SNOUT","SOGGY","SOLAR","SOLID","SOLVE","SONIC","SOUND","SOWER","SPACE","SPADE","SPEAK","SPECK","SPELL","SPELT","SPEND","SPENT","SPICE","SPICY","SPIEL","SPIKE","SPILL","SPINE","SPIRE","SPLAT","SPOKE","SPOON","SPOUT","SPRAY","SPURT","SQUAD","SQUAT","STAFF","STAGE","STAID","STAIN","STAIR","STAKE","STALE","STALL","STAND","STARE","STARK","START","STASH","STATE","STEAD","STEAM","STEED","STEEL","STEIN","STERN","STICK","STIFF","STILL","STING","STINK","STINT","STOCK","STOIC","STOLE","STOMP","STONE","STONY","STOOL","STORE","STORM","STORY","STOUT","STOVE","STRAP","STRAW","STRAY","STUDY","STUNG","STYLE","SUGAR","SULKY","SUPER","SURER","SURLY","SUSHI","SWEAT","SWEEP","SWEET","SWELL","SWILL","SWINE","SWIRL","SWISH","SWOON","SWUNG","SYRUP","TABLE","TABOO","TACIT","TACKY","TAKEN","TALLY","TALON","TANGY","TAPER","TAPIR","TARDY","TASTE","TASTY","TAUNT","TAWNY","TEACH","TEARY","TEASE","TEMPO","TENTH","TEPID","TERSE","THANK","THEIR","THEME","THERE","THESE","THIEF","THIGH","THING","THINK","THIRD","THORN","THOSE","THREE","THREW","THROW","THUMB","THUMP","THYME","TIARA","TIBIA","TIDAL","TIGER","TILDE","TIPSY","TITAN","TITHE","TITLE","TODAY","TONIC","TOPAZ","TOPIC","TORCH","TORSO","TOTEM","TOUCH","TOUGH","TOWEL","TOXIC","TOXIN","TRACE","TRACT","TRADE","TRAIN","TRAIT","TRASH","TRAWL","TREAT","TREND","TRIAD","TRICE", "TRIED" ,"TRITE","TROLL","TROPE","TROVE","TRULY","TRUSS","TRUST","TRUTH","TRYST","TUTOR","TUNIC","TWANG","TWEAK","TWEED","TWICE","TWINE","TWIRL","TWIST","ULCER","ULTRA","UNCLE","UNDER","UNDUE","UNFED","UNFIT","UNIFY","UNITE","UNLIT","UNMET","UNTIE","UNTIL","UNZIP","UPSET","URBAN","USAGE","USHER","USING","USUAL","USURP","UTTER","UVULA","VAGUE","VALET","VALID","VALUE","VAPID","VAULT","VENOM","VERGE","VERVE","VIDEO","VIGOR","VINYL","VIOLA","VIRAL","VISOR","VITAL","VIVID","VODKA","VOICE","VOILA","VOTER","VOUCH","VYING","WACKY","WAGON","WALTZ","WASTE","WATCH","WEARY","WEDGE","WEIRD","WHACK","WHALE","WHEEL","WHELP","WHERE","WHICH","WHIFF","WHILE","WHINE","WHINY","WHIRL","WHISK","WHOOP","WIDEN","WINCE","WINDY","WITCH","WOKEN","WOMAN","WOOER","WORDY","WORLD","WORRY","WORSE","WORST","WOULD","WOVEN","WRATH","WREAK","WRIST","WRITE","WRONG","WROTE","WRUNG","YACHT","YEARN","YIELD","YOUNG","YOUTH","ZEBRA","ZESTY"};;
		ArrayList<String> answersList = new ArrayList<String>(Arrays.asList(backupAnswers));


		Scanner ans;
		File answers = new File("src/images/WordleCorrectAnswersl.txt");
		try {
			ans = new Scanner(answers);
			answersList.clear();
			while (ans.hasNextLine()) {
				answersList.add(ans.nextLine());
			}


		} catch (FileNotFoundException e) {
					e.printStackTrace();


		}
		String currentWord = answersList.get((int) (Math.random() * answersList.size()));
		System.out.println(currentWord);
		//Tracks Correct Word
		char currentCh1=currentWord.charAt(0);
		char currentCh2=currentWord.charAt(1);
		char currentCh3=currentWord.charAt(2);
		char currentCh4=currentWord.charAt(3);
		char currentCh5=currentWord.charAt(4);
		char [] currentChar = {currentCh1, currentCh2, currentCh3, currentCh4, currentCh5};
		System.out.println(currentWord);
		int Win = 1;
		while (Win >= 1) {

			//System.out.println("\u001B[32m  Green Color  \u001B[0m");
			c.setColor(Color.white);
			c.fillRect(0, 0, 90, 90);

			c.setCursor(1,1);
			c.println("Type a word");

			String guess1 = c.readLine();
			String guess = guess1.toLowerCase();
			if ((Grammer(guess, wordList)) == true) {

				char ch1=guess.charAt(0);
				char ch2=guess.charAt(1);
				char ch3=guess.charAt(2);
				char ch4=guess.charAt(3);
				char ch5=guess.charAt(4);
				char [] guessChar = {ch1, ch2, ch3, ch4, ch5};

				System.out.println(guessChar[0]);

				greyer(rounds);
				yellower(currentChar, guessChar, rounds);
				greener (currentChar, guessChar, rounds);
				wordCorrect(currentWord, guess);
				
				for(int letter = 0; letter < 5; letter++) {
					int[] imagePosX = {50, 150, 250, 350, 450};
					int[] imagePosY= {100, 200, 300, 400, 500};

					
					
					switch(Character.toUpperCase(guessChar[letter])) {
					case 'A': 
						System.out.println("1");
						c.drawImage(a, imagePosX[letter],  imagePosY[rounds], 90, 90, null);
						break;
					case 'B': 
						System.out.println("2");
						c.drawImage(b, imagePosX[letter],  imagePosY[rounds], 90, 90,null);
						break;
					case 'C': 
						System.out.println("3");
						c.drawImage(cc, imagePosX[letter],  imagePosY[rounds], 90, 90,null);
						break;
					case 'D':
						System.out.println("4");
						c.drawImage(d, imagePosX[letter],  imagePosY[rounds], 90, 90,null);
						break;
					case 'E':
						System.out.println("5");
						c.drawImage(ee, imagePosX[letter],  imagePosY[rounds], 90, 90,null);
						break;
					case 'F' : 
						System.out.println("6");
						c.drawImage(f, imagePosX[letter],  imagePosY[rounds], 90, 90,null);
						break;
					case 'G':
						System.out.println("7");
						c.drawImage(g, imagePosX[letter],  imagePosY[rounds], 90, 90,null);
						break;
					case 'H':
						System.out.println("7");
						c.drawImage(h, imagePosX[letter],  imagePosY[rounds], 90, 90,null);
						break;
					case 'I':
						System.out.println("7");
						c.drawImage(i, imagePosX[letter],  imagePosY[rounds], 90, 90,null);
						break;
					case 'J':
						System.out.println("7");
						c.drawImage(j, imagePosX[letter],  imagePosY[rounds], 90, 90, null);
						break;
					case 'K':
						System.out.println("7");
						c.drawImage(k, imagePosX[letter],  imagePosY[rounds], 90, 90,null);
						break;
					case 'L':
						System.out.println("7");
						c.drawImage(l, imagePosX[letter],  imagePosY[rounds], 90, 90,null);
						break;
					case 'M':
						System.out.println("7");
						c.drawImage(m, imagePosX[letter],  imagePosY[rounds], 90, 90,null);
						break;
					case 'N':
						System.out.println("7");
						c.drawImage(n, imagePosX[letter],  imagePosY[rounds], 90, 90,null);
						break;
					case 'O':
						System.out.println("7");
						c.drawImage(o, imagePosX[letter],  imagePosY[rounds],90, 90, null);
						break;
					case 'P':
						System.out.println("7");
						c.drawImage(p, imagePosX[letter],  imagePosY[rounds], 90, 90,null);
						break;
					case 'Q':
						System.out.println("7");
						c.drawImage(q, imagePosX[letter],  imagePosY[rounds], 90, 90,null);
						break;
					case 'R':
						System.out.println("7");
						c.drawImage(r, imagePosX[letter],  imagePosY[rounds], 90, 90,null);
						break;
					case 'S':
						System.out.println("7");
						c.drawImage(s, imagePosX[letter],  imagePosY[rounds], 90, 90,null);
						break;
					case 'T':
						System.out.println("7");
						c.drawImage(t, imagePosX[letter],  imagePosY[rounds], 90, 90,null);
						break;
					case 'U':
						System.out.println("7");
						c.drawImage(u, imagePosX[letter],  imagePosY[rounds],90, 90, null);
						break;
					case 'V':
						System.out.println("7");
						c.drawImage(v, imagePosX[letter],  imagePosY[rounds], 90, 90,null);
						break;
					case 'W':
						System.out.println("7");
						c.drawImage(w, imagePosX[letter],  imagePosY[rounds], 90, 90,null);
						break;
					case 'X':
						System.out.println("7");
						c.drawImage(x, imagePosX[letter],  imagePosY[rounds], 90, 90,null);
						break;
					case 'Y':
						System.out.println("7");
						c.drawImage(y, imagePosX[letter],  imagePosY[rounds], 90, 90,null);
						break;
					case 'Z':
						System.out.println("7");
						c.drawImage(z, imagePosX[letter],  imagePosY[rounds], 90, 90, null);
						break;
					default:
						System.out.println("Fail lol");
						break;
					}
//					greyer(rounds);
//					yellower(currentChar, guessChar, rounds);
//					greener (currentChar, guessChar, rounds);
//					wordCorrect(currentWord, guess);
				}


				
				rounds++;
			} else {
				System.out.println("Fail");
				//				c.clear();
			}
			//Tracks Guess Word
		}
	}





	public static boolean Grammer(String guess, ArrayList<String> WordList) {
		for(int i = 0; i < WordList.size(); i++) {
			if ((WordList.get(i)).equalsIgnoreCase(guess)) {
				return true;
			}
		}
		return false;
	}
	public static boolean wordCorrect(String currentWord, String guess) {
		return currentWord.equalsIgnoreCase(guess);
	}
	public static void yellower(char[] currentChar, char[] guessChar, int rounds) {
		int [] squares;
		squares = new int [5];
		int[]squareX= {50, 150, 250, 350, 450};
		int[]squareY= {100, 200, 300, 400, 500};

		boolean [] isYellow;
		isYellow = new boolean[25];
		for(int i = 0; i < 5; i++) {
			System.out.println();
			for(int g = 0, q = 0; g < 5; q++, g++) {
				if ((currentChar[g]) == (guessChar[i])) {
					System.out.println("True");
					squares[i] = 1;
					isYellow[g] = true;
					//					c.setColor(Color.yellow);
					//					c.setOpacity(0.9f);
					c.setColor(Color.yellow);
					//					float blah = 0;
					//					c.setOpacity(blah);
					c.fillRect(squareX[i], squareY[rounds], 90, 90);
					//Maybe put array with 5 slots and add to array[i]
				} else {
					System.out.println("False");
				}
			}
		}
	}
	public static void greener(char[] currentChar, char[] guessChar, int rounds) {
		int[]squareX= {50, 150, 250, 350, 450};
		int[]squareY= {100, 200, 300, 400, 500};
		boolean [] isGreen;
		isGreen = new boolean[5];
		for(int i = 0; i < 5; i++) {
			if ((currentChar[i]) == (guessChar[i])) {
				isGreen[i] = true;
				c.setColor(Color.green);
				c.fillRect(squareX[i], squareY[rounds], 90, 90);
			} else {
				System.out.println("False");
			}
		}
	}

	public static void greyer(int rounds) {

		for(int i = 0; i < 5; i++) {
			int[]squareX= {50, 150, 250, 350, 450};
			int[]squareY= {100, 200, 300, 400, 500};
			c.setColor(Color.GRAY);
			c.fillRect(squareX[i], squareY[rounds], 90, 90);
		}
	} //Main Class
}
