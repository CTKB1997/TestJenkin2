package testjenkinjava;

import junit.framework.TestCase;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestLCS extends TestCase {

    public TestLCS(String name) {
        super(name);
    }

    public void test0() {
         TestJenkinJava LCS = new TestJenkinJava("lagdykfbpculacejdrsuuxnmnzwvdkzlqgiqbqavtqghrdseflbgfzbm", "sczjuskwpgsaoqbr");
         assertEquals(8, LCS.getLCS());
    }

    public void test1() {
         TestJenkinJava LCS = new TestJenkinJava("sifkzxumecoiftdqwqykruyvlendzpamhzqeiag", "shmsbgxeufozbcpnewmdljttdcgcxvdsgliiflmncdmojnplpjvzhvlqnyntepbwvecetlailpoyxp");
         assertEquals(15, LCS.getLCS());
    }

    public void test2() {
         TestJenkinJava LCS = new TestJenkinJava("rjdfusmyvpzjpbwajpykmmrpvckbgpnzvwfvvgihuivxhhrhgxyiczqghymzrbgw", "cbrmfwlbtdsqobyxrxhfenpvphalnahnrhomzvougajjpoadctvzemimmwabytcfrasxkvlzyteynffdaruaennefwb");
         assertEquals(20, LCS.getLCS());
    }

    public void test3() {
         TestJenkinJava LCS = new TestJenkinJava("wxetznoffuknptrhfvhcpglriwyhpjllsktvtbdnsfluiuncreyhxbnohzijsbkpqlewqyfeqrzpomtktvkqzpotlwoveccjgbpi", "xokhtmqtwteuzqlwzyseokhqym");
         assertEquals(16, LCS.getLCS());
    }

    public void test4() {
         TestJenkinJava LCS = new TestJenkinJava("zfjrzvufdmlnvleugcywvdsqglzqatopujgikkcnvypxpkjvjueutkqcbfejkn", "ittksghbaixyjvpcvnokyvsvcwiwugvqvooqsqxcuxlkrwyayjccqzzfypwmwsgzjuqpipahffqqhaatycmwwanhrkcn");
         assertEquals(21, LCS.getLCS());
    }

    public void test5() {
         TestJenkinJava LCS = new TestJenkinJava("ufvcsnyboudi", "vmdejvlsquioociscjvjbitanpdmkzofeptfkvlyvnkbufpsskytoxpcepx");
         assertEquals(7, LCS.getLCS());
    }

    public void test6() {
         TestJenkinJava LCS = new TestJenkinJava("stkdipuivoo", "iqzcwkcitgaoykqobqhgyfpaxjtwgzxnjljelvhcaywszlyyyevblzqb");
         assertEquals(4, LCS.getLCS());
    }

    public void test7() {
         TestJenkinJava LCS = new TestJenkinJava("uojhfzpfgyvnhlzamibkhtsgtawewrkkjflpxpykmstowbfkoujvoocekgfvbgdwgkcenalgwnengj", "vynmgtvioaytqvjvifprvahjrneewxawjoqugyrthjxzftiwvh");
         assertEquals(17, LCS.getLCS());
    }

    public void test8() {
         TestJenkinJava LCS = new TestJenkinJava("nkizirkkmdidsyxlkzmuccwnwaumfoyljrjdbuledgxjtiazhjaavvyxxgcg", "rlcqhxtjwhordkcpibwriokmqlpsqmnauiapdlaoecvyrwoecnblzqsdcslz");
         assertEquals(17, LCS.getLCS());
    }

    public void test9() {
         TestJenkinJava LCS = new TestJenkinJava("qocgulgsqaygqhsatonkxgmjofkmmbghz", "tfgajvxdxosydubluqsgnabvbdvmtvrymtghznrlelsjzxbu");
         assertEquals(11, LCS.getLCS());
    }

    public void test10() {
         TestJenkinJava LCS = new TestJenkinJava("bpzkd", "jhungxdfmloofwwgykqeryq");
         assertEquals(1, LCS.getLCS());
    }

    public void test11() {
         TestJenkinJava LCS = new TestJenkinJava("mtrpnxvocpgvaghyoaabthnctfprzigresmayhcloeaxifbeqbqbhpyjlhcrrouhcbaafhexguvqwlgylxdzjotpdpxzbjqzdn", "tvipiojapnahoawqbossyrxftcmresg");
         assertEquals(17, LCS.getLCS());
    }

    public void test12() {
         TestJenkinJava LCS = new TestJenkinJava("ugiaco", "vzadfgaaneuhobosiiwdoomcobtufcqedldspcdqpofrhatlqshuzlllcmmbarmzg");
         assertEquals(4, LCS.getLCS());
    }

    public void test13() {
         TestJenkinJava LCS = new TestJenkinJava("yzzyhvhaxszaxsfsirnkqbbs", "ogvwawtucavvlpjhzkulzzvisykdqcykwxxqnfpicomwtxukangpypel");
         assertEquals(8, LCS.getLCS());
    }

    public void test14() {
         TestJenkinJava LCS = new TestJenkinJava("cgeyhmyysdsjkuhrfpdmeyvrtjvturopdqhyecdiknmhhl", "kprpcbdmpjjispyeesmf");
         assertEquals(10, LCS.getLCS());
    }

    public void test15() {
         TestJenkinJava LCS = new TestJenkinJava("mrwrcyosyiotwsgjxepoumyactojxzsrjpfcrrqpssxbbyekbsuua", "lbfluoyxjvotczusdsaxobfsqrartfsjphacpjgirkfkcdfimlstdofdrbphpyetsvktbaapaycuqeing");
         assertEquals(21, LCS.getLCS());
    }

    public void test16() {
         TestJenkinJava LCS = new TestJenkinJava("ekkusznfhakxliceoa", "essiiqjfnoycljkwihjyvivgdkhbzydnovlpfqvbendwfwptcckxilgmtldxbzwzpuleqfwwekkqdxxjdqroozvdlfkmieszwt");
         assertEquals(11, LCS.getLCS());
    }

    public void test17() {
         TestJenkinJava LCS = new TestJenkinJava("gdeabdotsgdckyutylikqdaxbvfbeozghyksihyxhrzlscvqlhqkimhplxriwtciu", "mkfplvowrercxbggkrghyzpdronyseqb");
         assertEquals(11, LCS.getLCS());
    }

    public void test18() {
         TestJenkinJava LCS = new TestJenkinJava("pdnexdzdmfjuiuorzsvrdutcybdrmzywqrexszddi", "ebokaamsvyvdvdtxsudcigigwygomyt");
         assertEquals(10, LCS.getLCS());
    }

    public void test19() {
         TestJenkinJava LCS = new TestJenkinJava("ipsdxyuvghizepdqfiyzqabx", "gudxnricklafdvxlvuwdvceuqquvbumqhffvccnmixjnxyvysshumgykbepqjzagldphevu");
         assertEquals(12, LCS.getLCS());
    }

    public void test20() {
         TestJenkinJava LCS = new TestJenkinJava("sagdhdnatoqmmmkwoahkrzrrej", "qxckefkplkpdxlxmowih");
         assertEquals(4, LCS.getLCS());
    }

    public void test21() {
         TestJenkinJava LCS = new TestJenkinJava("vfqm", "wjzawlagsiweggbppxzeexjrvffjpicmopdklsmqbkarkbxqdyjovtsxogfhvbpbbziatkqtpcuzkssepeytrkeskeasrjyb");
         assertEquals(3, LCS.getLCS());
    }

    public void test22() {
         TestJenkinJava LCS = new TestJenkinJava("ibpnbkabbp", "qkucegcekielwdhatvoxsyzjju");
         assertEquals(2, LCS.getLCS());
    }

    public void test23() {
         TestJenkinJava LCS = new TestJenkinJava("qjbcqcosbkoabstfuafldzqkqegpfkrtmuvqswsjmkujofdlrgnkcfjqnhcnlzqzuyjfjuyiopqlppjfxphuyf", "dooqhwdpjwvckitdpptjgr");
         assertEquals(11, LCS.getLCS());
    }

    public void test24() {
         TestJenkinJava LCS = new TestJenkinJava("esnhojmovubiubnzdgeblqzfmmdnjijtrzhgwsbwxtopeerlcfhrarqmlacbnnxwbewxc", "ybnlsztesjxpbsgqeqjqoixvmsjfdoterkqybcevjznwafuhyvgkv");
         assertEquals(17, LCS.getLCS());
    }

    public void test25() {
         TestJenkinJava LCS = new TestJenkinJava("ibpfkjattkcupneajkyadmgkajtarmxewwbsrzsewsjzjdumkmcmrvecfkwzwxubbkag", "jgpnztmrfxgptfxllzbkhkjnawlzjphyqovzvgeznxtneadexsedlhybqkirurvtx");
         assertEquals(19, LCS.getLCS());
    }

    public void test26() {
         TestJenkinJava LCS = new TestJenkinJava("vyqbxzqdkmcekrrxkwdqpxqyctgzjllzmhpwlfmovopdzkhdpnpntcgegxhool", "alkmktdelmyrunlwguij");
         assertEquals(8, LCS.getLCS());
    }

    public void test27() {
         TestJenkinJava LCS = new TestJenkinJava("yudsflcqwqyzfwhakitzdeumtirlkv", "fdkkyafxv");
         assertEquals(4, LCS.getLCS());
    }

    public void test28() {
         TestJenkinJava LCS = new TestJenkinJava("pljeeoljvldjkfntkxejrvvjqfldcyckxjwdvhqjdjqyunyxgcwxqeswhtjsjymmoslokzixmivxetfmbzzkzcncvzr", "ujiytdbsctkryvtqwbaygw");
         assertEquals(11, LCS.getLCS());
    }

    public void test29() {
         TestJenkinJava LCS = new TestJenkinJava("zpyyxoblpvpefnjydduifowajsbfhrirpvxyrznetffqpbphcwyujimgvszeuuasrypvcxomrqkyv", "ijpzbthlyuuameffugxwlzlsgzvpqjuddraiujxznyoejmdllfivcisbnjtbfzdgxeiqelulifrgoaewiildsgehuebugkfqd");
         assertEquals(27, LCS.getLCS());
    }

    public void test30() {
         TestJenkinJava LCS = new TestJenkinJava("tuksgokwcmptgsvynvmpdtblforyfadypooktylhklrlkyfqunxdudviicfeyyoxflmtplppfivosrrrgz", "xxxlcur");
         assertEquals(4, LCS.getLCS());
    }

    public void test31() {
         TestJenkinJava LCS = new TestJenkinJava("bgsyyttshwxbwfvcqucbnfad", "fqelesd");
         assertEquals(3, LCS.getLCS());
    }

    public void test32() {
         TestJenkinJava LCS = new TestJenkinJava("rnrfbzxvkrtslauyvyhqkrqnjpuapqtadajc", "uxyjzrptxyadtvgccnstlskswrohsuwbjidbdvypvmbpwovpgsvxvtglzotomgwiafvfwszuymrxxyhvemqf");
         assertEquals(14, LCS.getLCS());
    }

    public void test33() {
         TestJenkinJava LCS = new TestJenkinJava("gsiaxfilbcpdpfytlwmnoptmecsfohfgsdvwslpxhkwdtamyesyxvhabejmwqhtzzlkfcsrbzcn", "phwlbgaurntckvecyimphbumaewuogxmyzinrjhahlflkucamiwidwgefvtlpfnlqsjwybyxmqjh");
         assertEquals(22, LCS.getLCS());
    }

    public void test34() {
         TestJenkinJava LCS = new TestJenkinJava("aklejlemxmbwwczqgkrojpvuhtvocwqusxzmpkwobiqnllhbcpwvyezokyvz", "qcltaekosfevkxbqwtmhreqakfvjoxncuzozrttcqeixojmnaindno");
         assertEquals(18, LCS.getLCS());
    }

    public void test35() {
         TestJenkinJava LCS = new TestJenkinJava("hxshaifqnhguaucgdcnqlikglovehmnlfwvkklydloeunieesfbasnufrowejopvicjsx", "tekejktdletanvltmgoohrby");
         assertEquals(10, LCS.getLCS());
    }

    public void test36() {
         TestJenkinJava LCS = new TestJenkinJava("tviqrbutiydyaehzcpr", "ysdjdpgdhbnfxwconaitehpaliwvocagbebxngemdqubkjrxlowdmaaohsv");
         assertEquals(7, LCS.getLCS());
    }

    public void test37() {
         TestJenkinJava LCS = new TestJenkinJava("fjetioefnzgaufccpepbrbbxwgcdgxfhtelcpjztgn", "rvblikmbiyozbddfcxiyaonveldgsi");
         assertEquals(9, LCS.getLCS());
    }

    public void test38() {
         TestJenkinJava LCS = new TestJenkinJava("etztmliotvoimrzeattvofuvhhaezpfxowoflsmtejpvjhlznggowcdsatcuzvdrttranvpftlciaeqeprhqukkhnuwkyvbz", "txrckzqmfufepgxnucrcgwxdvp");
         assertEquals(14, LCS.getLCS());
    }

    public void test39() {
         TestJenkinJava LCS = new TestJenkinJava("wzgzpzlzyeztzcvyfnlofvvoptqghhupcmnihirvywqzjmtcqgoiitxuhwclnl", "hgnmsqhrhudkjmxbngcyensqcivz");
         assertEquals(12, LCS.getLCS());
    }

    public void test40() {
         TestJenkinJava LCS = new TestJenkinJava("bqeseqcwklaqhjcotcavoziettvmppvfzgsmgyljkndlonrmrmlodxxanridxhssiosgijmxxsbpo", "ebrypihaphxvbuuqipstbddhkq");
         assertEquals(10, LCS.getLCS());
    }

    public void test41() {
         TestJenkinJava LCS = new TestJenkinJava("csvrztnfapzlblftqazaawqmevekupcgmwjqpcrapnsk", "wcsxnynbvbejekzccobtbpxkm");
         assertEquals(11, LCS.getLCS());
    }

    public void test42() {
         TestJenkinJava LCS = new TestJenkinJava("dtz", "ullmkuvsmedisuwmxxoezpuvhpjyrykydsxcsaehqhkgolzpxjlhkmqkvzeqzsbzbx");
         assertEquals(2, LCS.getLCS());
    }

    public void test43() {
         TestJenkinJava LCS = new TestJenkinJava("mfrwzqxakxvtwomapwykhjldhstskacxtutkgqgmktvohfaniyvdpbugzmjlsxhejqjcjtiogtjqcxwxdjdvebntzsuvwwix", "prighwgokhthkynjkpxduulfausnggejxzrcyjbpliswrsorhcoqvw");
         assertEquals(23, LCS.getLCS());
    }

    public void test44() {
         TestJenkinJava LCS = new TestJenkinJava("uhadjuytnarrpqgjbejsztwcc", "lfrrevnadmkgjbkmqeoawqsdpwmaxesxkrcqojtdknzpzumgdnjljejasteef");
         assertEquals(12, LCS.getLCS());
    }

    public void test45() {
         TestJenkinJava LCS = new TestJenkinJava("irpjkccihnbwmiybmbyvhulvmfzelcxpcnmjfbcbylvmmxwsykzfp", "jmuvjwnlmyyhgtfzdzh");
         assertEquals(9, LCS.getLCS());
    }

    public void test46() {
         TestJenkinJava LCS = new TestJenkinJava("oeepychqxnfobxukdychkzzgbuyunktauqgndddhbdckfmmuudjoguwiyxzvxn", "iyqrngxqkgucgznejodfivlvyttcmpzbnokqnnvcrqfbzvuawcwxhyakvfvpyfyaswjzkvt");
         assertEquals(21, LCS.getLCS());
    }

    public void test47() {
         TestJenkinJava LCS = new TestJenkinJava("xwvxerixyzhy", "gttvmhhwjuqjahcyxoyyzvjojengxtwdxrfncytfjxywndmxgzkpdwtwxqodnfzwibjbjznifydpcmwjua");
         assertEquals(8, LCS.getLCS());
    }

    public void test48() {
         TestJenkinJava LCS = new TestJenkinJava("fklzidgwkkmpxkojyznhruqeublidclurawbywfhfwwzybacsikryfprcfpntrfnmxtwmr", "hbeqghqzwoffcbqlnphuomliszikxne");
         assertEquals(12, LCS.getLCS());
    }

    public void test49() {
         TestJenkinJava LCS = new TestJenkinJava("wktknvxgtvndbdlpgcfeefhzwbfkiexqhiapywgsjphfopfhlgdvobvnjeyctxrsbrgfsnfmtdkhafuedijduurawbwdaveiyp", "jxtyarhpbapjpsqqzqshwidrtpvumdijwcncofnmpactdggybkngfonkmsbjejfansvrmymexr");
         assertEquals(25, LCS.getLCS());
    }

    public void test50() {
         TestJenkinJava LCS = new TestJenkinJava("pnyzhdwjoniqahpbutxspq", "bdv");
         assertEquals(1, LCS.getLCS());
    }

    public void test51() {
         TestJenkinJava LCS = new TestJenkinJava("zwzzdgnldvrzvcrewaxjqhet", "hqkissjxmczuubclqgevyexjmnr");
         assertEquals(6, LCS.getLCS());
    }

    public void test52() {
         TestJenkinJava LCS = new TestJenkinJava("ikpszzrrowbmezzzkxrjuqusjiluyvuxyztvzwsdgxivptuhivrtkymptmyhuqrbycyakjdgktjdiinazntwkbxcegsxzwx", "hdqmyzleixircqtiypwlbavhg");
         assertEquals(12, LCS.getLCS());
    }

    public void test53() {
         TestJenkinJava LCS = new TestJenkinJava("gyineyscdgqrlrdqomgcdfhwzdnjwlfrgdgnwczbpvorcswylwxdtsuldhgeevauwbilxvnjhbtctslpwflrhwkalrzyk", "atjcqbvqltqzampdhno");
         assertEquals(9, LCS.getLCS());
    }

    public void test54() {
         TestJenkinJava LCS = new TestJenkinJava("zcnlvmhwsqqzbjigezxnklpkgusfwwqqeeorwywyuohy", "ahmryg");
         assertEquals(3, LCS.getLCS());
    }

    public void test55() {
         TestJenkinJava LCS = new TestJenkinJava("hbojajg", "gcdllnbsejoszhlwhwlynvfjkxiiedrdzgltunwrzvozeoyhtimeiomozvjhnytbeslct");
         assertEquals(4, LCS.getLCS());
    }

    public void test56() {
         TestJenkinJava LCS = new TestJenkinJava("thfofpobirlzwazmzj", "thnmgyivfoffuhoseguwafghj");
         assertEquals(9, LCS.getLCS());
    }

    public void test57() {
         TestJenkinJava LCS = new TestJenkinJava("hrcmzgeahfhof", "gvherojgtaeozbqtewlnysakchvvimtxiyostsirzsbxarucxfqqkbijdzlyopcrczfgorimtwwpolxukimntbudceyqmbtzlu");
         assertEquals(9, LCS.getLCS());
    }

    public void test58() {
         TestJenkinJava LCS = new TestJenkinJava("lgwbxcvrzenrkcjpmnzryzlgxhqsuzdhbjasijidmxkberaajcnowrwjurdgfugoxxgyzonmmtspzqiaow", "ilzazxsscrvooustgjxskoqdfmmblwdoyvfyqetlnncempldcgdzttnvhyajeufgfyaqfzgaor");
         assertEquals(22, LCS.getLCS());
    }

    public void test59() {
         TestJenkinJava LCS = new TestJenkinJava("qaxaadmlmsozyzkfvwqtykqjwgsqupcrkgwgccdjrbscxrcjobscxzchnngzxjdeinfwfepmmyep", "kfxyzljcvudlrqnamfsdsnltxjnaqmbatwmzcuyvncyquyiunvkhsppfcm");
         assertEquals(18, LCS.getLCS());
    }

    public void test60() {
         TestJenkinJava LCS = new TestJenkinJava("dsrwmbcgnzddfz", "ipqmmfvipzgjq");
         assertEquals(3, LCS.getLCS());
    }

    public void test61() {
         TestJenkinJava LCS = new TestJenkinJava("dmzjyvinvcnwkdwrnpchwguidgoctzunyzlqci", "wqvfiiacslyfxdyvkvposlcjejinvoytlbiyilvfh");
         assertEquals(11, LCS.getLCS());
    }

    public void test62() {
         TestJenkinJava LCS = new TestJenkinJava("byomzvksnnhyruevbo", "jgzwntldihltkibvmvptwqxsudcx");
         assertEquals(5, LCS.getLCS());
    }

    public void test63() {
         TestJenkinJava LCS = new TestJenkinJava("cyzzjbjxplondoav", "coqagaperseiqhozrepuoxluqntp");
         assertEquals(5, LCS.getLCS());
    }

    public void test64() {
         TestJenkinJava LCS = new TestJenkinJava("dzfelxpniucnhqexcumxhfkrskzuldjcottqhizmrcqapxnditozzigxmfqmfivhdznrpjnnizvoebicsbkkhntfjss", "tmkqzfdjfhsqhnjahde");
         assertEquals(11, LCS.getLCS());
    }

    public void test65() {
         TestJenkinJava LCS = new TestJenkinJava("ypvltlagryaowjxnfwucjygzwxxhmaeqvuubprupohmjiyb", "sbwshtympwvndpurcmxexhrqxzxhksirourufk");
         assertEquals(13, LCS.getLCS());
    }

    public void test66() {
         TestJenkinJava LCS = new TestJenkinJava("lsfrejvxwtzsqrptciktxinqyidcpkixmgcmbwnxctu", "tedtvwuthvgnxeiprnabncxwflycswmgcxwkbxmlhbsmnfgmitjrgvljeyvtnrszpwcupdciwfcyoiaagtxgqdguyaiglitatkg");
         assertEquals(18, LCS.getLCS());
    }

    public void test67() {
         TestJenkinJava LCS = new TestJenkinJava("qkkxngvbvslafapoziwpqrhtqxpndzmscqjhjvbytwvyrukybrbpxodasuowyouyvgbzynyk", "jepzpnglupnjtochciyfsehpptjrqaytjubybpbuntovbxgxqjwxpvtxlsysrgpomrlwpopzrxgfulaanmo");
         assertEquals(23, LCS.getLCS());
    }

    public void test68() {
         TestJenkinJava LCS = new TestJenkinJava("yhpulqpevuqrvoxllhiyiafkabbgbgdhtprrjxlarijigntpilmc", "xvkikrzbatkhpzcwssnzyzydeawtfzopizyruahnzdhlshyewvsr");
         assertEquals(11, LCS.getLCS());
    }

    public void test69() {
         TestJenkinJava LCS = new TestJenkinJava("lp", "fjyqeksvdyyvtysncs");
         assertEquals(0, LCS.getLCS());
    }

    public void test70() {
         TestJenkinJava LCS = new TestJenkinJava("tampzibxvzhzfkspbwsgaoyjvtvprtpongrrbmnzkdamapqaozfsbklqpufskcwumpoo", "fhhz");
         assertEquals(2, LCS.getLCS());
    }

    public void test71() {
         TestJenkinJava LCS = new TestJenkinJava("jcuylpvcdxpxuwlowd", "gnvcdzurrndhsgjzipke");
         assertEquals(5, LCS.getLCS());
    }

    public void test72() {
         TestJenkinJava LCS = new TestJenkinJava("vbgny", "dxzbkdbhvyihmchoivoopiqsssli");
         assertEquals(2, LCS.getLCS());
    }

    public void test73() {
         TestJenkinJava LCS = new TestJenkinJava("uishtznhaxyybkvvyufizrrftsbpgleickabxhdfxrdf", "vtpaexijisjaejnwuhdycpigjyvdiqcshippduljjgdrtebcseaacdsujtixffpersrarquabrdoswqvwpbyyzeyitnnr");
         assertEquals(18, LCS.getLCS());
    }

    public void test74() {
         TestJenkinJava LCS = new TestJenkinJava("mvqkdl", "varsygwirmfhgdxrloladmugfdfknhbpnbtuyqmqssdvelzdwlrjuvkwlahooodfrpkustivbuzivyydjzhisrcwopxtpdnqfha");
         assertEquals(4, LCS.getLCS());
    }

    public void test75() {
         TestJenkinJava LCS = new TestJenkinJava("vfvixwtykvskekaczccwingmpeeclbgctpqwgegmforeoxhdlbkmqgvjncylmnfykgrehixpxns", "fejtcwilgyovjefgpjln");
         assertEquals(14, LCS.getLCS());
    }

    public void test76() {
         TestJenkinJava LCS = new TestJenkinJava("gechorqsgvwwccyxzqhtwqsndqdmbmskzjtboxxitkdihusiinwluceuufwosnexlj", "lwoufinvtusadgmqgwdshhrdtiyvcdzpvwwcqj");
         assertEquals(14, LCS.getLCS());
    }

    public void test77() {
         TestJenkinJava LCS = new TestJenkinJava("vhzvlsxtuvrgwbyzuvaarpdjpjhvrklzemsxjeiognnjprsvqdseohwpegrbxtybbadunkxhzadblvebssgjkwtdjmdqhdobbfeb", "xfhafremewyodpjfjfytsxolcurhndzcucmsdvidvdmiuzdyk");
         assertEquals(19, LCS.getLCS());
    }

    public void test78() {
         TestJenkinJava LCS = new TestJenkinJava("usg", "welfrbndkzhwuojupkzykboxhcvqwfjshpbhwmkgozwqwdwbxpbc");
         assertEquals(3, LCS.getLCS());
    }

    public void test79() {
         TestJenkinJava LCS = new TestJenkinJava("cfxblivgszaymeoubenapgodbfepmwllkrgxymftdickdnaxhkjedwlziujibaisvfieftsjbuvnlsuotnmgslrhulw", "uhzbuvdrllwzwjpmhfobpatufzkvpzzokwulfhdqvydakwffbgcswnlrbhzxiekpuzfyobhgupicgxpqsxsnkqcjgldtq");
         assertEquals(28, LCS.getLCS());
    }

    public void test80() {
         TestJenkinJava LCS = new TestJenkinJava("klaikhtvngeetmtuvejhyrusdywrrldyrxtynezxmussfedvadumrcwoddvfdbzheohebcemzydbjfnlfitvmttr", "penispqkejdvbtkbhmeyhhiywbmlsgkxogqhjgzmrqxzdwlxqumlubdwz");
         assertEquals(19, LCS.getLCS());
    }

    public void test81() {
         TestJenkinJava LCS = new TestJenkinJava("dzumaqplauqoxonteyjwoxbrazdvwypxjxxkzdxceudyhvleglchq", "nyjeerttsptzchfvdfrhpxdthduzemxsifbiccefxfbochmfpljmtd");
         assertEquals(14, LCS.getLCS());
    }

    public void test82() {
         TestJenkinJava LCS = new TestJenkinJava("eykpbzvlhyvyu", "mpvbttntubvpvbgiw");
         assertEquals(4, LCS.getLCS());
    }

    public void test83() {
         TestJenkinJava LCS = new TestJenkinJava("ozvienlkydmfvsugcjkdfdnbjcbrmnnchvygtzdxojzycuoswnkxqgfjochkifbhtfajxpwgnnvhxsdqwo", "abuhuzqrytmzfrjksmhtcvbrdutrfflvdljwbvpmidrmglktrgbcemmxw");
         assertEquals(19, LCS.getLCS());
    }

    public void test84() {
         TestJenkinJava LCS = new TestJenkinJava("prfnxkkufdfdrifxvefqcteehjbivvcweaxbvetrdfxerlrdx", "uoyfzeqwuunqdzjlpzleomscfrjwqqfcolqeqpthubvgsejih");
         assertEquals(13, LCS.getLCS());
    }

    public void test85() {
         TestJenkinJava LCS = new TestJenkinJava("fzetksbnewldkhcoonptyqolztpylqx", "znicmbcjimwwsagoqqbwwntslwhekvncjrvwkudfngzqbyskyydkrnmope");
         assertEquals(11, LCS.getLCS());
    }

    public void test86() {
         TestJenkinJava LCS = new TestJenkinJava("lqholltnyowyqflwscaidwgugvdnxd", "wuhbyzixuykionjlrqkrggtcticfrxlnltxwqwoaavdbrygkzlfndqrfqssbo");
         assertEquals(13, LCS.getLCS());
    }

    public void test87() {
         TestJenkinJava LCS = new TestJenkinJava("khflbkegsmexsvgfrhrvxnayvghkyyzhangnffehldaumtutsyxgrixwi", "bkyuzndzxmfgfcxabaualoanjemftetdxjqjxhzvgvjokyadhxxliztjia");
         assertEquals(17, LCS.getLCS());
    }

    public void test88() {
         TestJenkinJava LCS = new TestJenkinJava("nyxnhhmujtyyuraolkurratrpjmgpyjopyoewdtiqtwsfj", "xncqjgdbzqjpowvundmqzwwriafdfjsgulucoqwctrzorioljkgypjczdgm");
         assertEquals(15, LCS.getLCS());
    }

    public void test89() {
         TestJenkinJava LCS = new TestJenkinJava("murqkajtofgyaiudivsstlcaieujwqnwmvabgzwjavodnn", "azlpvtmibhmjvmoepzvqirpawcgncangjsxbbmufcwylpyqtjhljhkkbdhlbbd");
         assertEquals(12, LCS.getLCS());
    }

    public void test90() {
         TestJenkinJava LCS = new TestJenkinJava("ficgxbwtedfjvniibqhbjkwnhwtxunnfdqllzkmrnmtkpxuzgdngipnkvecklvsxlognwpqunnuxtni", "sdupjnbrzahfufvzpmmswlfyplrgp");
         assertEquals(14, LCS.getLCS());
    }

    public void test91() {
         TestJenkinJava LCS = new TestJenkinJava("euhbflk", "zjktggsuunsngbjsoqiiklqtoazgogitjvoglapvaooywheyesocjslgpqgirr");
         assertEquals(3, LCS.getLCS());
    }

    public void test92() {
         TestJenkinJava LCS = new TestJenkinJava("rhulvrorbjpcmvtjhkawtcqkygekgyubvcbaidsonmixsxxkjgrxkyvcntwnrdoppselejjjwhr", "ogtfgogzimchucyhelgfwnrpuhfahqvvqburzammbtkttxpqtsmihxolzvcjuhkuyjmvotliqhximrslmzcmkqwrqyml");
         assertEquals(25, LCS.getLCS());
    }

    public void test93() {
         TestJenkinJava LCS = new TestJenkinJava("eickberfklqxrnfmmndvesbnselcxkzxjdisuurblmq", "comfjneomcrdehqtcqpupozgdfmpxiuxkvlqsnufoeweqavnonrdsglaljlelqnzqgdfmy");
         assertEquals(17, LCS.getLCS());
    }

    public void test94() {
         TestJenkinJava LCS = new TestJenkinJava("gpsabilmqqlqfxcscaqknrixmmebzpzdzpvxvaa", "ywy");
         assertEquals(0, LCS.getLCS());
    }

    public void test95() {
         TestJenkinJava LCS = new TestJenkinJava("ilgvnkibbnvdcpzodfmujmacittaqkwfjgwcasywxsgektjpneu", "ctrklghgiehggnbakqmnqptxdedwmpilcxbehosmakzneyloljjxsotamrngggxtxnoxneqmu");
         assertEquals(19, LCS.getLCS());
    }

    public void test96() {
         TestJenkinJava LCS = new TestJenkinJava("gltsymwlnwgmukvoimyomnzogcjaztjyyymqaxqgjzimxjngyfudpcfneykrmpjdgcezdaphbkgboyk", "jpjmuqrpjubbtmmjhlefqxhosorrgqgmmysue");
         assertEquals(13, LCS.getLCS());
    }

    public void test97() {
         TestJenkinJava LCS = new TestJenkinJava("pi", "ntowovccqwhbsptfhogyrxtxxyyqqdgypyhcrvzyowkyskwjkgfrlavaijkccfgpdskefuxdlhfm");
         assertEquals(2, LCS.getLCS());
    }

    public void test98() {
         TestJenkinJava LCS = new TestJenkinJava("muhgdvoyqivbrsvdxbosqkdbifaugijqvyzsgectslqtbfyvfejhhkzgdiauuoenboqncyywxjowrzfpknbulpxkx", "myhrgknkihwmigacvhtvyldsfaxhcceoshlucjj");
         assertEquals(16, LCS.getLCS());
    }

    public void test99() {
         TestJenkinJava LCS = new TestJenkinJava("hqedxhrdiwqafejsttnzfozxssnqleeplzynfnucdhwokzgysysmwhyzkckavqjkmxmsgtlqkvhttjimyjtucshynlmmjrtzryo", "rrekbyxidfgporhkdzgkfqfkooanqxqtgrxpkyspchvqgqoedsxucz");
         assertEquals(21, LCS.getLCS());
    }

    public static void main(String[] args) throws Exception{
        Result result = JUnitCore.runClasses(TestLCS.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());

        if (!result.wasSuccessful()) {
            throw new Exception("FAIL");
        }
    }
}