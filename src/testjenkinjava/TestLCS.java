package testjenkinjava;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import testjenkinjava.TestJenkinJava;
import testjenkinjava.TestJenkinJava;

/**
 *
 * @author Thanh
 */
public class TestLCS extends TestCase {

    public TestLCS(String name) {
        super(name);
    }

    public void testLCS_1() {
        TestJenkinJava LCS = new TestJenkinJava("aaa", "aba");
        assertEquals(2, LCS.getLCS());
    }

    public void testTwo() {
        TestJenkinJava LCS = new TestJenkinJava("abcd", "abcedaba");
        assertEquals(4, LCS.getLCS());
    }
       public void test0() {
       TestJenkinJava LCS = new TestJenkinJava("bnokyxzkxbffiltjorsumnefjcttuhvvwtbwwvngsfjvgqfzzjgzafcxmjxorikrahhzvyyathtlqapipmfebtu", "fswaaoidolqqrsfahrzwlovvkhwwrunziixwybpiraflohyazginkdsyexpzbqbddzfvylfbeemmr");
       assertEquals(23, LCS.getLCS());
   }

   public void test1() {
       TestJenkinJava LCS = new TestJenkinJava("dedpqqgosgmhmygrqakdpqcvgjoxjftbnphwhnlkmlqwcsyhobia", "enwoqfjbykwogydeleqkafukwczhxerxelcarajbwixqlssor");
       assertEquals(15, LCS.getLCS());
   }

   public void test2() {
       TestJenkinJava LCS = new TestJenkinJava("iherwqtmvsewefsvkbevbr", "jnvtmfazshuprmzjqejuqgnwruzeupqosxtibdaeigcwokstcqmpoalhoupawvhzbhhjjmzug");
       assertEquals(10, LCS.getLCS());
   }

   public void test3() {
       TestJenkinJava LCS = new TestJenkinJava("igkdkcrhwqrhrnthfzapbkeuystqzweavplzxnyrxcmdnxtojbvapgxtnslkfmzyydpgpakuumkmgwzclmdoxfdxulvkoiq", "ojnflxcmwjvvtffpmnzbltwhknjec");
       assertEquals(14, LCS.getLCS());
   }

   public void test4() {
       TestJenkinJava LCS = new TestJenkinJava("wtifwnkhguaokaogubw", "orncsmiyk");
       assertEquals(1, LCS.getLCS());
   }

   public void test5() {
       TestJenkinJava LCS = new TestJenkinJava("vdckcjpiwhvdfhseorxbgsjcgifydnfjmwmunhvplucchgcyehfowj", "udkgjhyflghrvtwqjcgpqiywpwuavnankxgeqikqqjnstpopiqxrczbzskxenzxxorpintxcuhvcy");
       assertEquals(20, LCS.getLCS());
   }

   public void test6() {
       TestJenkinJava LCS = new TestJenkinJava("ak", "awkdttvollmkpjlftpxwotyavhhaqshcarwwnkjsmgdatvjmdcwtfqkvdfnjjjcunchsqkvbkmmalfsumfihgmykeijmuzqn");
       assertEquals(1, LCS.getLCS());
   }

   public void test7() {
       TestJenkinJava LCS = new TestJenkinJava("gpilgjjqkkvwirlyvbpfpatjiwdomdnmxyznknicmlvelgtkghebdikwpcwrkstyivwpxccppqzfixipbqlfc", "jumauttcmulmebnitrwi");
       assertEquals(11, LCS.getLCS());
   }

   public void test8() {
       TestJenkinJava LCS = new TestJenkinJava("hvoywykudzxkfhxanokpvikcgvvofubfaryrtwkarijetqexohupeaqlqmljqvivbymdyl", "uoncisanaucfymokabwyibjbhrfwzmpdrfdrhryqirgqbbrlbtafuxsuyjmaquysij");
       assertEquals(18, LCS.getLCS());
   }

   public void test9() {
       TestJenkinJava LCS = new TestJenkinJava("hylrfrkhfhfnrt", "plgvdvqxhobbudigzppo");
       assertEquals(1, LCS.getLCS());
   }

   public void test10() {
       TestJenkinJava LCS = new TestJenkinJava("idschseuxqxtkvojoyedmdotchnpsjxzzemominmthtwxgcsvlvnabcsijlnidlxvcmfwb", "cgqyjmxsfqakcozslotwyiiwmprtgjidmnbowtknzhswhdglhpfdyfwclagoejiygnerahobcwremayuqepxfizzq");
       assertEquals(23, LCS.getLCS());
   }

