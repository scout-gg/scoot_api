package org.gg.scoot.fixture;

import org.gg.scoot.entity.HelpTextEntity;

public class HelpTextFixture {
    public static HelpTextEntity archeryRangeName() {
        return new HelpTextEntity()
                .withContentEn("Archery Range")
                .withContentFr("Camp de tir à l'arc")
                .withContentBr("Schießanlage")
                .withContentDe("Schießanlage")
                .withContentEs("Galería tiro con arco")
                .withContentHi("तीरंदाजी की रेंज")
                .withContentIt("Area di tiro con l'arco")
                .withContentJp("射手育成所")
                .withContentKo("궁사 양성소")
                .withContentMs("Padang Memanah")
                .withContentMx("Galería tiro con arco")
                .withContentRu("Стрельбище")
                .withContentTr("Okçuluk Binası")
                .withContentTw("射箭場")
                .withContentVi("Trường bắn")
                .withContentZh("靶场");
    }

    public static HelpTextEntity archeryRangeHelpText() {
        return new HelpTextEntity()
                .withContentEn("Build <b>Archery Range<b> (<cost>) \\nUsed to train and upgrade archer units. <i> Upgrades: production speed (Castle); line of sight (Town Center); hit points, armor (University); more resistant to Monks (Monastery).<i>  \\n<hp> <attack> <armor> <piercearmor> <range> <garrison>")
                .withContentFr("Construire <b>Camp de tir à l'arc<b> (<cost>) \\nUtilisé pour former et améliorer les archers. <i> Améliorations : vitesse de production (Château) ; LDM (Forum) ; points de vie, armure (Université) ; résistance aux moines supérieure (Monastère).<i> \\n<hp> <attack> <armor> <piercearmor> <range> <garrison>")
                .withContentBr("Construir <b>Campo de Arqueiros<b> (<cost>) \\nUsada para treinar e aprimorar unidades de arqueiros. <i> Aprimoramentos: velocidade de produção (Castelo); linha de visão (Centro da Cidade); pontos de vida, armadura (Universidade); mais resistente a Monges (Mosteiro).<i>  \\n<hp> <attack> <armor> <piercearmor> <range> <garrison>")
                .withContentDe("<b>Schießanlage<b> bauen (<cost>) \\nHier können Sie Bogenschützen ausbilden und verbessern. <i>Weiterentwicklungen: schnelleres Erschaffen (Burg); Sichtweite (Dorfzentrum); Lebenspunkte, Rüstungsklasse (Universität); mehr Widerstand gegen Mönche (Kloster).<i>\\n<hp> <attack> <armor> <piercearmor> <range> <garrison>")
                .withContentEs("Construir <b>Galería de tiro con arco<b> (<cost>) \\nSe usa para entrenar y mejorar unidades de arqueros. <i> Mejoras: velocidad de producción (Castillo); línea de visión (Centro urbano); puntos de resistencia, armadura (Universidad); mayor resistencia a los monjes (Monasterio).<i>\\n<hp> <attack> <armor> <piercearmor> <range> <garrison>")
                .withContentHi("<b> तीरंदाजी की रेंज का<b> निर्माण करें (<cost>) \\nतीरंदाजों को प्रशिक्षित करने और अपग्रेड करने के लिए उपयोग किया जाता है। <i> अपग्रेड करता है: उत्पादन की गति (किला); दृष्टि की रेखा (नगर का केंद्र); हिट पॉइंट, कवच (विश्वविद्यालय); साधुओं (मठ) के लिए अधिक प्रतिरोधी।<i> \\n<hp> <attack> <armor> <piercearmor> <range> <garrison>")
                .withContentIt("Costruisci <b>Area di tiro con l'arco<b> (<cost>) \\nUtilizzata per creare e potenziare gli arcieri. <i> Potenziamenti: velocità di produzione (Castello); campo visivo (Centro città); resistenza ai colpi, corazza (Università); maggiore resistenza ai monaci (Monastero).<i> \\n<hp> <attack> <armor> <piercearmor> <range> <garrison>")
                .withContentJp("<b>射手育成所<b>の建造 (<cost>) \\n射手を育成、強化する。<i>強化: 作業速度 [城] ; 視界 [町の中心] ; ヒット ポイント、防御力 [学問所] ; 転向に対する抵抗力 [修道所]<i> \\n<hp> <attack> <armor> <piercearmor> <range> <garrison>")
                .withContentKo("<b>궁사 양성소<b> 건설(<cost>) \\n궁사 유닛의 양성 및 업그레이드에 사용됨. <i> 업그레이드: 생산 속도(성); 시야(마을 회관); 체력, 방어력(대학); 수도사에 대한 저항력(수도원).<i>  \\n<hp> <attack> <armor> <piercearmor> <range> <garrison>")
                .withContentMs("Bina <b>Padang Memanah<b> (<cost>) \\nDigunakan untuk melatih dan menaik taraf unit pemanah. <i> Naik taraf: kelajuan pengeluaran (Kastil); garis penglihatan (Pusat Bandar); mata pukulan, baju zirah (Universiti); lebih tahan kepada Rahib (Biara).<i>  \\n<hp> <attack> <armor> <piercearmor> <range> <garrison>")
                .withContentMx("Construir <b>Galería de tiro con arco<b> (<cost>) \\nSe usa para entrenar y mejorar unidades de arqueros. <i> Mejoras: velocidad de producción (castillo); línea de visión (centro urbano); puntos de resistencia, armadura (universidad); mayor resistencia a la conversión (monasterio).<i>\\n<hp> <attack> <armor> <piercearmor> <range> <garrison>")
                .withContentRu("Построить <b>стрельбище<b> (<cost>) \\nВ нем можно обучать и улучшать стрелковые юниты.<i> Улучшения: скорость производства (замок); радиус обзора (ратуша); прочность, защита (университет); больше устойчивости к обращению (монастырь).<i>\\n<hp> <attack> <armor> <piercearmor> <range> <garrison>")
                .withContentTr("<b>Okçuluk Binası<b> inşa et (<cost>) \\nOkçu birimler eğitip yükseltmek için kullanılır. <i> Yükseltmeler: oluşturma hızı (Kale); görüş hattı (Şehir Merkezi); darbe puanı, zırh (Üniversite); Keşişlere daha fazla direnç (Manastır).<i> \\n<hp> <attack> <armor> <piercearmor> <range> <garrison>")
                .withContentTw("建造<b>射箭場<b> (<cost>)\\n用於訓練和升級弓兵單位。<i>升級：生產速度 (城堡)；視野 (城鎮中心)；生命值、護甲 (大學)；提升抵抗僧侶的能力 (修道院)。<i> \\n<hp> <attack> <armor> <piercearmor> <range> <garrison>")
                .withContentVi("Xây dựng <b> Trường bắn<b> (<cost>) \\nDùng để tạo và nâng cấp các đơn vị cung thủ.<i> Nâng cấp: tốc độ sản xuất (Lâu đài); tầm nhìn (Nhà chính); máu, giáp (Đại học); kháng mạnh hơn với Thầy tu (Tu viện).<i>  \\n<hp> <attack> <armor> <piercearmor> <range> <garrison>")
                .withContentZh("建造<b>靶场<b> (<cost>) \\n用于训练和升级步弓手单位。 <i> 升级：生产速度 (城堡)；视野 (城镇中心)；生命值，护甲 (大学)；提升抵抗僧侣的能力 (修道院)。<i> \\n<hp> <attack> <armor> <piercearmor> <range> <garrison>");
    }

