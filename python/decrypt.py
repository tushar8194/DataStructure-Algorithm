def decryptPassword(s):
    # Write your code here
    num = []
    ans = []
    i = -1
    for ch in s:
        i = i+1
        print('ch' + ch + 'and' + str(i))
        if ch == '0':
            print("is zero. deleting one num and adding to ans")
            ans.append(num[-1])
            del num[-1]
            print("Now Num")
            print(num)
            print("now ans")
            print(ans)
        elif ch == '*':
            print("is *. reversingly adding alst two to ans")
            mid= ans[-2]
            last = ans[-1]
            temp = ans[:-2]
            temp.append(last)
            temp.append(mid)

            ans = temp
            print("Now ans")
            print(ans)
        elif ch.isdigit():
            print("is number other than 0. just adding to num")
            num.append(ch)
            print("Now num")
            print(num)
        elif ch.islower():
            print("is lower. just adding to ans")
            ans.append(ch)
            print("ans now")
            print(ans)
        else:
            ans.append(ch)

    return "".join(ans) + "".join(num)



anss=decryptPassword("191189886144112342392772442742595986772543818242215873491722314479544961717184422552238382439937171592776989748833274377891114642154462711441646616516118515398672294228196954271918838625586762347284593872999114687514934272779225948927197638318234577541366617958267969694732685967286368197741958522656888358489391318595944999824842229924715656411563336532445178398611278395652672163583471213931158612523579853252475277778252539427148287627744639671874392414292751427389863999217634727932897176635291567958532579951873598834545577263562631373119553953945596995562557988683944918692817764789144965582336714952255936815383827366842794111384957225827755685312622344142975995215824634262729319236736395478247251329122366323789724573868773393498921424316684256223347844397455376274414397877759265877342321159212312495648354773353167424349467726821195439792818142859474972581864655849952568989667571792623668362524526546413292256896179426792586167114651312532155315917872879581152895352753926918348318489955966539411639216619744192936964331973262313448691213652132928687778961382568883432495792649225253221323318238395961449744646177872437512571951379771897899234577656952589673986588797661113861289383229855472746981947787135129756897137455258818556776269411692253164929366863719854365132489518369713411947242557617517171999985682891523823948543473275199455214252355252578514821352948127685114798975978581292576757619744666678137318875725512715255593958114114949811699477256696768755372441196846658547119993172946689791957176222481977739689618816134282177719182314893537373635568888768435967599677119121226478173189637852559745893157199317977883469711243511397597891618159316782955287765722327379784855565874848165766279592865499942761426663487422898652239337736619541631941373943918448988434912489546281371433439426766349162366451821438159872346928417638355723288427777786591991125125423478918961853842124869889445826834371436516657379396525127526398896175938841528949316334616826871433294575866625283147899429369347483129375522836822363268776514498348764218322459236488768845713573536212556148435581128638238148839655992813317299863972841894446488293679433156678626813319975787772867234884258311611979243862785987729194622597334144163822633737412567316897791962457231457722297399877386969112732381988821586795336212535229945746699664441391695364954946772251768463519469771886254899818216283225828376851149624651248992367454244715821937812874229627386643676715899923189361974913988376274586864856719849811266314258623589448532267976758559767436977552311763153734417278331523349923344114474814318755513276235812546324386831557832826317934814266959692295692947631756716476649928162561739185832381874964916743826312777853386676466967455425396799624434731423326426511255523768718514446442551334353975678792261632826823835415663378917951472248475494323529188715856795864548532954822455189961561861538355984563984375891375528977687376969985283312415579711228787362814438142491247539544435957331826176943896641792642891694941349151458366963326369631997687572999518493774432984287952239418491157933296429446485698571615578178363175537313715815539828217487551661146915532524212492619897248555575737783936566182934742131314582273576764152119673843795628642986883719735492289756214183181213181853138561137899551343715492572194843934131666651826566477726523127125417333528299757512394381164742596643998868964368579259213821453126715148774468863312765961345157694966312597175414946419333936749635347134564195353385826144497979823968933188814448351621214543878469435599183426449443977245722364796665812591344446636198226795729312437547739366336551983123877734731752816326291934147478361435376473446991596226656528939554147338186738649754258365189831625814466683141648635838519924554399424914336276949124982189844741567664869649551295862947454465912667536246766154241523127215334242177348763186193815147237525389142189475952763425545362167178529696274596751566621342333531482198283639918631861246188489235967364262132293799948291762589148641562756721713659656824736646937923827484515768696116264641278639924561197762627861278653834434885686833274427893623468327755388633381579714724858564843474535375352376376128732244414955338121533225588614329839873873677726887637354191675527373898961996188177964616141716494513362818179225736946589465782681114782746585888813469481742823562379943314996337319368496655644314186347487342184833113453218513159298229879631848872426464327615185353422832659279287278826996863975412445117421761325581524676494547463198843867863575593137761931179962732351264394722248739313193165389836718339759683936288632718732473599462264118899912365443197617929122243196663299664722726513213495275984441725465935243557586162292727856422986464751228854189661188786559856214524222935923129325796995588381585555531883726755477381738873893298424844813472441252436547983418282214298221397512361833194191334518742885151665479187269814599137139215816329215146672324873543187852983656359639553426464127474961835795388357197553186674695913113722385896232384897957871951922265127157464948122587534438888834139918318883912451614542618268252288543252149489452796997461644596422781472953648532971693768245682147589634836477924398495612985817117836574257987864238977518451388285391436263524732747941957353569679731511519583268427735245663731748513193769453374565256785658329724137228686572823682137265771958583226746931832843815557132549741582791892584222556949163141861635656527415211357385774561693214367121325548557311131949549873494535751565678286614398192621756277827431827338663875163944583633644549545577338231969312449475398472492785219971852392597199149525415636595495461945345964476245269499257147428588886922494448133988872433559348734295638441752295324981839645312848786888989331263632473743523777538128336326892851349367462448939399885295327278274893689639442989631445895833965826424798172141635623487339512544919912656587686691231186796664454555611472112114339681314213243837397585276755257617879577187858675487816419146991156488527624968187936898747797797539687762951332244826178592792313372749658599738461485221551343122352281727624595832632316732819523656355315567581654185766853671777729133499726297767114741552635237961832911958619333468713482885683358485699717181926774397723319425286263739237167743864121956586422921737434396392978224435453431114675742362129446323117846985643546461658185887588524732447484376999516858443367977728299451717475225628738558987914164919825364448877199437435832347818737231922846379877499484675875583235671746484246313676978731755417519494531893313993522618536599397268565891397322988576395259762434352371696276983737964163914271758174337737247548818541873734812966293815657764766714131117295184936291218919549348727272826463344236351326546755426857456582133352734623722397833342591131369918599941982886192422362925746333425615562942449667465948355613433153364511861689489136458948651439686453216678431875928399561678172272827494773937871776133265567712326764882356696442319619828931493171275111367686616592165545159751811865723237175266743561199998349811895334279552846124961223965523671145633518238711539142716679523565536195653263912287671583699439535797493774129996344393785233525363294647211433247157683342715862649611132323342999548545745621124336638751372621823122586254595193962682748496282122525696445385961239198391975913322823569259582854712425363784284455528393231321335145426296882613871177176391324426829417365493321555491355677375552464266916431549175449987733375175739489387898489563859151514116961673842463435546141343379243876615999155542834161254241189263398841234687396451754275328676318113165372352645564218987789836136347614379967126358728769847475363811174376996125962193229847431222949965713866867595768499463248648251234982416267197243518223193989438473713364799273778442531844633291881319383148769611684175862461554349489389475273146124349362623925826429686238487953687638674796677815788649454647923349119791681381896889576471837311928294787679967778253236825395411329444893923525562366393837384359277478972323294692248826984959151429141627864877389254839529391283817624853912123476167224629811796471448811549716952583396321644769287233645412166151637925118483834167157966758723298677724852549891887733427997919621426959442997943868185961943842666477336531992488797931699834638848524846956212277485198142677741921317533114373347637586976877716692774311843619955565738468952818567267242645616342517726445362837523234286847657651399786643563728842651128828586188123187854998962176853854478229546495386362141461128726981667761596591918649251424177628312451221617542646875388273882684892984873921366374313443532271298798895568354785852493737465982879157587694927843849362164481743652229618414878285274235642656516421854621247377971197226418973429819822642141812771299752923346934269732938418266995317473725125815798817789458737787722352111687515594746784571796674623426296314241331861322892656674185959832986182684196133919636345654625536874823531994383417634162921497483683963515749229482197225144154173272153153839689969581289295798985717614526988618128312942295263168444556367783989268221658768764926822823239839344344421627634573493251728378537182622752857749955665474567759789896155539756542824813862747191724312416934877355927193663893883955569358113453843564311152955373446384347848726127838652317136935429255668568277563333242957279481616338838871462218732161246257294635499551362177879595964937331833464697372833542697397576597459366316382849398967815257621375836878943811622311189341415994967857997642881459315334942951788472682893593875535236154679131164683898369786647783443685846791384716454472326258237165581793689823682547719381783794897348694393769443271752255363738421359269621612236711232313238616453161625425173724152697615544674892799374578575294827447499799548646879264878696849376365653679621424189992261923924317163977428984493158195273466455686422226465943383586239318585952725945168168722677513666631865552245443359835827788139364918992162283988513312425592886673426864923443664928853315891325567195827132711158786947713837271888324841839919624253938642587159757527645311199527947969251539918196285486713956664249846236Ue*WFp0w0Dm*LCc*ZP0WLf*00zltov0z0DXf*") # aP1pL5e

print("===>" + anss)

# aPapLp