   public void test11() {
       TestJenkinJava LCS = new TestJenkinJava("yclhumewspcirqluiqfqnuexchbpvvwfsqsdfseluhwqkfcpljjpnjwafykdqxglqzshrzigzuhso", "daodgkxxhnbfgxqedsvwxjmuiotwcecpafexyc");
       assertEquals(13, LCS.getLCS());
   }

   public void test12() {
       TestJenkinJava LCS = new TestJenkinJava("dakohtinnzcygqhonmhwdirplickvevyrmwhkbqhoviwklvjnftvoecwwofufalzkopffvoiuccavnlgqwafvakofe", "qcdnwxnzgicjrjzcocvisqmvjzgmadoubvkprespdmfxlnzesscmumpalonzcxbeprkqncbgv");
       assertEquals(25, LCS.getLCS());
   }

   public void test13() {
       TestJenkinJava LCS = new TestJenkinJava("wvmwvciroyyxyhpgsscsodfojlppzvrfjsvizfxsclswvjntjxezxwtmufvpyoi", "usv");
       assertEquals(1, LCS.getLCS());
   }

   public void test14() {
       TestJenkinJava LCS = new TestJenkinJava("ybgxeaxrruqewfvnelqw", "knmtfnorvnyommsaekqketcddr");
       assertEquals(4, LCS.getLCS());
   }

   public void test15() {
       TestJenkinJava LCS = new TestJenkinJava("wnvgdslivylkgabfkrbrjkzmdvylqibxpvqirgbemcxisjstkgzyqnlifjzycrgqqcmwjmffhhtdreutuujzdjlolixaeltslf", "hevjxpoqofzburjsoeydlgenpleqazekoyhitcnncepzwdaalabxaybskpythqceelmmeozusiqrzwdfqjjaxqrswegmdb");
       assertEquals(26, LCS.getLCS());
   }

   public void test16() {
       TestJenkinJava LCS = new TestJenkinJava("ipojbrmfdxgwgzsbdati", "q");
       assertEquals(-1, LCS.getLCS());
   }

   public void test17() {
       TestJenkinJava LCS = new TestJenkinJava("lcml", "ebbdzgqtunwgfbljlpyqfaorocvcfpefji");
       assertEquals(1, LCS.getLCS());
   }

   public void test18() {
       TestJenkinJava LCS = new TestJenkinJava("uwcqjmliqqxyoycvplxvruzihvbcaujhuedllsbowfhfbedreohfxon", "dubfxmbapwoxfupjcaingcobybzzqpqwomhrjplrkg");
       assertEquals(10, LCS.getLCS());
   }

   public void test19() {
       TestJenkinJava LCS = new TestJenkinJava("ajlxhgpolmjmvpkiajhcelqjgzuoyxvzcdszwzyzllwqzrnijkayqitrkju", "howysamerbekzdbzleutysumiyrilcv");
       assertEquals(10, LCS.getLCS());
   }

   public void test20() {
       TestJenkinJava LCS = new TestJenkinJava("cmisylvxkcvrkosloxdarknzolmsskdjagthfevuruahxjadjacetveduinwsjubjhmcfwpkwqmvtoopqkqeubglgeamsfpgvo", "nrmvydxjsefcyqvgpyurvrcigbpphigyohpwpjevowktprcpaukduvctbzoudjnursymcuzqeanemtuscyoodxp");
       assertEquals(26, LCS.getLCS());
   }

   public void test21() {
       TestJenkinJava LCS = new TestJenkinJava("rrxnbselvxgnaopwpqih", "dgkebjwfvoeegardkndaatlljtvagbqtfssuvrcrhxfrrvqkafwawulzjzxiurdffipaf");
       assertEquals(8, LCS.getLCS());
   }

   public void test22() {
       TestJenkinJava LCS = new TestJenkinJava("djccixpfzdrwyxkfighsqxzablnemqxorcm", "omyfdgkbklrkxqxhqeaemkkrnufamqmnmbtbxshldracqwknforedhqilixo");
       assertEquals(13, LCS.getLCS());
   }

   public void test23() {
       TestJenkinJava LCS = new TestJenkinJava("vrjectaaqksjsbklpukjxpwuhmfegpbjjfoczplqxihqofqrwwdwqtt", "rdcseltlxsxrfcttryhxefylszjtslaotyjhgnhfbklbfjysojdkxnzlxgprdngadufapktipxcefuxhtilmgbilbbzjvizsysyg");
       assertEquals(20, LCS.getLCS());
   }

