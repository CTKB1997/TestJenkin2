package testjenkinjava;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import junit.framework.TestCase;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

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
         TestJenkinJava LCS = new TestJenkinJava("qwgtepvudakbmzrqoqejlaeqbypbtshbtrux", "efbqwnnipbunubbspbjfpkqwrqggjxxjgedlienjxorqlcmqoec");
         assertEquals(11, LCS.getLCS());
    }

    public void test1() {
         TestJenkinJava LCS = new TestJenkinJava("cbocbvxryykd", "cktacswrwmyaresvodufkvouxw");
         assertEquals(5, LCS.getLCS());
    }

    public void test2() {
         TestJenkinJava LCS = new TestJenkinJava("ktctvcxfjvfikzgvlrelrdnceoavvimb", "xmppfzfctermslzdtxpoytnviabchhlktnzx");
         assertEquals(10, LCS.getLCS());
    }

    public void test3() {
         TestJenkinJava LCS = new TestJenkinJava("efyhaxonbfcojoqnewsiqypxlvuwmwvjomrxgqkmpzrjysxpvqeeiqwbjjosbjxmgomerkqaalcy", "zjgjiwneevodsgyyiqzblqszggrnfgcflmlumaddovcmwwiqqqlvmahsvytjrcdomcowzemhx");
         assertEquals(20, LCS.getLCS());
    }

    public void test4() {
         TestJenkinJava LCS = new TestJenkinJava("cafvwbgfxarutmppkbfznadzjqnwxbzllbfgnvsrpvozhlymwirajcjdcgmrlffhsgyfxzizlqhcqxlydxvgjclekcgnzjqupfu", "ukwum");
         assertEquals(4, LCS.getLCS());
    }

    public void test5() {
         TestJenkinJava LCS = new TestJenkinJava("xgmexxnnkjatufhtyiecjwucryvkhwgcjmypsnkkizeoslhhkksdtdvxlotxnkzorgxycygzladascfh", "uxzywwnmcixmkxckoftgwjphltgulsvzjcwglljaqjzxbbviztwcwclnaittjdlcorbhgdjvpxnhjiqaaukzwhvmqgcafdrqz");
         assertEquals(28, LCS.getLCS());
    }

    public void test6() {
         TestJenkinJava LCS = new TestJenkinJava("qkavcqcnxctwlrgjwuoydbskzufasfrmhixopgsriexpjllaslzstzljbeqptbfufc", "uesdnvxcorthvoyucvkymmkwyej");
         assertEquals(10, LCS.getLCS());
    }

    public void test7() {
         TestJenkinJava LCS = new TestJenkinJava("evxdpgepdzexhvsqnixpsbkhvrharbuwagenokcyhruowlsixpnqzgbnquzgandygrtq", "zsbpllarmnljbsjvedvtuliwiseycicrkcwucmzerpjefevydpdjvghw");
         assertEquals(16, LCS.getLCS());
    }

    public void test8() {
         TestJenkinJava LCS = new TestJenkinJava("nmoudqwhjmlbsddmxtxakofhwgkcpihuvlojoachbihlrcwdnwwfczlvdyrlpgvzjzgfjjvpdk", "s");
         assertEquals(1, LCS.getLCS());
    }

    public void test9() {
         TestJenkinJava LCS = new TestJenkinJava("bqljtowultfehsepjgmmoahslcqtqxmbnvmyudlnmjivveeavkalrowlkormvqzjizfaeotvyrgzrdlpjhnqqt", "juqop");
         assertEquals(5, LCS.getLCS());
    }

    public void test10() {
         TestJenkinJava LCS = new TestJenkinJava("fkuasfwuyslssgnf", "ztiuykjomnbyttkbogijavpguqylnuiwits");
         assertEquals(6, LCS.getLCS());
    }

    public void test11() {
         TestJenkinJava LCS = new TestJenkinJava("jjlxeancubpelidqstzpusbhaqjtiblijzqkktnlobaesvsfcfvuhjvdljibqgrbmxjwqjdykryrt", "tmryowufsnoivdkxfsrboqhihjpzejmrweuyhekaybnrwysuhbnjrxlzaj");
         assertEquals(18, LCS.getLCS());
    }

    public void test12() {
         TestJenkinJava LCS = new TestJenkinJava("ln", "ipvpzpidzhyvhkelrztqdmycmwobxsmyxdufqhxtxqhztajcsnnfrbesz");
         assertEquals(2, LCS.getLCS());
    }

    public void test13() {
         TestJenkinJava LCS = new TestJenkinJava("xzwfojuhdzhriiidfrxzvknisfqkehkymrrreaogrgcvfubcqvqutbmtlasuygmcsbmdwveyxebroyr", "tmcabybrnqkpktkxjmigpdqsgbevwyxwbmwcdw");
         assertEquals(15, LCS.getLCS());
    }

    public void test14() {
         TestJenkinJava LCS = new TestJenkinJava("onnclzjeslulksxpufoorqxeefvlrxdcigmkrgmcohvaxpzkuwgxsjeofxm", "nrbwjcb");
         assertEquals(4, LCS.getLCS());
    }

    public void test15() {
         TestJenkinJava LCS = new TestJenkinJava("wgaroieqcenjaysdaycxhmnrfalhzjzjoxvpkemakcdspob", "boduqekolislxhobjgehmebbxmozehryrijwllfkabllofjrzcnwuzqzmcocdyhjzbhyllsgsccxraxptzvsimguohhgsbyej");
         assertEquals(20, LCS.getLCS());
    }

    public void test16() {
         TestJenkinJava LCS = new TestJenkinJava("ldufekgvxrwtdcchupwxcvm", "phsmgnnbgekpfexgodoeoxahhnplgnctqnskbbakwvnsaunurdabykqnyjvcnrowwhpqgoaorawsjfltargfedrhjybvqquyjccc");
         assertEquals(11, LCS.getLCS());
    }

    public void test17() {
         TestJenkinJava LCS = new TestJenkinJava("cofosccxlmpjkxrcdvvnjotwtcnwertuwvibnkiwodelbedpccrqnrczuvkxiwqeekftupttqxczmefgbjpjzbcgqvrraipz", "glo");
         assertEquals(2, LCS.getLCS());
    }

    public void test18() {
         TestJenkinJava LCS = new TestJenkinJava("dsc", "knzbiblmeembscfmlaopbngwqamxpbhaxdcyakvlsoocgkmxygstbdzcdqktrwljgatpagnlyjbpacat");
         assertEquals(3, LCS.getLCS());
    }

    public void test19() {
         TestJenkinJava LCS = new TestJenkinJava("cbab", "jtssqaqwkrowvmtqutnslmhbtbnpusxyaxysomximpuamtloaoouobfltbowkxvr");
         assertEquals(3, LCS.getLCS());
    }

    public void test20() {
         TestJenkinJava LCS = new TestJenkinJava("xnsjqfvrvnxjtsksuzetqxexvubiggebwgcgqdrqbbwapgrfkyru", "kwkyfjmjyzclstxhu");
         assertEquals(6, LCS.getLCS());
    }

    public void test21() {
         TestJenkinJava LCS = new TestJenkinJava("ytbueskxcizestigycudfwgzxewjwtcavcvbivkuxtfpoauptbqtuq", "fxvfmxqmcmelgugmg");
         assertEquals(6, LCS.getLCS());
    }

    public void test22() {
         TestJenkinJava LCS = new TestJenkinJava("rpznxppyqcqmfkymbctwsuufvxxocsdhonhmlfbzwmubibmubrqugfkizacvhowpjsbjuarnbjnskwwfvaymnzomayxhsiilbxp", "gmphyizbuixieobuimoijwoqhjqnrseabspvckaijnxgriacprpwlielrhuelyyvqvzjwwumxanbasonotxenll");
         assertEquals(26, LCS.getLCS());
    }

    public void test23() {
         TestJenkinJava LCS = new TestJenkinJava("rdndkqwsljdyxwcalgvbfobktvsququsgqgkuiotqtejngwjl", "kxforhckllwvtxkrqfwdnpznxydzyitvdgfilbufvrzamrfdlsrypjiyalajhutqeebjop");
         assertEquals(16, LCS.getLCS());
    }

    public void test24() {
         TestJenkinJava LCS = new TestJenkinJava("nhhnmuqsdvyivon", "kobxdysovieziarwjdacuuycjj");
         assertEquals(3, LCS.getLCS());
    }

    public void test25() {
         TestJenkinJava LCS = new TestJenkinJava("gomuovrmcharxsyvdb", "dyphhuwlvsgosppabzrykbdbcfncpqalrrsjhjjujpvirdcandevjgd");
         assertEquals(9, LCS.getLCS());
    }

    public void test26() {
         TestJenkinJava LCS = new TestJenkinJava("jjqhlotlwsvwzaffuzgbfksujktdevfmouoegkccgunnewcn", "ipfgnjjbxyxgqftz");
         assertEquals(5, LCS.getLCS());
    }

    public void test27() {
         TestJenkinJava LCS = new TestJenkinJava("wifityfcqfgcgeiitgtsukzgxpihyddowneiurhwhmynitbxxrvcors", "fawwjnuyaaburqvjytxtumqnaeloivyov");
         assertEquals(11, LCS.getLCS());
    }

    public void test28() {
         TestJenkinJava LCS = new TestJenkinJava("tu", "padewaldxamlughudrmeof");
         assertEquals(1, LCS.getLCS());
    }

    public void test29() {
         TestJenkinJava LCS = new TestJenkinJava("xplezixghhkqgrjjmunribgzkeueibgmzqjfahqrzraflybxqhysoibybhspchnwadtdsshlnnrxydzzfrjutg", "qphzhkppojxzccyhmfkllwaackydqiub");
         assertEquals(14, LCS.getLCS());
    }

    public void test30() {
         TestJenkinJava LCS = new TestJenkinJava("mgbykfuwgmcylh", "bdbudrfxtxhhvrfwygxzegntjoadtaegbaankg");
         assertEquals(4, LCS.getLCS());
    }

    public void test31() {
         TestJenkinJava LCS = new TestJenkinJava("fubgyaqxekpeatjtxuwonqdrhwumymlzwbzthwtxixesrqfbtvaozvafauwpxmischps", "znbyqclbgdlvameimahwcxuqnydnjosdntncylzukllgy");
         assertEquals(13, LCS.getLCS());
    }

    public void test32() {
         TestJenkinJava LCS = new TestJenkinJava("ocsuwjetvcgcjedvpzvmssaohnhrqdamrjudopcqxrbfgshkhrpxrpfmrjqruihhlnlfzkshpdvoccrsvciktrjzadhbb", "tzdmpkxfljbrkfhxkqviwbllkjgbxrdmopjndzwpgnbuwe");
         assertEquals(20, LCS.getLCS());
    }

    public void test33() {
         TestJenkinJava LCS = new TestJenkinJava("nskyrdmjqixszjronikcpporxxh", "ggdrelggbwjtznxmbgplthdwfabclmlhjevqaowhvtwdnakigqqgunhxameotorkbgtdgjlk");
         assertEquals(10, LCS.getLCS());
    }

    public void test34() {
         TestJenkinJava LCS = new TestJenkinJava("xlbabazunfqlnptcfvvuofofu", "hoejo");
         assertEquals(2, LCS.getLCS());
    }

    public void test35() {
         TestJenkinJava LCS = new TestJenkinJava("spbutebgpvdnoqxodyvqdjtxftkpfpsxolf", "uekhusmcvyegmplpeuukfiimmenie");
         assertEquals(7, LCS.getLCS());
    }

    public void test36() {
         TestJenkinJava LCS = new TestJenkinJava("zkxtpdslxykgfrqveupeifuimypgdnjcqfteshtkkghtgjtwabdfazkpaslssyo", "ieftastdcxvusivcvufodmsxwucoxvsopeeugzvxuvmahn");
         assertEquals(13, LCS.getLCS());
    }

    public void test37() {
         TestJenkinJava LCS = new TestJenkinJava("vpankmkoyqaxnstiqhxkgxdbokoy", "qtxqupxhaqlwofykktkeghkwsumidrtlyiwbxgmzpqqmofzhaunbnmhcjgshvnfoavmobriqhbxbahmvreqbapt");
         assertEquals(14, LCS.getLCS());
    }

    public void test38() {
         TestJenkinJava LCS = new TestJenkinJava("yvjdedqjcneudittug", "aomtzrgkiulpzcinfampfviuktmpncduvey");
         assertEquals(5, LCS.getLCS());
    }

    public void test39() {
         TestJenkinJava LCS = new TestJenkinJava("kkpzlupnxrxuirpyqsqmtxtybxjpmjpdxpjhrbbqnwydcdjosqmfemcvaog", "pqejspbzmnwfaspyqdbumdgjimjojuofamoqcdsnoazo");
         assertEquals(17, LCS.getLCS());
    }

    public void test40() {
         TestJenkinJava LCS = new TestJenkinJava("kjcvkhdpoiuuwxdtjapojgwhujovoywrpbrsiqmiiqap", "lpclrgslkuyduuytrzddixrnklamvsdiaohyfxaihqeuecvsuivwoapwsgdtidqdztbtpkbmwvlzbijooxrupwojcoksn");
         assertEquals(20, LCS.getLCS());
    }

    public void test41() {
         TestJenkinJava LCS = new TestJenkinJava("ffrfqmhsbbikensyirlsibzoagnaaxekjquglvmxlocterukvkcbjotrogbqoaqitbcujmafdhvukdpdjmmnsyvmpcvpik", "uvqdyqxbbrmopcahxoxhgjxlvvqnqyqviauwoppqd");
         assertEquals(18, LCS.getLCS());
    }

    public void test42() {
         TestJenkinJava LCS = new TestJenkinJava("oelfspucxwucvhpwrsuntykwesgqdflmdlkchraualooqyuwpbiygmwzrvmfplktdngnadmugtomofeemqtytqplnhrgtpc", "gixijkelpqsjljktiebbdebqkjqkhbidvmzhdxsozixqhmbrsnedhoejxftfpuqhqjaq");
         assertEquals(21, LCS.getLCS());
    }

    public void test43() {
         TestJenkinJava LCS = new TestJenkinJava("towpmkilznkrbumoyllhud", "tiylghyupmbg");
         assertEquals(6, LCS.getLCS());
    }

    public void test44() {
         TestJenkinJava LCS = new TestJenkinJava("fkeiimesjriazbtzkmapwwurfbckvcmhbtzrsgvtlbzojsqbzbrnafnsyobvah", "fzajvmdsmkdrvjpzudrfiidnxmdsltabyggbpwskqlpoowzddzjxppbyhcaukuzduignqajsru");
         assertEquals(19, LCS.getLCS());
    }

    public void test45() {
         TestJenkinJava LCS = new TestJenkinJava("ahvnuvdynszmmonhiyunbkzbfmievlqwyrywgrqkrobn", "cgjolmvyqsxkirzgpowbdcwiiswubgpczczgsoufururaryjmdhasyoqw");
         assertEquals(14, LCS.getLCS());
    }

    public void test46() {
         TestJenkinJava LCS = new TestJenkinJava("gkmwjomzvtkoottgkfwsbrocelnmkkxunrqeoyxzqwuldgshrayysbdgemvso", "wjbnwafffhlxkodrcohpkxdwkxvfsmxbiasauampoduozdbcrrosdjdwkqhsgabimqbqsfpakabmaw");
         assertEquals(20, LCS.getLCS());
    }

    public void test47() {
         TestJenkinJava LCS = new TestJenkinJava("grzlwzojwrvizkgtmffakmehqywscnsrwohurxdmtnvfjsjdgwpyhtaeqdbprbf", "dlhhbraaaxiruivcisvziknyuavmgs");
         assertEquals(10, LCS.getLCS());
    }

    public void test48() {
         TestJenkinJava LCS = new TestJenkinJava("scqpyxflfjgpakotpvuhvnyikfymvaysbkxuddwtvqkkklxvgehinsmmxehtmovrddecnmnsrsuhrji", "xysysjufyqapnpchdjxzxnbfdzvvycuvjcrf");
         assertEquals(14, LCS.getLCS());
    }

    public void test49() {
         TestJenkinJava LCS = new TestJenkinJava("efwqrmhhamidxagmqpsosfrewcpvdakrbfya", "avnlvgo");
         assertEquals(3, LCS.getLCS());
    }

    public void test50() {
         TestJenkinJava LCS = new TestJenkinJava("ldqsltbypsrhkvqrlrndlqgieeqgkxheecqkalvgnemyjht", "iyksiylvbthdrymlikpxeyipfzxcmnblayizurqspytarhqthfjogdk");
         assertEquals(15, LCS.getLCS());
    }

    public void test51() {
         TestJenkinJava LCS = new TestJenkinJava("lnoeczsodfhpcgmdaippwzmultslds", "yoghdqggpnnp");
         assertEquals(5, LCS.getLCS());
    }

    public void test52() {
         TestJenkinJava LCS = new TestJenkinJava("ftwaxstzgjlhcjryevmtik", "yelvor");
         assertEquals(3, LCS.getLCS());
    }

    public void test53() {
         TestJenkinJava LCS = new TestJenkinJava("rgcbpccjoisycoqbgisruriksfvnsrcwnkztuufurtgjgvrpfsfyemphaqueqivildxiy", "hrehcbslkxawslupvnaz");
         assertEquals(9, LCS.getLCS());
    }

    public void test54() {
         TestJenkinJava LCS = new TestJenkinJava("rggnlfghziriidgqlapzaientwfmfrfqedqjwukfoefoyekxvzdsbjtbcdymshcmrjdltsc", "atvydhxspvahmspykyfpvpymxdrphgygacsetrlkezfmaaejhdiltfzvwofsgbmmnteilmkla");
         assertEquals(18, LCS.getLCS());
    }

    public void test55() {
         TestJenkinJava LCS = new TestJenkinJava("iojdzwpvawnreoqmjfleltcubt", "fxinkwxehkbd");
         assertEquals(4, LCS.getLCS());
    }

    public void test56() {
         TestJenkinJava LCS = new TestJenkinJava("ljbtfup", "jxjbzarlkltebijscysbefpvkfczokmynpvryobqxverlsxdvevldcbxisfjs");
         assertEquals(5, LCS.getLCS());
    }

    public void test57() {
         TestJenkinJava LCS = new TestJenkinJava("upuvblicrhzceosrpiqhnwzlghwcewtxxrkjpoigmhioetyybucjfeoug", "ouxsljldmfimwwapzpvarbzqoymucdwbtjitgylewmgafrkmcoxkeaoehsctft");
         assertEquals(17, LCS.getLCS());
    }

    public void test58() {
         TestJenkinJava LCS = new TestJenkinJava("dkbccxejkqyhwammxapontpzdsowqbbncltugl", "qxsprimhogxjpiirutkebvlmeqlbadhqmtjgknuxqkdmsbvrr");
         assertEquals(10, LCS.getLCS());
    }

    public void test59() {
         TestJenkinJava LCS = new TestJenkinJava("wmglqlmillrokwmumqrfurkfcc", "mxvflagwqesazgdzxupjhlltjonfhwtexptmxwuv");
         assertEquals(9, LCS.getLCS());
    }

    public void test60() {
         TestJenkinJava LCS = new TestJenkinJava("pwwmusxlanbjvucahdfwovwyomuecioqvvqawqrgfvrudjcxirq", "lcq");
         assertEquals(3, LCS.getLCS());
    }

    public void test61() {
         TestJenkinJava LCS = new TestJenkinJava("xmfdmnmbtuovujdwsjorttjcrygkdklafuekaiwedvgzyvcccpoqlyvatkakyletvhzobndomkczfzlbyvxqhvoarv", "daqcuovydkyqnzvycjqzmqcfouepszfintvfoqhleibrqkqukijjxseijfnknqddupsuguij");
         assertEquals(21, LCS.getLCS());
    }

    public void test62() {
         TestJenkinJava LCS = new TestJenkinJava("mmdsbqevpxorveckuriia", "zcanzdhjuparzoihvuvtdykhyuhdgwopwoifazunveohrsfc");
         assertEquals(8, LCS.getLCS());
    }

    public void test63() {
         TestJenkinJava LCS = new TestJenkinJava("dkrfuuyltevbdajeyrrwhweukuabgqyycqrhmabeuxfnzwayzdcrug", "xdxgtnelihhblnlgbhwayfhgtraqrmwnozewttyazqomraunmsqzut");
         assertEquals(18, LCS.getLCS());
    }

    public void test64() {
         TestJenkinJava LCS = new TestJenkinJava("agwiegpbfwhzwplybymmyagbsojqpxfvrjhiyhgcsjlviutzspkfo", "vsggjufjkpcvktdhbkljamdqutdibzsimrmstqkpabtwwfnvjcrznmldvigavsspnvkdrdxfxgjvbpbwphpkvqgbefpuzqp");
         assertEquals(22, LCS.getLCS());
    }

    public void test65() {
         TestJenkinJava LCS = new TestJenkinJava("jaorzuoqqmczomyaetcqljjzrahnawgdukfppgyrylicnkpgesnz", "pqdinvoquoplthkuviirdtdxvqzjxibdyizeehlgvvebvkphcvwkqkldttzeegkbjop");
         assertEquals(14, LCS.getLCS());
    }

    public void test66() {
         TestJenkinJava LCS = new TestJenkinJava("iyswuyfllcibveqgrnusnpjspylmznhehowygb", "jyfilpwjgmmdktrzemthjorjvibdewzapgkcklbhsfomxcpddhpcfhaawsa");
         assertEquals(13, LCS.getLCS());
    }

    public void test67() {
         TestJenkinJava LCS = new TestJenkinJava("dnxekpw", "phppqdmkymslzwbxnvvgmrdbrqrwultrogonzd");
         assertEquals(3, LCS.getLCS());
    }

    public void test68() {
         TestJenkinJava LCS = new TestJenkinJava("rilvnuupvylodsthuyinnwkxznpaqrxygbozjxbtxcsdtynovuzr", "wmjwoxdutmcszoellowlryjpaylooemmuwlgnskvauoeqsrefzwfpbxuqaphrnrbjhkhsipjlsxuseqocjsummaghtakt");
         assertEquals(18, LCS.getLCS());
    }

    public void test69() {
         TestJenkinJava LCS = new TestJenkinJava("pbunpmrzagzpbspcolskvlpjdmwbbbuxibafbqxsbylrhrshxgqzmxfxgqtvpjesulnslkddgqn", "whbzibjntaglyhe");
         assertEquals(8, LCS.getLCS());
    }

    public void test70() {
         TestJenkinJava LCS = new TestJenkinJava("nltndxifiaobuaxxrkfcsyunl", "ioosuashoggvzkgdxeedkwwoqzjzqhwhsdsujebksbviogkgxuikiunsuecbnmqwewdzlqbjzzqabzwdo");
         assertEquals(11, LCS.getLCS());
    }

    public void test71() {
         TestJenkinJava LCS = new TestJenkinJava("hfajpjnsklleackevkeyn", "pediymolouvwellgpaffhhhxbnyqrluflyuelyldqakufuqjmkrcvepcakjxwjjngucqmlsfrjg");
         assertEquals(10, LCS.getLCS());
    }

    public void test72() {
         TestJenkinJava LCS = new TestJenkinJava("kzxuvnfsuaxlxzyfhnkxnowwwrqzjbcdvaoiemmqryvuxdvmyjmvtzgtcgggrljhuxptjzztot", "hrtydctmrdynotcuzyhnruxvwtrdogtjnkduekfznopksdfopqowwocpzuvqxvvozubgwiyswfqvn");
         assertEquals(19, LCS.getLCS());
    }

    public void test73() {
         TestJenkinJava LCS = new TestJenkinJava("fqzhyseatsuesnvwkvakhbklxgbgrlwkcetpcbtkepbfcgwvdlcqvhkktlemcnjuvhujjplasjyuzquphakip", "tzwdnazlyadcjseddwgiuscltafqsttmuxzhhkovornqlwrxozlvfxbbtyicatgoqycurky");
         assertEquals(20, LCS.getLCS());
    }

    public void test74() {
         TestJenkinJava LCS = new TestJenkinJava("etudcgpiqsnkplyinlmmswuozoflskpjraoloyeqznhynnqerzldb", "sxibvmvvefmthtxhffeajudhmiawoclkhfog");
         assertEquals(10, LCS.getLCS());
    }

    public void test75() {
         TestJenkinJava LCS = new TestJenkinJava("djvghlnslrziksexqvcxtnrtkhu", "ugudipzbduhtvffrwqaygfofntijgbdvzqw");
         assertEquals(6, LCS.getLCS());
    }

    public void test76() {
         TestJenkinJava LCS = new TestJenkinJava("lniabtaftfckokpdvieudnpyakjxaimhedzkixgzwhcqviqxgbxppawaozdofenkxmzchamnyidmjcbnjstxvwnciqmdbkhdmimg", "cubhtuicjidpeuuflmffmrp");
         assertEquals(11, LCS.getLCS());
    }

    public void test77() {
         TestJenkinJava LCS = new TestJenkinJava("xdnqkslthemhivzmfswu", "dowdwsofrznywqmtckciaqvgcvhcgtzytescgtvsgxvujxvvqyltqanymzyvvfqzapdomwjcbzvturdonrsbvpjz");
         assertEquals(13, LCS.getLCS());
    }

    public void test78() {
         TestJenkinJava LCS = new TestJenkinJava("kzovoubbaaxglciwxbtewxpdvklsnhrxscsictmgctyplmfynutdjcwgolhsdsqdqdmxqbhxxbfusxbsnvphas", "iwhrvdeddlunzjpqpegwgixtqikmbvyiupwojibavzcwvcjxo");
         assertEquals(15, LCS.getLCS());
    }

    public void test79() {
         TestJenkinJava LCS = new TestJenkinJava("kvfcycarwdwesfofyvqsunivnaftudmxfrqzuaqnrjtmsxsgqkwaqxkgiuwckuziembrvehcqhrrkqr", "iyntonpripplymfkqymnvpyhaximmoyuipqgwmrkhunjikbsvvmgyqpscovjb");
         assertEquals(19, LCS.getLCS());
    }

    public void test80() {
         TestJenkinJava LCS = new TestJenkinJava("b", "zzzwxfdenvwnknqkruqrictuzcuyfsbcdtezorwbhlxvjnrgfxxlnbvymjlzbbtehlqwdbwzqudlytclymjuzirnfof");
         assertEquals(1, LCS.getLCS());
    }

    public void test81() {
         TestJenkinJava LCS = new TestJenkinJava("vkcfbfzwbvfnnswsjtynxcdbxvkcoodlqyyetvcuuxdqvqstabqttrcheskdrcfsaunhuvseupszwwmrpeysyuglbkdm", "dmpjno");
         assertEquals(3, LCS.getLCS());
    }

    public void test82() {
         TestJenkinJava LCS = new TestJenkinJava("wacrnzlamihyxixgrcjjqltnmwmhps", "mwwyegutlhdmacjcicwpsok");
         assertEquals(8, LCS.getLCS());
    }

    public void test83() {
         TestJenkinJava LCS = new TestJenkinJava("wgrqrkjbbfxoppupsnbyjniidijeogwfdxjqjsypapybabzmeklsqccptvhmluveipmrzytbwshbymmtguwzm", "ctyfdrpndxtmtzuckqspyubspzufsfhmohtyimapluhwbiqx");
         assertEquals(19, LCS.getLCS());
    }

    public void test84() {
         TestJenkinJava LCS = new TestJenkinJava("qufngqgbqxsghemduwcieyuypxphaskadsldhflkctmiqwvxkcezjbgmufpnz", "uwnmpgzbcakrfmnlnonuxcokwftdhvivkskbdnpzjfwqkahdkdkwtnbapjdwztozeobnpaludvugdmnxmdkdyrcuximyxbqvtfut");
         assertEquals(22, LCS.getLCS());
    }

    public void test85() {
         TestJenkinJava LCS = new TestJenkinJava("pavhmwwu", "ziakshjnnpzlpcrnzabdlezuakntbnmzrjsturpltclwyjkkpqntdjffagrylajdmiww");
         assertEquals(5, LCS.getLCS());
    }

    public void test86() {
         TestJenkinJava LCS = new TestJenkinJava("nkfyixvyucalsxriqybecognwhryngfymaxhninyjcmxagbqabgnppnfsekhqgtliejcijyaedzpuenrsnqsr", "bdbvirhpnsdbelzmcuukpfdbaggtyfvleqaknercivjqvedozeftmoldacnwfdqtxkvawveobclkzzogtbjmnnrfdrht");
         assertEquals(25, LCS.getLCS());
    }

    public void test87() {
         TestJenkinJava LCS = new TestJenkinJava("etkfnvqbsjfdcpjudhjkkhwvuwpafmsjpaoohwrjivsttiwdjixgldwhbghrxxqtybodrywlauatpuleyb", "qettjfnurusytrokcywbpxthivmdvgjowtobqn");
         assertEquals(17, LCS.getLCS());
    }

    public void test88() {
         TestJenkinJava LCS = new TestJenkinJava("huanzioqaenbizpldzcystcoliwwtilpvbizzdbqibzb", "tcfjmbrrtnwchskvg");
         assertEquals(4, LCS.getLCS());
    }

    public void test89() {
         TestJenkinJava LCS = new TestJenkinJava("clcexnoqqkoreirudkpprulfzolgzvjc", "vmhbqvvmpwnafpklpzyzzfhoolffszvmgxoqsrozkckfqq");
         assertEquals(10, LCS.getLCS());
    }

    public void test90() {
         TestJenkinJava LCS = new TestJenkinJava("wnvrrcsghq", "svuqwiwccoxxwsrhwlqigmtrmuwbcvqylsyfprvidyenxvjbpbspqdcrdyhexrscruhyjipnreozpukgsriylkkvfvahqn");
         assertEquals(9, LCS.getLCS());
    }

    public void test91() {
         TestJenkinJava LCS = new TestJenkinJava("cbfoxcsnlbaxpsvafitiffwxmawcjnogeaxvvpjoqvrjcwfnidltpfqveay", "btuzelasdpiscftlgyogfexrdavzroxivkpkwmionbzazdnmelihmhfydykszdvpsenpndmmeepuyhcdiqtql");
         assertEquals(22, LCS.getLCS());
    }

    public void test92() {
         TestJenkinJava LCS = new TestJenkinJava("omrvtckbdsmxmhctboiizjehnrblailjzwmyrkxffbkcgkamrujfthloixyruwqygaxhihigwrfxcxoayocfstnjbirwqaca", "omkptjfpskvlxaewrgqdezobtfpbzivkgojml");
         assertEquals(16, LCS.getLCS());
    }

    public void test93() {
         TestJenkinJava LCS = new TestJenkinJava("zgcsioksetmjsrjeeokrdosnpvcjbsynpiyhjhedtryvonrbdwevnbbawjajtnxqy", "fygziyvfsexuapyhqrdghcpukcgmubxzcqnbqrqxambvkok");
         assertEquals(13, LCS.getLCS());
    }

    public void test94() {
         TestJenkinJava LCS = new TestJenkinJava("cborthkjohiooianyqmmrcffijobslkuleepjwlddhckxeslqixdxeeoqduyeltegekgsojvfnqtugwtykrvnrpqvoockothvdoi", "mjxzdu");
         assertEquals(5, LCS.getLCS());
    }

    public void test95() {
         TestJenkinJava LCS = new TestJenkinJava("rtxbgungldszrnlutrtnpoxcrybtapeaozaikkpkbuziqcocpwdxucgxhnjdsatcvauvjcafpknwaziipn", "yetdrjoimdrrshkzeexxajbsopxmxpjnbqbvyfcrlvqdhthdosxwpfhaxeqsugmehuyzcrtcsqyi");
         assertEquals(21, LCS.getLCS());
    }

    public void test96() {
         TestJenkinJava LCS = new TestJenkinJava("bfxrmzqcooxgagiawvhpybpyukshjoyyoejwkkijovvlvuapcsypx", "jwfpwz");
         assertEquals(3, LCS.getLCS());
    }

    public void test97() {
         TestJenkinJava LCS = new TestJenkinJava("yddijdmbzrkpgeweqjvgzr", "lxnebipcujjwwvztzwseyhffjrcacwjgicqsgbbbxudpnxtmhayzzeqhnaqecafsgwpxmgevelispgwhfjydzmtlv");
         assertEquals(11, LCS.getLCS());
    }

    public void test98() {
         TestJenkinJava LCS = new TestJenkinJava("zbevqmysqydxfgusinqeytawesbzlnkosazcxjqjufmcokbp", "ycbjmpzmnfbtkeprfwcbudqstgonviyoecffjnsvfopc");
         assertEquals(14, LCS.getLCS());
    }

    public void test99() {
         TestJenkinJava LCS = new TestJenkinJava("jwaaxnqwmychhnezjcwktveqvfbxbddokoqyrkwvwvzzpuojhtvlnhdhsuobeoldrp", "kfqzntwrmpptpfmlztnvfyflalzheknxyyacmhulmlycsuoffvxitjsoyfuubdktgzrnhdbiedzjboxpgffpecaklwprgmarf");
         assertEquals(21, LCS.getLCS());
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
    public static void main(String[] args) throws Exception{
        //junit.textui.TestRunner.run(new TestSuite(TestLCS.class));
        
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