    public static HelpTextEntity archeryRangeHelpTextShort() {
        return new HelpTextEntity()
                .withContentEn("Build Archery Range")
                .withContentFr("Construire Camp de tir à l'arc")
                .withContentEs("Construir galería de tiro con arco")
                .withContentBr("Construir Campo de Arqueiros")
                .withContentDe("Schießanlage bauen")
                .withContentHi("तीरंदाजी की रेंज का निर्माण करें")
                .withContentIt("Costruisci area di tiro con l'arco")
                .withContentJp("射手育成所の建造")
                .withContentKo("궁사 양성소 건설")
                .withContentMs("Bina Padang Memanah")
                .withContentMx("Construir galería de tiro con arco")
                .withContentRu("Построить стрельбище")
                .withContentTr("Okçuluk Binası İnşa Et")
                .withContentTw("建造射箭場")
                .withContentVi("Xây trường bắn")
                .withContentZh("建造靶场");
    }

    public static HelpTextEntity archerName() {
        return new HelpTextEntity()
                .withContentEn("Archer")
                .withContentFr("Archer")
                .withContentBr("Arqueiro")
                .withContentDe("Bogenschütze")
                .withContentEs("Arquero")
                .withContentHi("तीरंदाज")
                .withContentIt("Arciere")
                .withContentJp("射手")
                .withContentKo("궁사")
                .withContentMs("Pemanah")
                .withContentMx("Arquero")
                .withContentRu("Лучник")
                .withContentTr("Okçu")
                .withContentTw("弓兵")
                .withContentVi("Cung thủ")
                .withContentZh("步弓手");
    }