   public void test24() {
       TestJenkinJava LCS = new TestJenkinJava("nnyteve", "vyqtmrganedezkptrweyqivayrvftsohmhzrdxnaltew");
       assertEquals(4, LCS.getLCS());
   }

   public void test25() {
       TestJenkinJava LCS = new TestJenkinJava("sgsaqrpeqnrubmfqymwrvzerpdnjsjpxwydrnzw", "dxpylayycqrlqvghbglndczknmytlvgpypnhcjqhnhwqshozujobhhjovfvkzjmuqtodfilerinqg");
       assertEquals(15, LCS.getLCS());
   }

   public void test26() {
       TestJenkinJava LCS = new TestJenkinJava("uzuhgbseoodjgfolvosyesgdzbpkzkmpxhupoeua", "ucwxbxjryhjkbwvopbnlfpmjscipaclpjrmwpmzkogmdxgpfnzjgvhmjaedxvlkzzvx");
       assertEquals(13, LCS.getLCS());
   }

   public void test27() {
       TestJenkinJava LCS = new TestJenkinJava("qlfsyigegxzbakdwsrvfsqbvublaiwgthkzerlpqyuj", "iczn");
       assertEquals(1, LCS.getLCS());
   }

   public void test28() {
       TestJenkinJava LCS = new TestJenkinJava("kiacgbohzjdxqvaqspplhijqcxmxvzuialbaojvbalwvb", "vidazrrlibvmlxmjyclikazttzetupkmgkdzuqrukbtgqbdsaitjodpfiwmdtk");
       assertEquals(13, LCS.getLCS());
   }

   public void test29() {
       TestJenkinJava LCS = new TestJenkinJava("b", "iaswurjnyczhqsvzoysuafnndgqkhoif");
       assertEquals(-1, LCS.getLCS());
   }

   public void test30() {
       TestJenkinJava LCS = new TestJenkinJava("iprcntuprbqiywqehswzdfmqnnryhzbcaxeusdsuh", "vklakowzrmbvcnranamzkvyzttzqcioqnegcillmqccdugbgotjmstuwdnsbactmt");
       assertEquals(14, LCS.getLCS());
   }

   public void test31() {
       TestJenkinJava LCS = new TestJenkinJava("xanxgxlenanipiqthzhfirrkyrgzheuyqhnuqmpdabyjerahwo", "mmdunhdenzsbzskoaixkqeoazgukplkuqjylvrwqzhrskdexgnfi");
       assertEquals(13, LCS.getLCS());
   }

   public void test32() {
       TestJenkinJava LCS = new TestJenkinJava("geetkirpwzlqkqfyrtzsvmbwnnduvztllhqbxfmcfidfoubovmrkxielfcvsrslhzrlejzryesasv", "gyc");
       assertEquals(2, LCS.getLCS());
   }

   public void test33() {
       TestJenkinJava LCS = new TestJenkinJava("qzayssnwmfhxzwmnrmbukfmzzytkbppkmurisirypjoydgbciuvdecqemabisvcwnzjfotlgepn", "yeedgckmooyeraqddsqqozklzndsujplqzhispxqxgmhrluowfhcnasugfjdgbxvkgpkplfsd");
       assertEquals(16, LCS.getLCS());
   }

   public void test34() {
       TestJenkinJava LCS = new TestJenkinJava("pnwqkqzobkfqgeexarcadtfeezxkflqegjxzqomfgqqkkuidsustlcewealnbjuqdas", "gnkcvynkexewqhpdnunpq");
       assertEquals(10, LCS.getLCS());
   }

   public void test35() {
       TestJenkinJava LCS = new TestJenkinJava("qwrolgfpnduyokigpkclesyngdsxlvihgavwwnwgle", "cbcreriusilcfhryyqazmvmvmabdidopzetgzdnxgiba");
       assertEquals(11, LCS.getLCS());
   }

   public void test36() {
       TestJenkinJava LCS = new TestJenkinJava("mbdriqkqyruvfcympdeduhsdpanddqxsynurecgmfxkrooirjwzltfyzahuhpjjwjrsqgctrtvzvokftkshhoecqnk", "qynzaqhvnzkovijzqqtiajeymnzsvqwtvwmasbqdahaima");
       assertEquals(18, LCS.getLCS());
   }

   public void test37() {
       TestJenkinJava LCS = new TestJenkinJava("sansoodzoaomakkvqxbtqzobhshvfpuqncytkdrzhhsgcllpgowhinggzwheekkfmtvstupomyemangtckkcto", "buyzuplelkptsrqfcrjwavs");
       assertEquals(9, LCS.getLCS());
   }

