package day6;

import java.util.*;

import static java.util.Comparator.reverseOrder;
import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toList;

/**
 * Created by nathan.lamb on 12/6/2016.
 */
public class RepetitionCode {

//    LinkedList<TreeMap<Character, Integer>> messageMapList = new LinkedList<TreeMap<Character, Integer>>();

    public RepetitionCode() {
        String messages = "blrqqadw\n" +
                "hxwteava\n" +
                "xtzzneor\n" +
                "ufydaiyx\n" +
                "hhvcoozu\n" +
                "nbbvuvmd\n" +
                "usvdcalw\n" +
                "rpntrbyo\n" +
                "kgjholvo\n" +
                "nlohafzu\n" +
                "gxmifiuy\n" +
                "xndolmhm\n" +
                "zmtsfmtq\n" +
                "wkdzmogx\n" +
                "aogqflji\n" +
                "uphmjtnl\n" +
                "jkqognlw\n" +
                "mdzsbrij\n" +
                "zyxolasw\n" +
                "kvdyikgy\n" +
                "xpxgmuqq\n" +
                "viuoqyap\n" +
                "simgbmca\n" +
                "qxcjewnz\n" +
                "ivwoedjr\n" +
                "mlmzozlr\n" +
                "jmyallmm\n" +
                "oeecmjte\n" +
                "miuvzeww\n" +
                "qtfsiigb\n" +
                "lstgpdfp\n" +
                "pevoamxy\n" +
                "mjtpbedv\n" +
                "ugbasbgg\n" +
                "idcnuhtx\n" +
                "wwhcrxdr\n" +
                "prrugmrq\n" +
                "npoiywvw\n" +
                "zpkohigv\n" +
                "wngoczfk\n" +
                "gxnmxano\n" +
                "cbacsmte\n" +
                "meclajtf\n" +
                "zhztflqy\n" +
                "grqqlecu\n" +
                "qjbzsptn\n" +
                "ebagoidi\n" +
                "egegrnyh\n" +
                "jccwkqle\n" +
                "ikkwrzqt\n" +
                "nedkjwhf\n" +
                "vildwwrp\n" +
                "ugrejotn\n" +
                "kdajfbqw\n" +
                "gyiwhxpd\n" +
                "eemhkuwh\n" +
                "jvfhoiqi\n" +
                "wsgyaiip\n" +
                "jzjvagvv\n" +
                "lqupczes\n" +
                "fetfptqt\n" +
                "msmlbgcf\n" +
                "iukfpgrm\n" +
                "ctymfjpj\n" +
                "rbrpmkvx\n" +
                "glooxgap\n" +
                "scctgiai\n" +
                "lakkjuyk\n" +
                "gaekimfl\n" +
                "bhfaybki\n" +
                "qaiazzpf\n" +
                "dwqkvsee\n" +
                "fuhbygkt\n" +
                "zhkggelc\n" +
                "haigokzn\n" +
                "jpuangaj\n" +
                "tpunltos\n" +
                "izqxnhhd\n" +
                "oeyxnqkn\n" +
                "vzvelmik\n" +
                "ddnaozap\n" +
                "mdlhkdlu\n" +
                "oglyexnm\n" +
                "mcgxswpe\n" +
                "jzkjknxc\n" +
                "gfqnuhfs\n" +
                "ztnxzwng\n" +
                "bnuxixlk\n" +
                "vmumdwec\n" +
                "kuxxbcbv\n" +
                "vdcfhyso\n" +
                "qtdesxqr\n" +
                "qciljohn\n" +
                "qqlluqzz\n" +
                "njhvvqbw\n" +
                "knakngrj\n" +
                "pradgsbt\n" +
                "koffjwwy\n" +
                "tvrkgjql\n" +
                "mqtxerte\n" +
                "smigupym\n" +
                "bxxvoskx\n" +
                "jerbindg\n" +
                "snlgnowp\n" +
                "qsuxtdsu\n" +
                "fnpexyoa\n" +
                "ffwifdad\n" +
                "mvgrpczm\n" +
                "oxszzrsb\n" +
                "pxefzlch\n" +
                "mcgbeauh\n" +
                "neseoapm\n" +
                "iwnulsrv\n" +
                "zhinoifi\n" +
                "lfmjmmtk\n" +
                "fsxcqurn\n" +
                "gmkkhfuh\n" +
                "nuqeimxo\n" +
                "uvjdgkdo\n" +
                "ohtmvkcu\n" +
                "albuiptc\n" +
                "piaihrgr\n" +
                "fjviblws\n" +
                "qotlvddl\n" +
                "gchijkjr\n" +
                "azzrnqhy\n" +
                "xrynrbck\n" +
                "pdvkcekk\n" +
                "thscvzai\n" +
                "eoapfznw\n" +
                "hpgoissz\n" +
                "ifnesaoy\n" +
                "eniqycje\n" +
                "hmjmghcp\n" +
                "sfyrvbbi\n" +
                "tuxcoidt\n" +
                "icysmkcf\n" +
                "ycagvtls\n" +
                "dohqfcgc\n" +
                "taitvkzk\n" +
                "bblnroyh\n" +
                "grdklrua\n" +
                "qpijbooa\n" +
                "pcwtjacj\n" +
                "mrvxbefl\n" +
                "oodwrtvj\n" +
                "xosqbcie\n" +
                "zbquakff\n" +
                "ypwpamng\n" +
                "rpfbkssq\n" +
                "fctgmcav\n" +
                "hdtcdfcf\n" +
                "ctboapkz\n" +
                "qypakerm\n" +
                "vebdtsmq\n" +
                "cyxqtbtt\n" +
                "dcnpkmnu\n" +
                "hnjppwfo\n" +
                "gqmfdahb\n" +
                "hxiqcrbe\n" +
                "rpxazkak\n" +
                "nmtraoky\n" +
                "sisqtogo\n" +
                "oycwooev\n" +
                "lmmitjey\n" +
                "rytzptco\n" +
                "waatgjdu\n" +
                "khsuxyse\n" +
                "cxjltfxn\n" +
                "eedsmcld\n" +
                "fngdicwe\n" +
                "lkomchdq\n" +
                "ulvabpoz\n" +
                "oyhjvimr\n" +
                "dpyexiwi\n" +
                "wjfzkbbv\n" +
                "ihohnaxx\n" +
                "ajxfefrv\n" +
                "bplrrpcz\n" +
                "rtamodoq\n" +
                "slwrcibk\n" +
                "sgwdtumz\n" +
                "vlemhplz\n" +
                "dnpkqvad\n" +
                "ytolejsa\n" +
                "ojevrxsc\n" +
                "bgbmnvyv\n" +
                "lmrousup\n" +
                "yyubvohm\n" +
                "bqaqltmt\n" +
                "vfbzzthz\n" +
                "ylehjmop\n" +
                "exddqqwo\n" +
                "xqfxejzq\n" +
                "myyuypku\n" +
                "zyvmvbla\n" +
                "cnpquvbp\n" +
                "yaxdddeq\n" +
                "cnrjqdra\n" +
                "lwphgfgf\n" +
                "zqdbcnmn\n" +
                "qelivdwx\n" +
                "wpnwomgu\n" +
                "xzephbpa\n" +
                "yghrabgr\n" +
                "pnjsyhth\n" +
                "okdznczw\n" +
                "urwcwwfm\n" +
                "hjrsrrzk\n" +
                "foklmzqs\n" +
                "mjldwaun\n" +
                "dabalbmb\n" +
                "jmtqvwst\n" +
                "uhtzixah\n" +
                "blclhmjf\n" +
                "wilsnjwb\n" +
                "qeeriszr\n" +
                "vbfagerv\n" +
                "afegxkkh\n" +
                "zwzausdd\n" +
                "ysfgzvbw\n" +
                "ymjlmnmz\n" +
                "rnrbxnij\n" +
                "ihvhqtvk\n" +
                "ofwrugbp\n" +
                "ontvlhfu\n" +
                "sfjgpqpx\n" +
                "oyzkaiyl\n" +
                "xfmvkfkh\n" +
                "pqpeeptl\n" +
                "jdyueahx\n" +
                "plghatyl\n" +
                "yrdizope\n" +
                "lrurgkqw\n" +
                "xdqtlmww\n" +
                "dkaiotxb\n" +
                "iegjcmln\n" +
                "iupoupxa\n" +
                "zrepcilx\n" +
                "tpewzoxi\n" +
                "munsmbpj\n" +
                "fvhsucvb\n" +
                "rlwchfml\n" +
                "kcmlbubj\n" +
                "jnhurapr\n" +
                "dflwxeii\n" +
                "wtypbujm\n" +
                "jivypmpr\n" +
                "argvlhnz\n" +
                "acyvvplf\n" +
                "naqafzfw\n" +
                "ngepfsju\n" +
                "xfpuwtji\n" +
                "pqgkxbmj\n" +
                "oeygjbxs\n" +
                "evoydkqq\n" +
                "nhuoohdi\n" +
                "wrznguek\n" +
                "ssirmkbq\n" +
                "ackhglvh\n" +
                "egszqozo\n" +
                "rhnhhxul\n" +
                "mqabqvun\n" +
                "yunlcuvd\n" +
                "zklsneau\n" +
                "itanrdqb\n" +
                "pvxbkwoc\n" +
                "rqbqjyuv\n" +
                "ioxjpvqd\n" +
                "pzkgsdej\n" +
                "yklripsi\n" +
                "iohazhoh\n" +
                "umxxpdaw\n" +
                "czfnfgxt\n" +
                "xaxvkjjc\n" +
                "qhgvdvaa\n" +
                "iobwhxjq\n" +
                "jwfwqqjs\n" +
                "cbrfgjpp\n" +
                "conpdlzv\n" +
                "wbcmssue\n" +
                "gyqkseid\n" +
                "ozrzahxt\n" +
                "rzowboce\n" +
                "lhntmyie\n" +
                "tlrcktzc\n" +
                "lxmzpvku\n" +
                "ckliqrdt\n" +
                "qlmalosg\n" +
                "ovvyxrnr\n" +
                "gctjwzrl\n" +
                "ooqvxzac\n" +
                "dbdqzzly\n" +
                "fpsjzuxx\n" +
                "njndzgel\n" +
                "hjfqofhh\n" +
                "txhcpktf\n" +
                "otceqnmc\n" +
                "dduyepiz\n" +
                "bsxdbzgs\n" +
                "zklbicun\n" +
                "rstnuwtg\n" +
                "tasiqsbs\n" +
                "wewnwuyn\n" +
                "zvgkuxxp\n" +
                "nxcmlrmx\n" +
                "mizqhlnv\n" +
                "xyxzfeca\n" +
                "qkeuwzgi\n" +
                "ajnzmfks\n" +
                "ejszlxyc\n" +
                "xzfggxpd\n" +
                "jbooydts\n" +
                "eisoqvuo\n" +
                "hdfpevns\n" +
                "alybbyrb\n" +
                "yvpylcnz\n" +
                "tdpcycrv\n" +
                "kwptuqyw\n" +
                "ncobyufk\n" +
                "fclvkbek\n" +
                "tgnfcfup\n" +
                "vbcuaudl\n" +
                "hublkdvy\n" +
                "aoetzcyl\n" +
                "fsiuwhbi\n" +
                "eyolgmxh\n" +
                "siptvnjn\n" +
                "shvycepr\n" +
                "ntrwmime\n" +
                "dbdnbfyt\n" +
                "bwluchce\n" +
                "uigenqhy\n" +
                "krxdyhap\n" +
                "avycqglh\n" +
                "gguniqpm\n" +
                "wcwzelyd\n" +
                "wzurdris\n" +
                "rmhstxuj\n" +
                "vuaozvvq\n" +
                "bsdgqrpx\n" +
                "twnvkunt\n" +
                "nqgqtugs\n" +
                "vzkvghwg\n" +
                "ypceflob\n" +
                "dsyzunmb\n" +
                "kvhacqqr\n" +
                "ozlfwkjl\n" +
                "pyznytxd\n" +
                "ykdkbfgf\n" +
                "eajwdyia\n" +
                "bhkxsxcc\n" +
                "vytpdoop\n" +
                "ibpypdrh\n" +
                "dkkjnwng\n" +
                "lxwkkldf\n" +
                "nbtckkoy\n" +
                "qtjyffvl\n" +
                "sbitpceb\n" +
                "sxmhbcuy\n" +
                "zorovlxd\n" +
                "bazreact\n" +
                "cwzggemu\n" +
                "uowhquji\n" +
                "eijszbmy\n" +
                "aarneovu\n" +
                "grhvjqyo\n" +
                "fzheiyvq\n" +
                "nzsdrlli\n" +
                "wfsdwsok\n" +
                "wrqjuygq\n" +
                "ggpffnri\n" +
                "wkycrfjm\n" +
                "drksyjxn\n" +
                "smuhwcxa\n" +
                "iabdvvyj\n" +
                "esidunjn\n" +
                "decnfzwl\n" +
                "ysihdzkf\n" +
                "zokmsjgk\n" +
                "pxuddjdo\n" +
                "uemyoegc\n" +
                "glqycmsw\n" +
                "fvfkqzdu\n" +
                "mhotjpqc\n" +
                "pfyuopbx\n" +
                "tibutsqb\n" +
                "krzcqnkv\n" +
                "djqpmsmb\n" +
                "vbufrshp\n" +
                "mmzsrikm\n" +
                "zkjbrtoo\n" +
                "uopielbd\n" +
                "jmketnly\n" +
                "raomwphg\n" +
                "uwocphkf\n" +
                "lvktwagm\n" +
                "lqmorzgf\n" +
                "rihrgrdp\n" +
                "cnbuplfg\n" +
                "hwfjvxcj\n" +
                "sfgptuic\n" +
                "ixkimxsx\n" +
                "kfpicnix\n" +
                "tvpybbrf\n" +
                "navehxpr\n" +
                "rwbcttbq\n" +
                "obqcxwjd\n" +
                "fuiskmfg\n" +
                "xcvfxoeh\n" +
                "tsmaaoyx\n" +
                "qjhiyeex\n" +
                "qwfxiyxq\n" +
                "ctkyxatm\n" +
                "hyxhsvmy\n" +
                "puknicfi\n" +
                "hbwzmyks\n" +
                "uczqlycu\n" +
                "wkywzgqs\n" +
                "kzfehffd\n" +
                "aoooehdc\n" +
                "lnijvgrg\n" +
                "aedbnxzk\n" +
                "lusvnger\n" +
                "ltpbpgiq\n" +
                "aypxjgwo\n" +
                "lgejygmw\n" +
                "auqexwja\n" +
                "fwszagnq\n" +
                "aiafpduf\n" +
                "lyltmest\n" +
                "agtasqwl\n" +
                "fqrlliiw\n" +
                "udarpyjv\n" +
                "kxotyded\n" +
                "aodevwdt\n" +
                "lmmfarbx\n" +
                "snjwogeo\n" +
                "ehfmpymn\n" +
                "yahfaxeo\n" +
                "xudbdnog\n" +
                "rrkxhhsy\n" +
                "hdxadfck\n" +
                "dmnujkng\n" +
                "cujvjtry\n" +
                "srwxylvi\n" +
                "dwohbywb\n" +
                "cvspfupf\n" +
                "czvvjhfw\n" +
                "wvyjwtzz\n" +
                "vfooqywj\n" +
                "bmulxlpz\n" +
                "hbukjylo\n" +
                "bdhsvgdg\n" +
                "vnrrqyue\n" +
                "hjveswxf\n" +
                "yxgzdjwn\n" +
                "byonsarh\n" +
                "edbmtqyz\n" +
                "owvunnfp\n" +
                "wfqqsuyj\n" +
                "cwckbkwt\n" +
                "plesmdky\n" +
                "pzatdacm\n" +
                "nqfyxhij\n" +
                "jjwqitsc\n" +
                "tejffykk\n" +
                "yllyznoo\n" +
                "kkqhuqlc\n" +
                "hxchsqos\n" +
                "buvmceha\n" +
                "kbzymzrl\n" +
                "kiemcigv\n" +
                "txmjfujf\n" +
                "vfnystic\n" +
                "kvaiybnq\n" +
                "ztrwxszz\n" +
                "wiyawlfm\n" +
                "sgedycpx\n" +
                "isafnieb\n" +
                "bpspuqvx\n" +
                "fqjtxrtb\n" +
                "bgjdrvhb\n" +
                "mnsbgbhe\n" +
                "jpsqcfzz\n" +
                "fpumugea\n" +
                "qqutezwg\n" +
                "eoabntsw\n" +
                "tupqchzt\n" +
                "ezwjasja\n" +
                "rsguwrqg\n" +
                "cqzcijqd\n" +
                "rhxlhksr\n" +
                "vcwlknrc\n" +
                "eiqbcafb\n" +
                "lwzbrrtr\n" +
                "aomiovcj\n" +
                "ujxshcar\n" +
                "fbpjehma\n" +
                "bgdphfwg\n" +
                "iukvlxvq\n" +
                "ptawvjzy\n" +
                "styyqrqd\n" +
                "itobtfvm\n" +
                "yqnpsyha\n" +
                "vkwfaykp\n" +
                "zwpoxkzx\n" +
                "uqwasoht\n" +
                "tkgfmnvj\n" +
                "xkilydvt\n" +
                "xlmkpdaz\n" +
                "xfvukjte\n" +
                "yyzpwped\n" +
                "xzxwnrlm\n" +
                "ausmhunn\n" +
                "qgiiljhq\n" +
                "njqhxprl\n" +
                "fgfxiphp\n" +
                "kkzjpuur\n" +
                "dcqixesl\n" +
                "tthldwgg\n" +
                "nkjxnttn\n" +
                "cjtiiltj\n" +
                "drlzddsv\n" +
                "xxluiael\n" +
                "kjjsewia\n" +
                "danhtpxa\n" +
                "edexzcqw\n" +
                "mrqewvuh\n" +
                "opwtwbbt\n" +
                "rdbsaeke\n" +
                "viistwnj\n" +
                "llcndvsm\n" +
                "jeejjqyb\n" +
                "hstekias\n" +
                "gmswtskg\n" +
                "qhdktszo\n" +
                "ptbryiff\n" +
                "jrtlgbag\n" +
                "gjbbbfnu\n" +
                "uirwdwzh\n" +
                "esmntxej\n" +
                "vdcmrenk\n" +
                "tagtsvaz\n" +
                "hnewrron\n" +
                "zydwkvuh\n" +
                "zscfhzxk\n" +
                "sazgunom\n" +
                "gqcxdowc\n" +
                "twmxtniu\n" +
                "wfblhfiv\n" +
                "barpdrob\n" +
                "jwjrnqhv\n" +
                "xvnysjvz\n" +
                "jvsftvqs\n" +
                "jivuhphv\n" +
                "grbezkpe\n" +
                "xuolyqis\n" +
                "smuxlqpu\n" +
                "rticwcrh\n" +
                "huzyzxul\n" +
                "pgqawldg\n" +
                "mdcgejab\n" +
                "rlrgwpfo\n" +
                "uqhvyglu\n" +
                "csinjsjy\n" +
                "ydorfrud\n" +
                "gmcnjnbr\n" +
                "qzvizjbt\n" +
                "vejkuvii\n" +
                "uhfrombz\n" +
                "clgrjlys\n";

        String[] messageList = messages.split("\\n");

        LinkedList<String> transformedList = new LinkedList<String>();

        for (int letterCount = 0; letterCount < messageList[0].length(); letterCount++) {
            char[] columnArray = new char[messageList.length];

            for (int cCount = 0; cCount < messageList.length; cCount++) {
                columnArray[cCount] = messageList[cCount].charAt(letterCount);
            }

            transformedList.add(new String(columnArray));
        }

        for(String message: transformedList) {

            TreeMap<Character, Integer> messageMap = new TreeMap<Character, Integer>();

            for(int i = 0; i<message.length(); i++) {
                char[] letters = message.toCharArray();
                for (int j=0; j<letters.length; j++) {
                    Integer val = messageMap.get(new Character(letters[j]));
                    if (val != null) {
                        messageMap.put(letters[j], new Integer(val + 1));
                    } else {
                        messageMap.put(letters[j], 1);
                    }
                }
            }

            List<Character> sorted = messageMap.entrySet().stream()
                    // reverseorder or not depending on part 1 or 2
                    .sorted(comparingByValue())
                    .map(Map.Entry::getKey)
                    .collect(toList());

            System.out.print(sorted.get(0));
        }


    }
}