    public static HelpTextEntity archerHelpText() {
        return new HelpTextEntity()
                .withContentEn("Create <b>Archer<b> (<cost>) \\nRanged unit. Strong vs. units at long range. Weak vs. Skirmishers and units at close range.<i> Upgrades: attack, range, armor (Blacksmith); attack, accuracy (University); accuracy, to Crossbowman 125F, 75G (Archery Range); creation speed (Castle); more resistant to Monks (Monastery).<i> \\n<hp> <attack> <armor> <piercearmor> <range>")
                .withContentFr("Créer <b>Archer<b> (<cost>) \\nUnité à distance. Puissant contre les unités à distance. Faible contre les tirailleurs et les unités à faible portée.<i> Améliorations : attaque, portée, armure (Forge) ; attaque, précision (Université) ; précision, en Arbalétrier 125 N, 75 O (Camp de tir à l'arc) ; vitesse de création (Château) ; résistance aux moines supérieure (Monastère).<i> \\n<hp> <attack> <armor> <piercearmor> <range>")
                .withContentBr("Criar <b>Arqueiro<b> (<cost>) \\nUnidade de longo alcance. Forte contra unidades a uma distância longa. Fraco contra Escaramuçadores e unidades a uma distância curta.<i> Aprimoramentos: ataque, alcance, armadura (Ferraria); ataque, precisão (Universidade); precisão, para Besteiro: 125 C, 75 O (Campo de Arqueiros); velocidade de criação (Castelo); mais resistente a Monges (Mosteiro).<i> \\n<hp> <attack> <armor> <piercearmor> <range>")
                .withContentDe("<b>Bogenschützen<b> erschaffen (<cost>) \\nEinheit mit Reichweite. Wirksam gegen entfernte Einheiten. Schwach gegen Plänkler und Einheiten im Nahkampf. <i>Weiterentwicklungen: Angriffsstärke, Reichweite, Rüstung (Schmiede); Angriffsstärke, Treffsicherheit (Universität); Treffsicherheit, zum Armbrustschützen 125 N, 75 G (Schießanlage); schnelleres Erschaffen (Burg); mehr Widerstand gegen Mönche (Kloster).<i> \\n<hp> <attack> <armor> <piercearmor> <range>")
                .withContentEs("Crear <b>Arquero<b> (<cost>) \\nUnidad a distancia. Fuerte contra unidades a largo alcance. Débil contra hostigadores y unidades a corto alcance. <i> Mejoras: ataque, alcance, armadura (Herrería); ataque, precisión (Universidad); precisión, mejorar a ballestero: 125 C, 75 O (Galería de tiro con arco); velocidad de creación (Castillo); mayor resistencia a los monjes (Monasterio).<i> \\n<hp> <attack> <armor> <piercearmor> <range>")
                .withContentHi("<b>तीरंदाज<b> बनाएँ (<cost>) \\nक्रमबद्ध इकाई। मज़बूत बनाम लंबी सीमा वाली इकाई। कमज़ोर बनाम लड़ाका और निकटतम सीमा वाली इकाई।<i> अपग्रेड करता है: आक्रमण, रेंज, कवच (लोहार); आक्रमण, सटीकता (विश्वविद्यालय); सटीकता, क्रॉसबोमैन 125F के लिए, 75G (तीरंदाजी की रेंज); निर्माण गति (किला); साधुओं (मठ) के लिए अधिक प्रतिरोधी।<i> \\n<hp> <attack> <armor> <piercearmor> <range>")
                .withContentIt("Crea <b>Arciere<b> (<cost>) \\nUnità a distanza. Forte contro unità a distanza. Debole contro fanteria leggera e unità a corto raggio.<i> Potenziamenti: attacco, gittata, corazza (Fabbro); attacco, precisione (Università); precisione, in balestriere 125 unità di cibo, 75 unità d'oro (Area di tiro con l'arco); velocità di creazione (Castello); maggiore resistenza ai monaci (Monastero).<i> \\n<hp> <attack> <armor> <piercearmor> <range>")
                .withContentJp("<b>射手<b>の作成 (<cost>) \\n射撃ユニット。長距離での戦闘に有効。散兵や近距離での戦闘を苦手とする。<i>強化: 攻撃力、射程、防御力 [鍛冶場] ; 攻撃力、命中率 [学問所] ; 命中率、石弓射手にアップグレード (125F、75G) [射手育成所] ; 作成速度 [城] ; 転向に対する抵抗力 [修道所]<i> \\n<hp> <attack> <armor> <piercearmor> <range>")
                .withContentKo("<b>궁사<b> 만들기(<cost>) \\n원거리 유닛. 멀리 있는 유닛에 강함. 척후병 및 가까이 있는 유닛에 약함.<i> 업그레이드: 공격력, 사정 거리, 방어력(대장간); 공격력, 정확도(대학); 정확도, 석궁병으로 업그레이드 시 식량 125, 금 75 소요(궁사 양성소); 생산 속도(성); 수도사에 대한 저항력(수도원).<i> \\n<hp> <attack> <armor> <piercearmor> <range>")
                .withContentMs("Cipta <b>Pemanah<b> (<cost>) \\nUnit jarak jauh. Kuat lwn unit dari jarak jauh. Lemah lwn Skirmisher dan unit dari jarak dekat.<i> Naik taraf: serangan, jarak, baju zirah (Bengkel Tukang Besi); serangan, ketepatan (Universiti); ketepatan, kepada Pemanah Busur Silang 125F, 75G (Padang Memanah); kelajuan penciptaan (Kastil); lebih tahan kepada Rahib (Biara).<i> \\n<hp> <attack> <armor> <piercearmor> <range>")
                .withContentMx("Crear <b>Arquero<b> (<cost>) \\nUnidad a distancia. Fuerte contra unidades a largo alcance. Débil contra hostigadores y unidades a corto alcance. <i> Mejoras: ataque, alcance, armadura (Herrero); ataque, precisión (Universidad); precisión, mejorar a ballestero: 125 C, 75 O (Galería de tiro con arco); velocidad de creación (Castillo); mayor resistencia a los monjes (Monasterio).<i> \\n<hp> <attack> <armor> <piercearmor> <range>")
                .withContentRu("Создать <b>лучника<b> (<cost>) \\nСтрелковый юнит. Эффективен в атаках на расстоянии. Не эффективен против застрельщиков и в ближнем бою.<i> Улучшения: атака, радиус атаки, защита (кузница); атака, точность (университет); точность, до воина с самострелом — 125 ед. пищи, 75 ед. золота (стрельбище); скорость производства (замок); больше устойчивости к обращению (монастырь).<i> \\n<hp> <attack> <armor> <piercearmor> <range>")
                .withContentTr("<b>Okçu<b> oluştur (<cost>) \\nMenzilli birim. Uzak mesafedeki birimlere karşı güçlü. Akıncı ve kısa mesafedeki birimlere karşı zayıf.<i> Yükseltmeler: saldırı, menzil, zırh (Demirci); saldırı, isabet (Üniversite); isabet, Kundaklı Yaycı için 125Y, 75A (Okçuluk Binası); oluşturma hızı (Kale); Keşişlere daha fazla direnç (Manastır).<i> \\n<hp> <attack> <armor> <piercearmor> <range>")
                .withContentTw("生產<b>弓兵<b> (<cost>)\\n遠程單位。適於遠程攻擊敵方單位。不適於近程攻擊矛兵等單位。<i>升級：攻擊力、射程、護甲 (兵工廠)；攻擊力、命中率 (大學)；命中率，升級到弩兵需 125 食物、75 黃金 (射箭場)；生產速度 (城堡)；提升抵抗僧侶的能力 (修道院)。<i> \\n<hp> <attack> <armor> <piercearmor> <range>")
                .withContentVi("Tạo <b> Cung thủ<b> (<cost>) \\nĐơn vị đánh xa. Mạnh trước các đơn vị ở xa. Yếu trước Lính giao tranh và các đơn vị ở gần.<i> Nâng cấp: tấn công, phạm vi, giáp (Lò rèn); tấn công, độ chính xác (Đại học); độ chính xác, lên Nỏ binh: 125F, 75G (Trường bắn); tốc độ tạo (Lâu đài); kháng mạnh hơn với Thầy tu (Tu viện).<i> \\n<hp> <attack> <armor> <piercearmor> <range>")
                .withContentZh("生产<b>步弓手<b> (<cost>) \\n远程单位。适于远程攻击敌方单位。不适于近程攻击掷矛手等单位。<i> 升级：攻击力，射程，护甲 (铁匠铺)；攻击力，准确度 (大学)；准确度，升级到弩手需 125 食物，75 黄金 (靶场)；生产速度 (城堡)；提升抵抗僧侣的能力 (修道院)。<i> \\n<hp> <attack> <armor> <piercearmor> <range>");
    }