   public void test38() {
       TestJenkinJava LCS = new TestJenkinJava("tdgvugexvngvkuhxbdlisbwswuyppvicvxyzrepjej", "pijcqkxgnactwox");
       assertEquals(3, LCS.getLCS());
   }

   public void test39() {
       TestJenkinJava LCS = new TestJenkinJava("fpcavpttyfiqpyhyjgfmpsxkoleyawbyelg", "exuzncfvodnayurethardifgpwqitsrezvxufnsywjtemxszmmksutwcncoamtkshhg");
       assertEquals(12, LCS.getLCS());
   }

   public void test40() {
       TestJenkinJava LCS = new TestJenkinJava("nsxlvpwwxtrwxahmihdqclaue", "etldlooujrdvlvkpcbzmfygxp");
       assertEquals(3, LCS.getLCS());
   }

   public void test41() {
       TestJenkinJava LCS = new TestJenkinJava("vyfxbmhdzzhkoprgvtqlnpybnbegfoopnwxnxcbwhscwejozulcoubpfgkzwaa", "vsbujafcdzxqyfsmfzikge");
       assertEquals(9, LCS.getLCS());
   }

   public void test42() {
       TestJenkinJava LCS = new TestJenkinJava("yiplezqzgbuncyzryyfcrcecdclnzgxfgxiioadmqzsyblhvjotqydo", "nftrouundhuktkmtsqndbedlghndtarmldbonaeyomgdpheexxjrozsllrcepsjgzeui");
       assertEquals(14, LCS.getLCS());
   }

   public void test43() {
       TestJenkinJava LCS = new TestJenkinJava("dmizcswhgolupgicygaxqacbniksntogactzymyrogksyvxjmjpijnpywbbzh", "sasygmtjdizryzevtzrduzacjqesdxiqvkefxlxfbyysfwazsriyqihiarcwuxutfctroummntohejvmrwvzbhmfmbhxsq");
       assertEquals(21, LCS.getLCS());
   }

   public void test44() {
       TestJenkinJava LCS = new TestJenkinJava("gqckpwetkzgpfjgvweqjfykald", "frbtfazomcgvwskanfckosfsdemjxwgnnvltpggphhvcavgpprddykovloynbjbbceielilue");
       assertEquals(10, LCS.getLCS());
   }

   public void test45() {
       TestJenkinJava LCS = new TestJenkinJava("tnogkhykkbwlglra", "szsovbkwaepbdzgskscugrpurwkzxrqgzclxntzgjadiegqrweosbiopfetgxjfjqsfqkjtcq");
       assertEquals(6, LCS.getLCS());
   }

   public void test46() {
       TestJenkinJava LCS = new TestJenkinJava("jamaxlsvanmdjuylruyyyvyxntisnmektvqhabbzerchqvozjekinrntcihk", "ghuqmvcgodsqmldhyqrywkoosyscjxvzflvouruljwphqbkebl");
       assertEquals(15, LCS.getLCS());
   }

   public void test47() {
       TestJenkinJava LCS = new TestJenkinJava("qsnuxwamvmifcwtxnfpahxxvxggxltokdgwhscvqagtqcdtnfwhgcvzcfezueaarlbewekztjurcvkbnsklqgfwtubi", "nqgjxynclig");
       assertEquals(6, LCS.getLCS());
   }

   public void test48() {
       TestJenkinJava LCS = new TestJenkinJava("no", "ljktyucbfclyzxeezvwkgpawroihbbagsblltaeutf");
       assertEquals(0, LCS.getLCS());
   }

   public void test49() {
       TestJenkinJava LCS = new TestJenkinJava("tgnbxjcrbkazjeduoocmsrrlnoybpon", "plzhtwnjyvmuinwbrzsseumozjdmyxksehtyivsymjnkomfkstinlwhmvdzkuc");
       assertEquals(12, LCS.getLCS());
   }

   public void test50() {
       TestJenkinJava LCS = new TestJenkinJava("wwufsthikwuytjeczjhfsnsvyiykxbfqtxduukaapfycjfzjuatbrlzpkwzilzvwetzistiywrowzhiczzapyxbvjcxefg", "ksuxsvviyvariwzceboyhtakvbtsjsptxsnmyqfqidlmwdtzmtmevhbzpodd");
       assertEquals(21, LCS.getLCS());
   }

   public void test51() {
       TestJenkinJava LCS = new TestJenkinJava("orihllcxszgftzqlmfgzemfdtpqpimrdjzafsrbhfwfvwidtdgvbnhszbspyoylxxqhmgnqmmciqvinwmlglfeorpjcvtuto", "ecgwsbblxykgwqkqxbdtgileedeipqfwxsuhxiwwjzgafnpdknhj");
       assertEquals(18, LCS.getLCS());
   }

   public void test52() {
       TestJenkinJava LCS = new TestJenkinJava("ygovcxflfvribtrnziopkcmcawfwrebjcmtdohxaxucvknidwjetibfsgkvzjbvjlhsrpmxkthgnndflnvazptpoepjr", "mitbumzfodimqropxuoceykakbfesqvgicbjaisbd");
       assertEquals(18, LCS.getLCS());
   }

   public void test53() {
       TestJenkinJava LCS = new TestJenkinJava("djcawfjftbcxexrutvpxhuflvfboeamyynnwaxynoumdgbtwykqtfvdnisegiaztoeipwujgobbujbhzcubmrrg", "mpgkaemaikybawpzfpizhldjcqfafojjpqlzsynbloscejcvmrbngpgqtzjbyhcclwlwcudxkdbfhxezzhljophjsingxn");
       assertEquals(23, LCS.getLCS());
   }

   public void test54() {
       TestJenkinJava LCS = new TestJenkinJava("nbhfwqfstswlhfgkfoptdsweqxsmimbthucgpsupe", "mru");
       assertEquals(1, LCS.getLCS());
   }

   public void test55() {
       TestJenkinJava LCS = new TestJenkinJava("micurhhupqphxrgfrqlrxtodaebmvnmhabptgvtmdhqemiliexphnwxwixiznrsrtdeivhltthlxtkvkwoy", "rqsamoatm");
       assertEquals(6, LCS.getLCS());
   }

   public void test56() {
       TestJenkinJava LCS = new TestJenkinJava("abekzjwuhamcyiexzfpzzoupxbffqasqwyespdiuqkxeoezbaqlkctcglw", "caoxuwkugvupjqadkinasfkokgrcjsfmrbowhphmqnqmqxzqhmbmiudbrxfcrnzgwnvheppfwxbng");
       assertEquals(16, LCS.getLCS());
   }

   public void test57() {
       TestJenkinJava LCS = new TestJenkinJava("pzbndiuusdcatrblfeohenrcsppqnxazpdsljjgxjbnctskpnuqywedrqiqejuxxmljzppkytr", "nxbkghfznnerlbkrjvhojsfiimzlozexayowiaxgpyofvqlhinolqornbrijoxbsygqtdxunqdpzzijbnqw");
       assertEquals(19, LCS.getLCS());
   }

   public void test58() {
       TestJenkinJava LCS = new TestJenkinJava("ksswcxeasnbofnllgqiyvdfdqhpbfrdusxkdzhzietx", "izmqbr");
       assertEquals(3, LCS.getLCS());
   }

   public void test59() {
       TestJenkinJava LCS = new TestJenkinJava("ddxuxsqyefqzrnmqkknykryflwfvhrrugjhzlqprzoslqnyeclrohruhjdzznccyldyqharmqatzvgpvh", "gmhttwlxqgzrqolzxtcytxzwthoghgjzpcktsyktfommgvobdon");
       assertEquals(17, LCS.getLCS());
   }

   public void test60() {
       TestJenkinJava LCS = new TestJenkinJava("optyl", "wrakzevuimbevzdyqkwgileoiphjhpbnyqfikob");
       assertEquals(2, LCS.getLCS());
   }

   public void test61() {
       TestJenkinJava LCS = new TestJenkinJava("swhafvlnkpmhrzjilotuukyfgbpergdyflouvdpsqzyfuuk", "pqtychgwqxoouvcuserxbspcwjgqbntjkfbriqwfrjuhcpixvumgamorpnlgwgxrcrrrdksnaiwvhjofqhwkyqmmicsmzqqfpu");
       assertEquals(17, LCS.getLCS());
   }

   public void test62() {
       TestJenkinJava LCS = new TestJenkinJava("zvekvccaokiyywoircfqyyfacrmurzhexcnpcrbmldtjlfwi", "ozbsxhhdppalpefdrpdvrhjanyzuhehbctrhmirhpqqtmvxxuwkghxsbzpgexlbxamgscdxttscdhcuohywz");
       assertEquals(17, LCS.getLCS());
   }