    public static HelpTextEntity archerHelpTextShort() {
        return new HelpTextEntity()
                .withContentEn("Create Archer")
                .withContentFr("Créer Archer")
                .withContentBr("Criar Arqueiro")
                .withContentDe("Bogenschützen erschaffen")
                .withContentEs("Crear arquero")
                .withContentHi("तीरंदाज बनाएँ")
                .withContentIt("Crea arciere")
                .withContentJp("射手の作成")
                .withContentKo("궁사 만들기")
                .withContentMs("Cipta Pemanah")
                .withContentMx("Crear arquero")
                .withContentRu("Создать лучника")
                .withContentTr("Okçu Oluştur")
                .withContentTw("生產弓兵")
                .withContentVi("Tạo cung thủ")
                .withContentZh("生产步弓手");
    }

    public static HelpTextEntity thumbRing() {
        return new HelpTextEntity()
                .withContentEn("Thumb Ring")
                .withContentFr("Bague de pouce")
                .withContentBr("Anel de Arqueria")
                .withContentDe("Daumenring")
                .withContentEs("Dactilera")
                .withContentHi("अंगूठे में पहना जाने वाला छल्ला")
                .withContentIt("Anello")
                .withContentJp("弓懸")
                .withContentKo("손가락 보호대")
                .withContentMs("Cincin Ibu Jari")
                .withContentMx("Dactilera")
                .withContentRu("Кольцо лучника")
                .withContentTr("Zihgir")
                .withContentTw("拇指環")
                .withContentVi("Ban chỉ")
                .withContentZh("扳指");
    }

    public static HelpTextEntity britons() {
        return new HelpTextEntity()
                .withContentEn("Britons")
                .withContentFr("Britanniques")
                .withContentBr("Bretões")
                .withContentDe("Briten")
                .withContentEs("Britanos")
                .withContentHi("टन")
                .withContentIt("Britanni")
                .withContentJp("ブリトン")
                .withContentKo("브리튼인")
                .withContentMs("Orang British")
                .withContentMx("Ingleses")
                .withContentRu("Британцы")
                .withContentTr("Britonlar")
                .withContentTw("不列顛人")
                .withContentVi("Briton")
                .withContentZh("不列颠");
    }
}