   public void test63() {
       TestJenkinJava LCS = new TestJenkinJava("nftdoqmkmkchsitnvlwhzrvbxlqmciqccgudqptjxs", "murg");
       assertEquals(2, LCS.getLCS());
   }

   public void test64() {
       TestJenkinJava LCS = new TestJenkinJava("xfjgpeamoszgonqsqzzzbgpiisrapifzvyyhhnskhe", "dniqoyjqgolvcnmycphzekmhlnrpydpvipgpymhsgmexmhpxhekgd");
       assertEquals(13, LCS.getLCS());
   }

   public void test65() {
       TestJenkinJava LCS = new TestJenkinJava("gzjxbnqovgaczyndoxxauospntxriptinrdkglyuwvspwexflgroixkfhrc", "lqgubhrnghzvqj");
       assertEquals(6, LCS.getLCS());
   }

   public void test66() {
       TestJenkinJava LCS = new TestJenkinJava("wubtrweyduhbhindtnypaamtqyczocshodnxyetmolthzfgye", "eudchfnyaauzlrujskcwygjwkaiafrgdthkmjkimteojudutajch");
       assertEquals(14, LCS.getLCS());
   }

   public void test67() {
       TestJenkinJava LCS = new TestJenkinJava("zuakkuhaddlnzixfzlnlgywqsxkffojfbjntcvugquwlpayxcbnxkzmiofbgllpjvqhuuswn", "dubcjmqicsgmhqvyzrdjmbmphotzafgeppkseqayblkh");
       assertEquals(14, LCS.getLCS());
   }

   public void test68() {
       TestJenkinJava LCS = new TestJenkinJava("exsmwxxmjyrtbqejesisyewxktlovirjnoyypafgdvprijaewvoegrqczgofcplkkooiqukyxgvtfnwwpcgbmj", "exdbvfdmggkneekm");
       assertEquals(10, LCS.getLCS());
   }

   public void test69() {
       TestJenkinJava LCS = new TestJenkinJava("skprxqmocdevfoqg", "llmancskfrhqicwpcqstvdsclznktliguhmnitqyskqbpwtzucocjpgcyxldnhindylcsigtczddcgisdffyo");
       assertEquals(9, LCS.getLCS());
   }

   public void test70() {
       TestJenkinJava LCS = new TestJenkinJava("dygbdfrwhvyytaujnillkl", "vpraubogfdexybiinihizl");
       assertEquals(5, LCS.getLCS());
   }

   public void test71() {
       TestJenkinJava LCS = new TestJenkinJava("rtajdqjprqiepkcttwimlfyjuobzjmslaurjrclylsryuyyorqoglltxtwkaaehaiowhvlkhgvzvgxlsbxzawdxfajejawarrtej", "qsccteoguffexlcdewhjqxzfikjuqz");
       assertEquals(12, LCS.getLCS());
   }

   public void test72() {
       TestJenkinJava LCS = new TestJenkinJava("lbvwicmowccvbqcukggadyczrltcggjmbtzolzwfbtfjlnkezlozaglzahweldtkkbzmwvaioyqapakxyqlbufmhlyydimrzsb", "mhfhfegmzjonsobjumfxoerinamxbfjhmbuerohelcveoocbtoqyasajidrukgbdjhwgmhrrxulrroefaxtjvorxmdn");
       assertEquals(24, LCS.getLCS());
   }

   public void test73() {
       TestJenkinJava LCS = new TestJenkinJava("zibjvsorofalggkwlktgfhskqhunufijqqbjejkyygxbyirlqpctpzhgkiedhavqmrnmjrmddzptyq", "wamwypfngkdffrmluewbkmrcabkarrpvdturyhgsvtckybycsvdnihffqfoslflvnbcogmgpcojitlixbz");
       assertEquals(20, LCS.getLCS());
   }

   public void test74() {
       TestJenkinJava LCS = new TestJenkinJava("ffblefqykpndckfafwpqhzomsghwozadhzibojpaszmqdqtoixegakgibogtctiqsnywwfoyvtuutsuamnogwnfrmhbsgvh", "parwczfobyhhyltpzshtkznssgidhtzzhzwaxfamabundmxjpobhfmhqxeutu");
       assertEquals(22, LCS.getLCS());
   }

   public void test75() {
       TestJenkinJava LCS = new TestJenkinJava("rxjwdqkjnw", "fnitukevtpblqasvwnw");
       assertEquals(2, LCS.getLCS());
   }

   public void test76() {
       TestJenkinJava LCS = new TestJenkinJava("gwrpwicuujnuolhoppezebjjpxgvtdfixherpjhvvnldhv", "sgimgpwoaxdsnv");
       assertEquals(7, LCS.getLCS());
   }

   public void test77() {
       TestJenkinJava LCS = new TestJenkinJava("d", "usxhhcssbfeauzqwhjgqhkhsvdojqejsesnirnkkeihotixdnuvhikjvwktuaqyokzowxkzfzkdneioszwiurc");
       assertEquals(0, LCS.getLCS());
   }

   public void test78() {
       TestJenkinJava LCS = new TestJenkinJava("ijkhzfnletgetxenuslrrxdiafwbuhonmaqnxpksifconsaxqsyiroywqpicyllmoraqkyeuxfkralqsvmmi", "zaqruunohdiludjidwgkhtgucinpspmkblxbuwfkilutqykfqgjylvpxuugftkztyjgsn");
       assertEquals(22, LCS.getLCS());
   }

   public void test79() {
       TestJenkinJava LCS = new TestJenkinJava("yttipikcduhqetiybgykwhbukacvhfpbfzy", "jxoepeevgyctvefmai");
       assertEquals(6, LCS.getLCS());
   }

   public void test80() {
       TestJenkinJava LCS = new TestJenkinJava("kfhzvnzodod", "auhwwwyxcmxcgibriuophsybfnskjgzmrulfxnbcopgpdwhzhlziwregkorfs");
       assertEquals(5, LCS.getLCS());
   }

   public void test81() {
       TestJenkinJava LCS = new TestJenkinJava("zssgzvuffozceazi", "jxexmoqinozrdcxhilwsvwwchuhywuuvmumfpgqzidfoolrxamztcbeizujgho");
       assertEquals(10, LCS.getLCS());
   }

   public void test82() {
       TestJenkinJava LCS = new TestJenkinJava("wziun", "adxwgbzplrwzqveyokrbbjgsduycahwuwosartktvpuabxetfom");
       assertEquals(2, LCS.getLCS());
   }

   public void test83() {
       TestJenkinJava LCS = new TestJenkinJava("myzszaybuuwrwymaugufigjsvngrpmaljka", "awwynxbwbotcmeqxuixtjcvazhateqzpmarmcjjtsjtmhzqscoxrclxvchw");
       assertEquals(12, LCS.getLCS());
   }

   public void test84() {
       TestJenkinJava LCS = new TestJenkinJava("asoneuirthbbowucedzvxrbeoteblkmtxhpwkbegoercaygtqejyvrshmbbdrtdlmcovdhcldgrrtzoavhmlougc", "bxypuaoyhzbqvprdlhfpsopopgpltbapectsvherffnawdxwxwrrsizthjicstwytzwbubkzximvrtiyysnpuwwaxye");
       assertEquals(23, LCS.getLCS());
   }

   public void test85() {
       TestJenkinJava LCS = new TestJenkinJava("glojanmrtoetqhrbqeujmzpfuujcjrsoeypthtjbviackndihzyuowxcmfsjshoqjopzayaieqdkhalhxpisryzwxxelxekuhiv", "lotsdxmsoniiibczweqeksyxhmarcomdklhqrwjxmniovxyqx");
       assertEquals(22, LCS.getLCS());
   }

   public void test86() {
       TestJenkinJava LCS = new TestJenkinJava("vvylfclytijbhatahzyvejuzbnjgzgpnwfxqlxmgelzloqlsocyzkqufkwkywsacdtjgkabpvppqznwtgdktyglh", "lmnucemr");
       assertEquals(3, LCS.getLCS());
   }

   public void test87() {
       TestJenkinJava LCS = new TestJenkinJava("agrwzzevvpscinwnomykwrgv", "iinocngremwfhrwtpbpcp");
       assertEquals(5, LCS.getLCS());
   }

   public void test88() {
       TestJenkinJava LCS = new TestJenkinJava("grygnqpmquyjtsgkzzgbrmvrxonasqoqtyolwgdlvecadytkpnjujqbbop", "opdpcpdiozrzthfcuxmuusemihipeflbaxqsei");
       assertEquals(7, LCS.getLCS());
   }

   public void test89() {
       TestJenkinJava LCS = new TestJenkinJava("rqphdvoflfnx", "psqihpwmqxqwldnfsquydizwudblxrdgwbsmrwreeddtqtdjmtpkpagnwexxpoewlatloy");
       assertEquals(6, LCS.getLCS());
   }

   public void test90() {
       TestJenkinJava LCS = new TestJenkinJava("qexphtwskhjtf", "vxpmwbczdgjylyyqdbwzxcegsqhfhgwfibyn");
       assertEquals(5, LCS.getLCS());
   }

   public void test91() {
       TestJenkinJava LCS = new TestJenkinJava("mchkvvusdfmroxvjllqmxzhxbjijhpkiaqzqpqbsezfzlkpzkqxtztugbnaldwbodysjkugdge", "waskgjvbyzzpgncbdyeoxclyiuotwkukmlqvjgbskocmzphtoobvwbkflsgfcmtncjrytdweqxlsyffqqvlmavcjuulwa");
       assertEquals(21, LCS.getLCS());
   }

   public void test92() {
       TestJenkinJava LCS = new TestJenkinJava("cshwmnfoziclxjaqidmgfmxwhfphkyktfe", "baljcprsylxsvxvfwguwuubgwvldyokpwdmpjcackdyicbbtdceutixorwxniozdtbltluewzlpozn");
       assertEquals(11, LCS.getLCS());
   }

   public void test93() {
       TestJenkinJava LCS = new TestJenkinJava("zvvbbpfhdmluzxcarfqgzuxmkfwbozi", "rduhmmilokovjeqbxtufxowpeisywyftibkwuhrybulyocoogsnsa");
       assertEquals(9, LCS.getLCS());
   }

   public void test94() {
       TestJenkinJava LCS = new TestJenkinJava("ggglfwiqrnuzjfbcrumjghdzwxlponzvgoyjcshjhigjupfcsoxkyhwfhdduxgjawffyfjumfxlfnwsuypbnqtucra", "tqcymnamkwzafmowesnsbbrostfhyaxsziybyfickswnwutfyekdbsbpblnxpgnaebznypynqlxgioqibwkbhpiuqxzlwlrjl");
       assertEquals(26, LCS.getLCS());
   }

   public void test95() {
       TestJenkinJava LCS = new TestJenkinJava("nxnkytqgxrzzxjlbqigiuaxvrmft", "vfbwokomtqpwjwmzdrtxkogdznfciiqmolcocsnaitqlnchvtphdrocodpbwbpaiwasobvabehdwmcxlgswkdfbheorvcpky");
       assertEquals(11, LCS.getLCS());
   }

   public void test96() {
       TestJenkinJava LCS = new TestJenkinJava("ctvzqrfoqoxfnig", "jyqyozjrolhrxugimohmdnenpp");
       assertEquals(4, LCS.getLCS());
   }

   public void test97() {
       TestJenkinJava LCS = new TestJenkinJava("orgtpuchomntebgliopwmrrepsowkyx", "loxzmndoxaohgprrovdgjasprisdtdtzoxuzjzpywjrbcndzojojnzpnfdfvneajhifoimyikvfhrfbyirfovg");
       assertEquals(14, LCS.getLCS());
   }

   public void test98() {
       TestJenkinJava LCS = new TestJenkinJava("clcegwebyydkkyxeaxuhaltfauwggkxjclrsujgfvilokknmopqekrykagihnwxyhihhjrjdtrboqwmkkpdmlknvzmrsazrc", "lmxkqvdpgixrbbzneggpxneawvhziezsdcwbdpcvqyawsmzftjiyyqqhvuklsrateackicznghhnwybaauazbswa");
       assertEquals(25, LCS.getLCS());
   }

   public void test99() {
       TestJenkinJava LCS = new TestJenkinJava("tuihgptpjlevxfiksotcvotzakkdgoronygrpoytjokczvrfibkwf", "jgzathbndgfmxtcyorxszgbrwdosejfhznkttrnraeeeoxh");
       assertEquals(13, LCS.getLCS());
   }



    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    public int getLCS(String stringOne, String stringTwo) {
        int m = stringOne.length();
        int n = stringTwo.length();
        int[][] a = new int[m + 1][n + 1];
        stringOne = "0" + stringOne;
        stringTwo = "0" + stringTwo;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (stringOne.charAt(i) == stringTwo.charAt(j)) {
                    a[i][j] = a[i - 1][j - 1] + 1;
                } else {
                    a[i][j] = Integer.max(a[i - 1][j], a[i][j - 1]);
                }
            }
        }
        return a[m][n];
    }
    public static void main(String[] args) {
        junit.textui.TestRunner.run(new TestSuite(TestLCS.class));
        
        Result result = JUnitCore.runClasses(TestLCS.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
            
        }

        System.out.println(result.wasSuccessful());
    
    }
}
