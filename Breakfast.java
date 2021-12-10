package appinventor.ai_anon2042442813087.Food_recipe_checkpoint_final;

import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.AppInventorCompatActivity;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.VerticalScrollArrangement;
import com.google.appinventor.components.runtime.errors.PermissionException;
import com.google.appinventor.components.runtime.errors.StopBlocksExecution;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.C0643runtime;
import gnu.expr.Language;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.kawa.functions.Apply;
import gnu.kawa.functions.Format;
import gnu.kawa.functions.GetNamedPart;
import gnu.kawa.functions.IsEqual;
import gnu.kawa.reflect.Invoke;
import gnu.kawa.reflect.SlotGet;
import gnu.kawa.reflect.SlotSet;
import gnu.lists.Consumer;
import gnu.lists.FString;
import gnu.lists.LList;
import gnu.lists.Pair;
import gnu.lists.PairWithPosition;
import gnu.lists.VoidConsumer;
import gnu.mapping.CallContext;
import gnu.mapping.Environment;
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.mapping.WrongType;
import gnu.math.DFloNum;
import gnu.math.IntNum;
import kawa.lang.Promise;
import kawa.lib.C0655lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;

/* compiled from: Breakfast.yail */
public class Breakfast extends Form implements Runnable {
    public static Breakfast Breakfast;
    static final SimpleSymbol Lit0 = ((SimpleSymbol) new SimpleSymbol("Breakfast").readResolve());
    static final SimpleSymbol Lit1 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final SimpleSymbol Lit10 = ((SimpleSymbol) new SimpleSymbol("VerticalScrollArrangement1").readResolve());
    static final SimpleSymbol Lit100 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement13").readResolve());
    static final IntNum Lit101;
    static final FString Lit102 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit103 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit104 = ((SimpleSymbol) new SimpleSymbol("Label7").readResolve());
    static final IntNum Lit105;
    static final FString Lit106 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit107 = new FString("com.google.appinventor.components.runtime.Image");
    static final SimpleSymbol Lit108 = ((SimpleSymbol) new SimpleSymbol("Image1").readResolve());
    static final FString Lit109 = new FString("com.google.appinventor.components.runtime.Image");
    static final SimpleSymbol Lit11 = ((SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve());
    static final PairWithPosition Lit110 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/Breakfast.yail", 893005);
    static final SimpleSymbol Lit111 = ((SimpleSymbol) new SimpleSymbol("Image1$Click").readResolve());
    static final FString Lit112 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit113 = ((SimpleSymbol) new SimpleSymbol("Label1").readResolve());
    static final IntNum Lit114;
    static final FString Lit115 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit116 = new FString("com.google.appinventor.components.runtime.Image");
    static final SimpleSymbol Lit117 = ((SimpleSymbol) new SimpleSymbol("Image2").readResolve());
    static final FString Lit118 = new FString("com.google.appinventor.components.runtime.Image");
    static final PairWithPosition Lit119 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/Breakfast.yail", 991309);
    static final IntNum Lit12 = IntNum.make(3);
    static final SimpleSymbol Lit120 = ((SimpleSymbol) new SimpleSymbol("Image2$Click").readResolve());
    static final FString Lit121 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit122 = ((SimpleSymbol) new SimpleSymbol("Label2").readResolve());
    static final IntNum Lit123;
    static final FString Lit124 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit125 = new FString("com.google.appinventor.components.runtime.Image");
    static final SimpleSymbol Lit126 = ((SimpleSymbol) new SimpleSymbol("Image3").readResolve());
    static final FString Lit127 = new FString("com.google.appinventor.components.runtime.Image");
    static final PairWithPosition Lit128 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/Breakfast.yail", 1089613);
    static final SimpleSymbol Lit129 = ((SimpleSymbol) new SimpleSymbol("Image3$Click").readResolve());
    static final SimpleSymbol Lit13 = ((SimpleSymbol) new SimpleSymbol("number").readResolve());
    static final FString Lit130 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit131 = ((SimpleSymbol) new SimpleSymbol("Label3").readResolve());
    static final IntNum Lit132;
    static final FString Lit133 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit134 = new FString("com.google.appinventor.components.runtime.Image");
    static final SimpleSymbol Lit135 = ((SimpleSymbol) new SimpleSymbol("Image4").readResolve());
    static final FString Lit136 = new FString("com.google.appinventor.components.runtime.Image");
    static final PairWithPosition Lit137 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/Breakfast.yail", 1187917);
    static final SimpleSymbol Lit138 = ((SimpleSymbol) new SimpleSymbol("Image4$Click").readResolve());
    static final FString Lit139 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit14 = ((SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve());
    static final SimpleSymbol Lit140 = ((SimpleSymbol) new SimpleSymbol("Label4").readResolve());
    static final IntNum Lit141;
    static final FString Lit142 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit143 = new FString("com.google.appinventor.components.runtime.Image");
    static final SimpleSymbol Lit144 = ((SimpleSymbol) new SimpleSymbol("Image5").readResolve());
    static final FString Lit145 = new FString("com.google.appinventor.components.runtime.Image");
    static final PairWithPosition Lit146;
    static final SimpleSymbol Lit147 = ((SimpleSymbol) new SimpleSymbol("Image5$Click").readResolve());
    static final FString Lit148 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit149 = ((SimpleSymbol) new SimpleSymbol("Label5").readResolve());
    static final IntNum Lit15;
    static final IntNum Lit150;
    static final FString Lit151 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit152 = ((SimpleSymbol) new SimpleSymbol("get-simple-name").readResolve());
    static final SimpleSymbol Lit153 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final SimpleSymbol Lit154 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final SimpleSymbol Lit155 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final SimpleSymbol Lit156 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit157 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit158 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final SimpleSymbol Lit159 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final SimpleSymbol Lit16 = ((SimpleSymbol) new SimpleSymbol("Width").readResolve());
    static final SimpleSymbol Lit160 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit161 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit162 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final SimpleSymbol Lit163 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final SimpleSymbol Lit164 = ((SimpleSymbol) new SimpleSymbol("dispatchGenericEvent").readResolve());
    static final SimpleSymbol Lit165 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final IntNum Lit17 = IntNum.make(-2);
    static final FString Lit18 = new FString("com.google.appinventor.components.runtime.VerticalScrollArrangement");
    static final FString Lit19 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit2 = ((SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve());
    static final SimpleSymbol Lit20 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement8").readResolve());
    static final SimpleSymbol Lit21 = ((SimpleSymbol) new SimpleSymbol("AlignVertical").readResolve());
    static final IntNum Lit22 = IntNum.make(2);
    static final IntNum Lit23;
    static final SimpleSymbol Lit24 = ((SimpleSymbol) new SimpleSymbol("Height").readResolve());
    static final IntNum Lit25 = IntNum.make(-1010);
    static final FString Lit26 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit27 = new FString("com.google.appinventor.components.runtime.Image");
    static final SimpleSymbol Lit28 = ((SimpleSymbol) new SimpleSymbol("Image7").readResolve());
    static final SimpleSymbol Lit29 = ((SimpleSymbol) new SimpleSymbol("Clickable").readResolve());
    static final SimpleSymbol Lit3 = ((SimpleSymbol) new SimpleSymbol("AppName").readResolve());
    static final IntNum Lit30 = IntNum.make(-1007);
    static final SimpleSymbol Lit31 = ((SimpleSymbol) new SimpleSymbol("Picture").readResolve());
    static final IntNum Lit32 = IntNum.make(-1012);
    static final FString Lit33 = new FString("com.google.appinventor.components.runtime.Image");
    static final PairWithPosition Lit34 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/Breakfast.yail", 229451);
    static final SimpleSymbol Lit35 = ((SimpleSymbol) new SimpleSymbol("Image7$Click").readResolve());
    static final SimpleSymbol Lit36 = ((SimpleSymbol) new SimpleSymbol("Click").readResolve());
    static final FString Lit37 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit38 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement9").readResolve());
    static final FString Lit39 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit4;
    static final FString Lit40 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit41 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement10").readResolve());
    static final FString Lit42 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit43 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit44 = ((SimpleSymbol) new SimpleSymbol("Label6").readResolve());
    static final SimpleSymbol Lit45 = ((SimpleSymbol) new SimpleSymbol("FontBold").readResolve());
    static final SimpleSymbol Lit46 = ((SimpleSymbol) new SimpleSymbol("FontSize").readResolve());
    static final DFloNum Lit47 = DFloNum.make((double) 24);
    static final SimpleSymbol Lit48 = ((SimpleSymbol) new SimpleSymbol("Text").readResolve());
    static final SimpleSymbol Lit49 = ((SimpleSymbol) new SimpleSymbol("TextColor").readResolve());
    static final SimpleSymbol Lit5 = ((SimpleSymbol) new SimpleSymbol("ShowListsAsJson").readResolve());
    static final IntNum Lit50;
    static final FString Lit51 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit52 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit53 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement11").readResolve());
    static final FString Lit54 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit55 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit56 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement12").readResolve());
    static final FString Lit57 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit58 = new FString("com.google.appinventor.components.runtime.Image");
    static final SimpleSymbol Lit59 = ((SimpleSymbol) new SimpleSymbol("Image6").readResolve());
    static final SimpleSymbol Lit6 = ((SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve());
    static final IntNum Lit60 = IntNum.make(-1007);
    static final IntNum Lit61 = IntNum.make(-1012);
    static final FString Lit62 = new FString("com.google.appinventor.components.runtime.Image");
    static final PairWithPosition Lit63 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/Breakfast.yail", 426062);
    static final SimpleSymbol Lit64 = ((SimpleSymbol) new SimpleSymbol("Image6$Click").readResolve());
    static final FString Lit65 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit66 = ((SimpleSymbol) new SimpleSymbol("Button1").readResolve());
    static final IntNum Lit67;
    static final FString Lit68 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit69 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/Breakfast.yail", 471127);
    static final SimpleSymbol Lit7 = ((SimpleSymbol) new SimpleSymbol("Sizing").readResolve());
    static final SimpleSymbol Lit70 = ((SimpleSymbol) new SimpleSymbol("Button1$Click").readResolve());
    static final FString Lit71 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit72 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement14").readResolve());
    static final IntNum Lit73;
    static final FString Lit74 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit75 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit76 = ((SimpleSymbol) new SimpleSymbol("Label8").readResolve());
    static final IntNum Lit77;
    static final FString Lit78 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit79 = new FString("com.google.appinventor.components.runtime.Image");
    static final SimpleSymbol Lit8 = ((SimpleSymbol) new SimpleSymbol("Title").readResolve());
    static final SimpleSymbol Lit80 = ((SimpleSymbol) new SimpleSymbol("Image8").readResolve());
    static final IntNum Lit81 = IntNum.make(150);
    static final IntNum Lit82 = IntNum.make(300);
    static final FString Lit83 = new FString("com.google.appinventor.components.runtime.Image");
    static final PairWithPosition Lit84 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/Breakfast.yail", 614477);
    static final SimpleSymbol Lit85 = ((SimpleSymbol) new SimpleSymbol("Image8$Click").readResolve());
    static final FString Lit86 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit87 = ((SimpleSymbol) new SimpleSymbol("Label9").readResolve());
    static final IntNum Lit88;
    static final FString Lit89 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit9 = new FString("com.google.appinventor.components.runtime.VerticalScrollArrangement");
    static final FString Lit90 = new FString("com.google.appinventor.components.runtime.Image");
    static final SimpleSymbol Lit91 = ((SimpleSymbol) new SimpleSymbol("Image9").readResolve());
    static final FString Lit92 = new FString("com.google.appinventor.components.runtime.Image");
    static final PairWithPosition Lit93 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/Breakfast.yail", 712781);
    static final SimpleSymbol Lit94 = ((SimpleSymbol) new SimpleSymbol("Image9$Click").readResolve());
    static final FString Lit95 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit96 = ((SimpleSymbol) new SimpleSymbol("Label10").readResolve());
    static final IntNum Lit97;
    static final FString Lit98 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit99 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final ModuleMethod lambda$Fn1 = null;
    static final ModuleMethod lambda$Fn10 = null;
    static final ModuleMethod lambda$Fn11 = null;
    static final ModuleMethod lambda$Fn12 = null;
    static final ModuleMethod lambda$Fn13 = null;
    static final ModuleMethod lambda$Fn14 = null;
    static final ModuleMethod lambda$Fn15 = null;
    static final ModuleMethod lambda$Fn16 = null;
    static final ModuleMethod lambda$Fn17 = null;
    static final ModuleMethod lambda$Fn18 = null;
    static final ModuleMethod lambda$Fn19 = null;
    static final ModuleMethod lambda$Fn2 = null;
    static final ModuleMethod lambda$Fn20 = null;
    static final ModuleMethod lambda$Fn21 = null;
    static final ModuleMethod lambda$Fn22 = null;
    static final ModuleMethod lambda$Fn23 = null;
    static final ModuleMethod lambda$Fn24 = null;
    static final ModuleMethod lambda$Fn25 = null;
    static final ModuleMethod lambda$Fn26 = null;
    static final ModuleMethod lambda$Fn27 = null;
    static final ModuleMethod lambda$Fn28 = null;
    static final ModuleMethod lambda$Fn29 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn30 = null;
    static final ModuleMethod lambda$Fn31 = null;
    static final ModuleMethod lambda$Fn32 = null;
    static final ModuleMethod lambda$Fn33 = null;
    static final ModuleMethod lambda$Fn34 = null;
    static final ModuleMethod lambda$Fn35 = null;
    static final ModuleMethod lambda$Fn36 = null;
    static final ModuleMethod lambda$Fn37 = null;
    static final ModuleMethod lambda$Fn38 = null;
    static final ModuleMethod lambda$Fn39 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn40 = null;
    static final ModuleMethod lambda$Fn41 = null;
    static final ModuleMethod lambda$Fn42 = null;
    static final ModuleMethod lambda$Fn43 = null;
    static final ModuleMethod lambda$Fn44 = null;
    static final ModuleMethod lambda$Fn45 = null;
    static final ModuleMethod lambda$Fn46 = null;
    static final ModuleMethod lambda$Fn47 = null;
    static final ModuleMethod lambda$Fn48 = null;
    static final ModuleMethod lambda$Fn49 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn50 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public Button Button1;
    public final ModuleMethod Button1$Click;
    public HorizontalArrangement HorizontalArrangement10;
    public HorizontalArrangement HorizontalArrangement11;
    public HorizontalArrangement HorizontalArrangement12;
    public HorizontalArrangement HorizontalArrangement13;
    public HorizontalArrangement HorizontalArrangement14;
    public HorizontalArrangement HorizontalArrangement8;
    public HorizontalArrangement HorizontalArrangement9;
    public Image Image1;
    public final ModuleMethod Image1$Click;
    public Image Image2;
    public final ModuleMethod Image2$Click;
    public Image Image3;
    public final ModuleMethod Image3$Click;
    public Image Image4;
    public final ModuleMethod Image4$Click;
    public Image Image5;
    public final ModuleMethod Image5$Click;
    public Image Image6;
    public final ModuleMethod Image6$Click;
    public Image Image7;
    public final ModuleMethod Image7$Click;
    public Image Image8;
    public final ModuleMethod Image8$Click;
    public Image Image9;
    public final ModuleMethod Image9$Click;
    public Label Label1;
    public Label Label10;
    public Label Label2;
    public Label Label3;
    public Label Label4;
    public Label Label5;
    public Label Label6;
    public Label Label7;
    public Label Label8;
    public Label Label9;
    public VerticalScrollArrangement VerticalScrollArrangement1;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public LList components$Mnto$Mncreate;
    public final ModuleMethod dispatchEvent;
    public final ModuleMethod dispatchGenericEvent;
    public LList events$Mnto$Mnregister;
    public LList form$Mndo$Mnafter$Mncreation;
    public Environment form$Mnenvironment;
    public Symbol form$Mnname$Mnsymbol;
    public final ModuleMethod get$Mnsimple$Mnname;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod onCreate;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;

    static {
        int[] iArr = new int[2];
        iArr[0] = -1;
        Lit150 = IntNum.make(iArr);
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit4 = simpleSymbol;
        Lit146 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/Breakfast.yail", 1286221);
        int[] iArr2 = new int[2];
        iArr2[0] = -1;
        Lit141 = IntNum.make(iArr2);
        int[] iArr3 = new int[2];
        iArr3[0] = -1;
        Lit132 = IntNum.make(iArr3);
        int[] iArr4 = new int[2];
        iArr4[0] = -1;
        Lit123 = IntNum.make(iArr4);
        int[] iArr5 = new int[2];
        iArr5[0] = -1;
        Lit114 = IntNum.make(iArr5);
        int[] iArr6 = new int[2];
        iArr6[0] = -16711681;
        Lit105 = IntNum.make(iArr6);
        int[] iArr7 = new int[2];
        iArr7[0] = -16777216;
        Lit101 = IntNum.make(iArr7);
        int[] iArr8 = new int[2];
        iArr8[0] = -1;
        Lit97 = IntNum.make(iArr8);
        int[] iArr9 = new int[2];
        iArr9[0] = -1;
        Lit88 = IntNum.make(iArr9);
        int[] iArr10 = new int[2];
        iArr10[0] = -16711681;
        Lit77 = IntNum.make(iArr10);
        int[] iArr11 = new int[2];
        iArr11[0] = -16777216;
        Lit73 = IntNum.make(iArr11);
        int[] iArr12 = new int[2];
        iArr12[0] = -1;
        Lit67 = IntNum.make(iArr12);
        int[] iArr13 = new int[2];
        iArr13[0] = -65536;
        Lit50 = IntNum.make(iArr13);
        int[] iArr14 = new int[2];
        iArr14[0] = -16777216;
        Lit23 = IntNum.make(iArr14);
        int[] iArr15 = new int[2];
        iArr15[0] = -16777216;
        Lit15 = IntNum.make(iArr15);
    }

    public Breakfast() {
        ModuleInfo.register(this);
        frame frame2 = new frame();
        frame2.$main = this;
        this.get$Mnsimple$Mnname = new ModuleMethod(frame2, 1, Lit152, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.onCreate = new ModuleMethod(frame2, 2, "onCreate", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frame2, 3, Lit153, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frame2, 4, Lit154, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 5, Lit155, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 7, Lit156, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frame2, 8, Lit157, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frame2, 9, Lit158, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frame2, 10, Lit159, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frame2, 11, Lit160, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frame2, 12, Lit161, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frame2, 13, Lit162, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frame2, 14, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frame2, 15, Lit163, 16388);
        this.dispatchGenericEvent = new ModuleMethod(frame2, 16, Lit164, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frame2, 17, Lit165, 8194);
        ModuleMethod moduleMethod = new ModuleMethod(frame2, 18, (Object) null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime2817826888930461115.scm:627");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(frame2, 19, "$define", 0);
        lambda$Fn2 = new ModuleMethod(frame2, 20, (Object) null, 0);
        lambda$Fn3 = new ModuleMethod(frame2, 21, (Object) null, 0);
        lambda$Fn4 = new ModuleMethod(frame2, 22, (Object) null, 0);
        lambda$Fn5 = new ModuleMethod(frame2, 23, (Object) null, 0);
        lambda$Fn6 = new ModuleMethod(frame2, 24, (Object) null, 0);
        lambda$Fn7 = new ModuleMethod(frame2, 25, (Object) null, 0);
        lambda$Fn8 = new ModuleMethod(frame2, 26, (Object) null, 0);
        this.Image7$Click = new ModuleMethod(frame2, 27, Lit35, 0);
        lambda$Fn9 = new ModuleMethod(frame2, 28, (Object) null, 0);
        lambda$Fn10 = new ModuleMethod(frame2, 29, (Object) null, 0);
        lambda$Fn11 = new ModuleMethod(frame2, 30, (Object) null, 0);
        lambda$Fn12 = new ModuleMethod(frame2, 31, (Object) null, 0);
        this.Image6$Click = new ModuleMethod(frame2, 32, Lit64, 0);
        lambda$Fn13 = new ModuleMethod(frame2, 33, (Object) null, 0);
        lambda$Fn14 = new ModuleMethod(frame2, 34, (Object) null, 0);
        this.Button1$Click = new ModuleMethod(frame2, 35, Lit70, 0);
        lambda$Fn15 = new ModuleMethod(frame2, 36, (Object) null, 0);
        lambda$Fn16 = new ModuleMethod(frame2, 37, (Object) null, 0);
        lambda$Fn17 = new ModuleMethod(frame2, 38, (Object) null, 0);
        lambda$Fn18 = new ModuleMethod(frame2, 39, (Object) null, 0);
        lambda$Fn19 = new ModuleMethod(frame2, 40, (Object) null, 0);
        lambda$Fn20 = new ModuleMethod(frame2, 41, (Object) null, 0);
        this.Image8$Click = new ModuleMethod(frame2, 42, Lit85, 0);
        lambda$Fn21 = new ModuleMethod(frame2, 43, (Object) null, 0);
        lambda$Fn22 = new ModuleMethod(frame2, 44, (Object) null, 0);
        lambda$Fn23 = new ModuleMethod(frame2, 45, (Object) null, 0);
        lambda$Fn24 = new ModuleMethod(frame2, 46, (Object) null, 0);
        this.Image9$Click = new ModuleMethod(frame2, 47, Lit94, 0);
        lambda$Fn25 = new ModuleMethod(frame2, 48, (Object) null, 0);
        lambda$Fn26 = new ModuleMethod(frame2, 49, (Object) null, 0);
        lambda$Fn27 = new ModuleMethod(frame2, 50, (Object) null, 0);
        lambda$Fn28 = new ModuleMethod(frame2, 51, (Object) null, 0);
        lambda$Fn29 = new ModuleMethod(frame2, 52, (Object) null, 0);
        lambda$Fn30 = new ModuleMethod(frame2, 53, (Object) null, 0);
        lambda$Fn31 = new ModuleMethod(frame2, 54, (Object) null, 0);
        lambda$Fn32 = new ModuleMethod(frame2, 55, (Object) null, 0);
        this.Image1$Click = new ModuleMethod(frame2, 56, Lit111, 0);
        lambda$Fn33 = new ModuleMethod(frame2, 57, (Object) null, 0);
        lambda$Fn34 = new ModuleMethod(frame2, 58, (Object) null, 0);
        lambda$Fn35 = new ModuleMethod(frame2, 59, (Object) null, 0);
        lambda$Fn36 = new ModuleMethod(frame2, 60, (Object) null, 0);
        this.Image2$Click = new ModuleMethod(frame2, 61, Lit120, 0);
        lambda$Fn37 = new ModuleMethod(frame2, 62, (Object) null, 0);
        lambda$Fn38 = new ModuleMethod(frame2, 63, (Object) null, 0);
        lambda$Fn39 = new ModuleMethod(frame2, 64, (Object) null, 0);
        lambda$Fn40 = new ModuleMethod(frame2, 65, (Object) null, 0);
        this.Image3$Click = new ModuleMethod(frame2, 66, Lit129, 0);
        lambda$Fn41 = new ModuleMethod(frame2, 67, (Object) null, 0);
        lambda$Fn42 = new ModuleMethod(frame2, 68, (Object) null, 0);
        lambda$Fn43 = new ModuleMethod(frame2, 69, (Object) null, 0);
        lambda$Fn44 = new ModuleMethod(frame2, 70, (Object) null, 0);
        this.Image4$Click = new ModuleMethod(frame2, 71, Lit138, 0);
        lambda$Fn45 = new ModuleMethod(frame2, 72, (Object) null, 0);
        lambda$Fn46 = new ModuleMethod(frame2, 73, (Object) null, 0);
        lambda$Fn47 = new ModuleMethod(frame2, 74, (Object) null, 0);
        lambda$Fn48 = new ModuleMethod(frame2, 75, (Object) null, 0);
        this.Image5$Click = new ModuleMethod(frame2, 76, Lit147, 0);
        lambda$Fn49 = new ModuleMethod(frame2, 77, (Object) null, 0);
        lambda$Fn50 = new ModuleMethod(frame2, 78, (Object) null, 0);
    }

    public Object lookupInFormEnvironment(Symbol symbol) {
        return lookupInFormEnvironment(symbol, Boolean.FALSE);
    }

    public void run() {
        CallContext instance = CallContext.getInstance();
        Consumer consumer = instance.consumer;
        instance.consumer = VoidConsumer.instance;
        try {
            run(instance);
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        ModuleBody.runCleanup(instance, th, consumer);
    }

    public final void run(CallContext $ctx) {
        String obj;
        Consumer $result = $ctx.consumer;
        C0643runtime.$instance.run();
        this.$Stdebug$Mnform$St = Boolean.FALSE;
        this.form$Mnenvironment = Environment.make(misc.symbol$To$String(Lit0));
        FString stringAppend = strings.stringAppend(misc.symbol$To$String(Lit0), "-global-vars");
        if (stringAppend == null) {
            obj = null;
        } else {
            obj = stringAppend.toString();
        }
        this.global$Mnvar$Mnenvironment = Environment.make(obj);
        Breakfast = null;
        this.form$Mnname$Mnsymbol = Lit0;
        this.events$Mnto$Mnregister = LList.Empty;
        this.components$Mnto$Mncreate = LList.Empty;
        this.global$Mnvars$Mnto$Mncreate = LList.Empty;
        this.form$Mndo$Mnafter$Mncreation = LList.Empty;
        C0643runtime.$instance.run();
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0643runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "Food_recipe", Lit4);
            C0643runtime.setAndCoerceProperty$Ex(Lit0, Lit5, Boolean.TRUE, Lit6);
            C0643runtime.setAndCoerceProperty$Ex(Lit0, Lit7, "Responsive", Lit4);
            Values.writeValues(C0643runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "Breakfast", Lit4), $result);
        } else {
            addToFormDoAfterCreation(new Promise(lambda$Fn2));
        }
        this.VerticalScrollArrangement1 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit0, Lit9, Lit10, lambda$Fn3), $result);
        } else {
            addToComponents(Lit0, Lit18, Lit10, lambda$Fn4);
        }
        this.HorizontalArrangement8 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit10, Lit19, Lit20, lambda$Fn5), $result);
        } else {
            addToComponents(Lit10, Lit26, Lit20, lambda$Fn6);
        }
        this.Image7 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit20, Lit27, Lit28, lambda$Fn7), $result);
        } else {
            addToComponents(Lit20, Lit33, Lit28, lambda$Fn8);
        }
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0643runtime.addToCurrentFormEnvironment(Lit35, this.Image7$Click);
        } else {
            addToFormEnvironment(Lit35, this.Image7$Click);
        }
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0643runtime.$Stthis$Mnform$St, "Image7", "Click");
        } else {
            addToEvents(Lit28, Lit36);
        }
        this.HorizontalArrangement9 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit20, Lit37, Lit38, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit20, Lit39, Lit38, Boolean.FALSE);
        }
        this.HorizontalArrangement10 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit20, Lit40, Lit41, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit20, Lit42, Lit41, Boolean.FALSE);
        }
        this.Label6 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit20, Lit43, Lit44, lambda$Fn9), $result);
        } else {
            addToComponents(Lit20, Lit51, Lit44, lambda$Fn10);
        }
        this.HorizontalArrangement11 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit20, Lit52, Lit53, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit20, Lit54, Lit53, Boolean.FALSE);
        }
        this.HorizontalArrangement12 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit20, Lit55, Lit56, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit20, Lit57, Lit56, Boolean.FALSE);
        }
        this.Image6 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit20, Lit58, Lit59, lambda$Fn11), $result);
        } else {
            addToComponents(Lit20, Lit62, Lit59, lambda$Fn12);
        }
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0643runtime.addToCurrentFormEnvironment(Lit64, this.Image6$Click);
        } else {
            addToFormEnvironment(Lit64, this.Image6$Click);
        }
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0643runtime.$Stthis$Mnform$St, "Image6", "Click");
        } else {
            addToEvents(Lit59, Lit36);
        }
        this.Button1 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit10, Lit65, Lit66, lambda$Fn13), $result);
        } else {
            addToComponents(Lit10, Lit68, Lit66, lambda$Fn14);
        }
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0643runtime.addToCurrentFormEnvironment(Lit70, this.Button1$Click);
        } else {
            addToFormEnvironment(Lit70, this.Button1$Click);
        }
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0643runtime.$Stthis$Mnform$St, "Button1", "Click");
        } else {
            addToEvents(Lit66, Lit36);
        }
        this.HorizontalArrangement14 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit10, Lit71, Lit72, lambda$Fn15), $result);
        } else {
            addToComponents(Lit10, Lit74, Lit72, lambda$Fn16);
        }
        this.Label8 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit72, Lit75, Lit76, lambda$Fn17), $result);
        } else {
            addToComponents(Lit72, Lit78, Lit76, lambda$Fn18);
        }
        this.Image8 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit10, Lit79, Lit80, lambda$Fn19), $result);
        } else {
            addToComponents(Lit10, Lit83, Lit80, lambda$Fn20);
        }
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0643runtime.addToCurrentFormEnvironment(Lit85, this.Image8$Click);
        } else {
            addToFormEnvironment(Lit85, this.Image8$Click);
        }
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0643runtime.$Stthis$Mnform$St, "Image8", "Click");
        } else {
            addToEvents(Lit80, Lit36);
        }
        this.Label9 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit10, Lit86, Lit87, lambda$Fn21), $result);
        } else {
            addToComponents(Lit10, Lit89, Lit87, lambda$Fn22);
        }
        this.Image9 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit10, Lit90, Lit91, lambda$Fn23), $result);
        } else {
            addToComponents(Lit10, Lit92, Lit91, lambda$Fn24);
        }
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0643runtime.addToCurrentFormEnvironment(Lit94, this.Image9$Click);
        } else {
            addToFormEnvironment(Lit94, this.Image9$Click);
        }
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0643runtime.$Stthis$Mnform$St, "Image9", "Click");
        } else {
            addToEvents(Lit91, Lit36);
        }
        this.Label10 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit10, Lit95, Lit96, lambda$Fn25), $result);
        } else {
            addToComponents(Lit10, Lit98, Lit96, lambda$Fn26);
        }
        this.HorizontalArrangement13 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit10, Lit99, Lit100, lambda$Fn27), $result);
        } else {
            addToComponents(Lit10, Lit102, Lit100, lambda$Fn28);
        }
        this.Label7 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit100, Lit103, Lit104, lambda$Fn29), $result);
        } else {
            addToComponents(Lit100, Lit106, Lit104, lambda$Fn30);
        }
        this.Image1 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit10, Lit107, Lit108, lambda$Fn31), $result);
        } else {
            addToComponents(Lit10, Lit109, Lit108, lambda$Fn32);
        }
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0643runtime.addToCurrentFormEnvironment(Lit111, this.Image1$Click);
        } else {
            addToFormEnvironment(Lit111, this.Image1$Click);
        }
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0643runtime.$Stthis$Mnform$St, "Image1", "Click");
        } else {
            addToEvents(Lit108, Lit36);
        }
        this.Label1 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit10, Lit112, Lit113, lambda$Fn33), $result);
        } else {
            addToComponents(Lit10, Lit115, Lit113, lambda$Fn34);
        }
        this.Image2 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit10, Lit116, Lit117, lambda$Fn35), $result);
        } else {
            addToComponents(Lit10, Lit118, Lit117, lambda$Fn36);
        }
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0643runtime.addToCurrentFormEnvironment(Lit120, this.Image2$Click);
        } else {
            addToFormEnvironment(Lit120, this.Image2$Click);
        }
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0643runtime.$Stthis$Mnform$St, "Image2", "Click");
        } else {
            addToEvents(Lit117, Lit36);
        }
        this.Label2 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit10, Lit121, Lit122, lambda$Fn37), $result);
        } else {
            addToComponents(Lit10, Lit124, Lit122, lambda$Fn38);
        }
        this.Image3 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit10, Lit125, Lit126, lambda$Fn39), $result);
        } else {
            addToComponents(Lit10, Lit127, Lit126, lambda$Fn40);
        }
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0643runtime.addToCurrentFormEnvironment(Lit129, this.Image3$Click);
        } else {
            addToFormEnvironment(Lit129, this.Image3$Click);
        }
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0643runtime.$Stthis$Mnform$St, "Image3", "Click");
        } else {
            addToEvents(Lit126, Lit36);
        }
        this.Label3 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit10, Lit130, Lit131, lambda$Fn41), $result);
        } else {
            addToComponents(Lit10, Lit133, Lit131, lambda$Fn42);
        }
        this.Image4 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit10, Lit134, Lit135, lambda$Fn43), $result);
        } else {
            addToComponents(Lit10, Lit136, Lit135, lambda$Fn44);
        }
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0643runtime.addToCurrentFormEnvironment(Lit138, this.Image4$Click);
        } else {
            addToFormEnvironment(Lit138, this.Image4$Click);
        }
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0643runtime.$Stthis$Mnform$St, "Image4", "Click");
        } else {
            addToEvents(Lit135, Lit36);
        }
        this.Label4 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit10, Lit139, Lit140, lambda$Fn45), $result);
        } else {
            addToComponents(Lit10, Lit142, Lit140, lambda$Fn46);
        }
        this.Image5 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit10, Lit143, Lit144, lambda$Fn47), $result);
        } else {
            addToComponents(Lit10, Lit145, Lit144, lambda$Fn48);
        }
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0643runtime.addToCurrentFormEnvironment(Lit147, this.Image5$Click);
        } else {
            addToFormEnvironment(Lit147, this.Image5$Click);
        }
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0643runtime.$Stthis$Mnform$St, "Image5", "Click");
        } else {
            addToEvents(Lit144, Lit36);
        }
        this.Label5 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit10, Lit148, Lit149, lambda$Fn49), $result);
        } else {
            addToComponents(Lit10, Lit151, Lit149, lambda$Fn50);
        }
        C0643runtime.initRuntime();
    }

    static Object lambda3() {
        C0643runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "Food_recipe", Lit4);
        C0643runtime.setAndCoerceProperty$Ex(Lit0, Lit5, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit0, Lit7, "Responsive", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "Breakfast", Lit4);
    }

    static Object lambda4() {
        C0643runtime.setAndCoerceProperty$Ex(Lit10, Lit11, Lit12, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit10, Lit14, Lit15, Lit13);
        return C0643runtime.setAndCoerceProperty$Ex(Lit10, Lit16, Lit17, Lit13);
    }

    static Object lambda5() {
        C0643runtime.setAndCoerceProperty$Ex(Lit10, Lit11, Lit12, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit10, Lit14, Lit15, Lit13);
        return C0643runtime.setAndCoerceProperty$Ex(Lit10, Lit16, Lit17, Lit13);
    }

    static Object lambda6() {
        C0643runtime.setAndCoerceProperty$Ex(Lit20, Lit11, Lit12, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit20, Lit21, Lit22, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit20, Lit14, Lit23, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit20, Lit24, Lit25, Lit13);
        return C0643runtime.setAndCoerceProperty$Ex(Lit20, Lit16, Lit17, Lit13);
    }

    static Object lambda7() {
        C0643runtime.setAndCoerceProperty$Ex(Lit20, Lit11, Lit12, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit20, Lit21, Lit22, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit20, Lit14, Lit23, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit20, Lit24, Lit25, Lit13);
        return C0643runtime.setAndCoerceProperty$Ex(Lit20, Lit16, Lit17, Lit13);
    }

    static Object lambda8() {
        C0643runtime.setAndCoerceProperty$Ex(Lit28, Lit29, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit28, Lit24, Lit30, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit28, Lit31, "image_2021-11-25_125604.png", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit28, Lit16, Lit32, Lit13);
    }

    static Object lambda9() {
        C0643runtime.setAndCoerceProperty$Ex(Lit28, Lit29, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit28, Lit24, Lit30, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit28, Lit31, "image_2021-11-25_125604.png", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit28, Lit16, Lit32, Lit13);
    }

    public Object Image7$Click() {
        C0643runtime.setThisForm();
        return C0643runtime.callYailPrimitive(C0643runtime.open$Mnanother$Mnscreen, LList.list1("Home"), Lit34, "open another screen");
    }

    static Object lambda10() {
        C0643runtime.setAndCoerceProperty$Ex(Lit44, Lit45, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit44, Lit46, Lit47, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit44, Lit48, "Breakfast", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit44, Lit49, Lit50, Lit13);
    }

    static Object lambda11() {
        C0643runtime.setAndCoerceProperty$Ex(Lit44, Lit45, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit44, Lit46, Lit47, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit44, Lit48, "Breakfast", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit44, Lit49, Lit50, Lit13);
    }

    static Object lambda12() {
        C0643runtime.setAndCoerceProperty$Ex(Lit59, Lit29, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit59, Lit24, Lit60, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit59, Lit31, "image_2021-11-25_125652.png", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit59, Lit16, Lit61, Lit13);
    }

    static Object lambda13() {
        C0643runtime.setAndCoerceProperty$Ex(Lit59, Lit29, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit59, Lit24, Lit60, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit59, Lit31, "image_2021-11-25_125652.png", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit59, Lit16, Lit61, Lit13);
    }

    public Object Image6$Click() {
        C0643runtime.setThisForm();
        return C0643runtime.callYailPrimitive(C0643runtime.open$Mnanother$Mnscreen, LList.list1("Screen1"), Lit63, "open another screen");
    }

    static Object lambda14() {
        C0643runtime.setAndCoerceProperty$Ex(Lit66, Lit14, Lit67, Lit13);
        return C0643runtime.setAndCoerceProperty$Ex(Lit66, Lit48, "Go to schedule", Lit4);
    }

    static Object lambda15() {
        C0643runtime.setAndCoerceProperty$Ex(Lit66, Lit14, Lit67, Lit13);
        return C0643runtime.setAndCoerceProperty$Ex(Lit66, Lit48, "Go to schedule", Lit4);
    }

    public Object Button1$Click() {
        C0643runtime.setThisForm();
        return C0643runtime.callYailPrimitive(C0643runtime.open$Mnanother$Mnscreen, LList.list1("Suggest_schedule"), Lit69, "open another screen");
    }

    static Object lambda16() {
        C0643runtime.setAndCoerceProperty$Ex(Lit72, Lit11, Lit12, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit72, Lit14, Lit73, Lit13);
        return C0643runtime.setAndCoerceProperty$Ex(Lit72, Lit16, Lit17, Lit13);
    }

    static Object lambda17() {
        C0643runtime.setAndCoerceProperty$Ex(Lit72, Lit11, Lit12, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit72, Lit14, Lit73, Lit13);
        return C0643runtime.setAndCoerceProperty$Ex(Lit72, Lit16, Lit17, Lit13);
    }

    static Object lambda18() {
        C0643runtime.setAndCoerceProperty$Ex(Lit76, Lit48, "Veg", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit76, Lit49, Lit77, Lit13);
    }

    static Object lambda19() {
        C0643runtime.setAndCoerceProperty$Ex(Lit76, Lit48, "Veg", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit76, Lit49, Lit77, Lit13);
    }

    static Object lambda20() {
        C0643runtime.setAndCoerceProperty$Ex(Lit80, Lit29, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit80, Lit24, Lit81, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit80, Lit31, "image_2021-12-03_000210.png", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit80, Lit16, Lit82, Lit13);
    }

    static Object lambda21() {
        C0643runtime.setAndCoerceProperty$Ex(Lit80, Lit29, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit80, Lit24, Lit81, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit80, Lit31, "image_2021-12-03_000210.png", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit80, Lit16, Lit82, Lit13);
    }

    public Object Image8$Click() {
        C0643runtime.setThisForm();
        return C0643runtime.callYailPrimitive(C0643runtime.open$Mnanother$Mnscreen, LList.list1("Recipe"), Lit84, "open another screen");
    }

    static Object lambda22() {
        C0643runtime.setAndCoerceProperty$Ex(Lit87, Lit48, "Veggie breakfast fry up", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit87, Lit49, Lit88, Lit13);
    }

    static Object lambda23() {
        C0643runtime.setAndCoerceProperty$Ex(Lit87, Lit48, "Veggie breakfast fry up", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit87, Lit49, Lit88, Lit13);
    }

    static Object lambda24() {
        C0643runtime.setAndCoerceProperty$Ex(Lit91, Lit29, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit91, Lit24, Lit81, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit91, Lit31, "image_2021-12-02_235748.png", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit91, Lit16, Lit82, Lit13);
    }

    static Object lambda25() {
        C0643runtime.setAndCoerceProperty$Ex(Lit91, Lit29, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit91, Lit24, Lit81, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit91, Lit31, "image_2021-12-02_235748.png", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit91, Lit16, Lit82, Lit13);
    }

    public Object Image9$Click() {
        C0643runtime.setThisForm();
        return C0643runtime.callYailPrimitive(C0643runtime.open$Mnanother$Mnscreen, LList.list1("Recipe"), Lit93, "open another screen");
    }

    static Object lambda26() {
        C0643runtime.setAndCoerceProperty$Ex(Lit96, Lit48, "Enchilada lentil casserole", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit96, Lit49, Lit97, Lit13);
    }

    static Object lambda27() {
        C0643runtime.setAndCoerceProperty$Ex(Lit96, Lit48, "Enchilada lentil casserole", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit96, Lit49, Lit97, Lit13);
    }

    static Object lambda28() {
        C0643runtime.setAndCoerceProperty$Ex(Lit100, Lit11, Lit12, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit100, Lit14, Lit101, Lit13);
        return C0643runtime.setAndCoerceProperty$Ex(Lit100, Lit16, Lit17, Lit13);
    }

    static Object lambda29() {
        C0643runtime.setAndCoerceProperty$Ex(Lit100, Lit11, Lit12, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit100, Lit14, Lit101, Lit13);
        return C0643runtime.setAndCoerceProperty$Ex(Lit100, Lit16, Lit17, Lit13);
    }

    static Object lambda30() {
        C0643runtime.setAndCoerceProperty$Ex(Lit104, Lit48, "Non-Veg", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit104, Lit49, Lit105, Lit13);
    }

    static Object lambda31() {
        C0643runtime.setAndCoerceProperty$Ex(Lit104, Lit48, "Non-Veg", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit104, Lit49, Lit105, Lit13);
    }

    static Object lambda32() {
        C0643runtime.setAndCoerceProperty$Ex(Lit108, Lit29, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit108, Lit24, Lit81, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit108, Lit31, "image_2021-12-03_000054.png", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit108, Lit16, Lit82, Lit13);
    }

    static Object lambda33() {
        C0643runtime.setAndCoerceProperty$Ex(Lit108, Lit29, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit108, Lit24, Lit81, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit108, Lit31, "image_2021-12-03_000054.png", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit108, Lit16, Lit82, Lit13);
    }

    public Object Image1$Click() {
        C0643runtime.setThisForm();
        return C0643runtime.callYailPrimitive(C0643runtime.open$Mnanother$Mnscreen, LList.list1("Recipe"), Lit110, "open another screen");
    }

    static Object lambda34() {
        C0643runtime.setAndCoerceProperty$Ex(Lit113, Lit48, "Omelette sandwich", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit113, Lit49, Lit114, Lit13);
    }

    static Object lambda35() {
        C0643runtime.setAndCoerceProperty$Ex(Lit113, Lit48, "Omelette sandwich", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit113, Lit49, Lit114, Lit13);
    }

    static Object lambda36() {
        C0643runtime.setAndCoerceProperty$Ex(Lit117, Lit29, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit117, Lit24, Lit81, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit117, Lit31, "image_2021-11-23_121142.png", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit117, Lit16, Lit82, Lit13);
    }

    static Object lambda37() {
        C0643runtime.setAndCoerceProperty$Ex(Lit117, Lit29, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit117, Lit24, Lit81, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit117, Lit31, "image_2021-11-23_121142.png", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit117, Lit16, Lit82, Lit13);
    }

    public Object Image2$Click() {
        C0643runtime.setThisForm();
        return C0643runtime.callYailPrimitive(C0643runtime.open$Mnanother$Mnscreen, LList.list1("Recipe"), Lit119, "open another screen");
    }

    static Object lambda38() {
        C0643runtime.setAndCoerceProperty$Ex(Lit122, Lit48, "Salmon and egg breakfast wrap", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit122, Lit49, Lit123, Lit13);
    }

    static Object lambda39() {
        C0643runtime.setAndCoerceProperty$Ex(Lit122, Lit48, "Salmon and egg breakfast wrap", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit122, Lit49, Lit123, Lit13);
    }

    static Object lambda40() {
        C0643runtime.setAndCoerceProperty$Ex(Lit126, Lit29, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit126, Lit24, Lit81, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit126, Lit31, "image_2021-11-23_224345.png", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit126, Lit16, Lit82, Lit13);
    }

    static Object lambda41() {
        C0643runtime.setAndCoerceProperty$Ex(Lit126, Lit29, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit126, Lit24, Lit81, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit126, Lit31, "image_2021-11-23_224345.png", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit126, Lit16, Lit82, Lit13);
    }

    public Object Image3$Click() {
        C0643runtime.setThisForm();
        return C0643runtime.callYailPrimitive(C0643runtime.open$Mnanother$Mnscreen, LList.list1("Recipe"), Lit128, "open another screen");
    }

    static Object lambda42() {
        C0643runtime.setAndCoerceProperty$Ex(Lit131, Lit48, "Stress-free full English breakfast", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit131, Lit49, Lit132, Lit13);
    }

    static Object lambda43() {
        C0643runtime.setAndCoerceProperty$Ex(Lit131, Lit48, "Stress-free full English breakfast", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit131, Lit49, Lit132, Lit13);
    }

    static Object lambda44() {
        C0643runtime.setAndCoerceProperty$Ex(Lit135, Lit29, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit135, Lit24, Lit81, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit135, Lit31, "image_2021-11-23_224902.png", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit135, Lit16, Lit82, Lit13);
    }

    static Object lambda45() {
        C0643runtime.setAndCoerceProperty$Ex(Lit135, Lit29, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit135, Lit24, Lit81, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit135, Lit31, "image_2021-11-23_224902.png", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit135, Lit16, Lit82, Lit13);
    }

    public Object Image4$Click() {
        C0643runtime.setThisForm();
        return C0643runtime.callYailPrimitive(C0643runtime.open$Mnanother$Mnscreen, LList.list1("Recipe"), Lit137, "open another screen");
    }

    static Object lambda46() {
        C0643runtime.setAndCoerceProperty$Ex(Lit140, Lit48, "The Ulster fry", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit140, Lit49, Lit141, Lit13);
    }

    static Object lambda47() {
        C0643runtime.setAndCoerceProperty$Ex(Lit140, Lit48, "The Ulster fry", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit140, Lit49, Lit141, Lit13);
    }

    static Object lambda48() {
        C0643runtime.setAndCoerceProperty$Ex(Lit144, Lit29, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit144, Lit24, Lit81, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit144, Lit31, "image_2021-11-23_224721.png", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit144, Lit16, Lit82, Lit13);
    }

    static Object lambda49() {
        C0643runtime.setAndCoerceProperty$Ex(Lit144, Lit29, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit144, Lit24, Lit81, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit144, Lit31, "image_2021-11-23_224721.png", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit144, Lit16, Lit82, Lit13);
    }

    /* compiled from: Breakfast.yail */
    public class frame extends ModuleBody {
        Breakfast $main;

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 1:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 1;
                    return 0;
                case 2:
                    if (!(obj instanceof Breakfast)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 1;
                    return 0;
                case 3:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 1;
                    return 0;
                case 5:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 1;
                    return 0;
                case 7:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 1;
                    return 0;
                case 12:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 1;
                    return 0;
                case 13:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 1;
                    return 0;
                case 14:
                    if (!(obj instanceof Breakfast)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 1;
                    return 0;
                default:
                    return super.match1(moduleMethod, obj, callContext);
            }
        }

        public int match2(ModuleMethod moduleMethod, Object obj, Object obj2, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 4:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 2;
                    return 0;
                case 5:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 2;
                    return 0;
                case 8:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 2;
                    return 0;
                case 9:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 2;
                    return 0;
                case 11:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 2;
                    return 0;
                case 17:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 2;
                    return 0;
                default:
                    return super.match2(moduleMethod, obj, obj2, callContext);
            }
        }

        public int match4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 10:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 4;
                    return 0;
                case 15:
                    if (!(obj instanceof Breakfast)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    if (!(obj2 instanceof Component)) {
                        return -786430;
                    }
                    callContext.value2 = obj2;
                    if (!(obj3 instanceof String)) {
                        return -786429;
                    }
                    callContext.value3 = obj3;
                    if (!(obj4 instanceof String)) {
                        return -786428;
                    }
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 4;
                    return 0;
                case 16:
                    if (!(obj instanceof Breakfast)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    if (!(obj2 instanceof Component)) {
                        return -786430;
                    }
                    callContext.value2 = obj2;
                    if (!(obj3 instanceof String)) {
                        return -786429;
                    }
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 4;
                    return 0;
                default:
                    return super.match4(moduleMethod, obj, obj2, obj3, obj4, callContext);
            }
        }

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            switch (moduleMethod.selector) {
                case 1:
                    return this.$main.getSimpleName(obj);
                case 2:
                    try {
                        this.$main.onCreate((Bundle) obj);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "onCreate", 1, obj);
                    }
                case 3:
                    this.$main.androidLogForm(obj);
                    return Values.empty;
                case 5:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case 7:
                    try {
                        return this.$main.isBoundInFormEnvironment((Symbol) obj) ? Boolean.TRUE : Boolean.FALSE;
                    } catch (ClassCastException e3) {
                        throw new WrongType(e3, "is-bound-in-form-environment", 1, obj);
                    }
                case 12:
                    this.$main.addToFormDoAfterCreation(obj);
                    return Values.empty;
                case 13:
                    this.$main.sendError(obj);
                    return Values.empty;
                case 14:
                    this.$main.processException(obj);
                    return Values.empty;
                default:
                    return super.apply1(moduleMethod, obj);
            }
        }

        public Object apply4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4) {
            boolean z = true;
            switch (moduleMethod.selector) {
                case 10:
                    this.$main.addToComponents(obj, obj2, obj3, obj4);
                    return Values.empty;
                case 15:
                    try {
                        try {
                            try {
                                try {
                                    return this.$main.dispatchEvent((Component) obj, (String) obj2, (String) obj3, (Object[]) obj4) ? Boolean.TRUE : Boolean.FALSE;
                                } catch (ClassCastException e) {
                                    throw new WrongType(e, "dispatchEvent", 4, obj4);
                                }
                            } catch (ClassCastException e2) {
                                throw new WrongType(e2, "dispatchEvent", 3, obj3);
                            }
                        } catch (ClassCastException e3) {
                            throw new WrongType(e3, "dispatchEvent", 2, obj2);
                        }
                    } catch (ClassCastException e4) {
                        throw new WrongType(e4, "dispatchEvent", 1, obj);
                    }
                case 16:
                    Breakfast breakfast = this.$main;
                    try {
                        Component component = (Component) obj;
                        try {
                            String str = (String) obj2;
                            try {
                                if (obj3 == Boolean.FALSE) {
                                    z = false;
                                }
                                try {
                                    breakfast.dispatchGenericEvent(component, str, z, (Object[]) obj4);
                                    return Values.empty;
                                } catch (ClassCastException e5) {
                                    throw new WrongType(e5, "dispatchGenericEvent", 4, obj4);
                                }
                            } catch (ClassCastException e6) {
                                throw new WrongType(e6, "dispatchGenericEvent", 3, obj3);
                            }
                        } catch (ClassCastException e7) {
                            throw new WrongType(e7, "dispatchGenericEvent", 2, obj2);
                        }
                    } catch (ClassCastException e8) {
                        throw new WrongType(e8, "dispatchGenericEvent", 1, obj);
                    }
                default:
                    return super.apply4(moduleMethod, obj, obj2, obj3, obj4);
            }
        }

        public Object apply2(ModuleMethod moduleMethod, Object obj, Object obj2) {
            switch (moduleMethod.selector) {
                case 4:
                    try {
                        this.$main.addToFormEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "add-to-form-environment", 1, obj);
                    }
                case 5:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj, obj2);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case 8:
                    try {
                        this.$main.addToGlobalVarEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e3) {
                        throw new WrongType(e3, "add-to-global-var-environment", 1, obj);
                    }
                case 9:
                    this.$main.addToEvents(obj, obj2);
                    return Values.empty;
                case 11:
                    this.$main.addToGlobalVars(obj, obj2);
                    return Values.empty;
                case 17:
                    return this.$main.lookupHandler(obj, obj2);
                default:
                    return super.apply2(moduleMethod, obj, obj2);
            }
        }

        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case 18:
                    return Breakfast.lambda2();
                case 19:
                    this.$main.$define();
                    return Values.empty;
                case 20:
                    return Breakfast.lambda3();
                case 21:
                    return Breakfast.lambda4();
                case 22:
                    return Breakfast.lambda5();
                case 23:
                    return Breakfast.lambda6();
                case 24:
                    return Breakfast.lambda7();
                case 25:
                    return Breakfast.lambda8();
                case 26:
                    return Breakfast.lambda9();
                case 27:
                    return this.$main.Image7$Click();
                case 28:
                    return Breakfast.lambda10();
                case 29:
                    return Breakfast.lambda11();
                case 30:
                    return Breakfast.lambda12();
                case 31:
                    return Breakfast.lambda13();
                case 32:
                    return this.$main.Image6$Click();
                case 33:
                    return Breakfast.lambda14();
                case 34:
                    return Breakfast.lambda15();
                case 35:
                    return this.$main.Button1$Click();
                case 36:
                    return Breakfast.lambda16();
                case 37:
                    return Breakfast.lambda17();
                case 38:
                    return Breakfast.lambda18();
                case 39:
                    return Breakfast.lambda19();
                case 40:
                    return Breakfast.lambda20();
                case 41:
                    return Breakfast.lambda21();
                case 42:
                    return this.$main.Image8$Click();
                case 43:
                    return Breakfast.lambda22();
                case 44:
                    return Breakfast.lambda23();
                case 45:
                    return Breakfast.lambda24();
                case 46:
                    return Breakfast.lambda25();
                case 47:
                    return this.$main.Image9$Click();
                case 48:
                    return Breakfast.lambda26();
                case 49:
                    return Breakfast.lambda27();
                case 50:
                    return Breakfast.lambda28();
                case 51:
                    return Breakfast.lambda29();
                case 52:
                    return Breakfast.lambda30();
                case 53:
                    return Breakfast.lambda31();
                case 54:
                    return Breakfast.lambda32();
                case 55:
                    return Breakfast.lambda33();
                case 56:
                    return this.$main.Image1$Click();
                case 57:
                    return Breakfast.lambda34();
                case 58:
                    return Breakfast.lambda35();
                case 59:
                    return Breakfast.lambda36();
                case 60:
                    return Breakfast.lambda37();
                case 61:
                    return this.$main.Image2$Click();
                case 62:
                    return Breakfast.lambda38();
                case 63:
                    return Breakfast.lambda39();
                case 64:
                    return Breakfast.lambda40();
                case 65:
                    return Breakfast.lambda41();
                case 66:
                    return this.$main.Image3$Click();
                case 67:
                    return Breakfast.lambda42();
                case 68:
                    return Breakfast.lambda43();
                case 69:
                    return Breakfast.lambda44();
                case 70:
                    return Breakfast.lambda45();
                case 71:
                    return this.$main.Image4$Click();
                case 72:
                    return Breakfast.lambda46();
                case 73:
                    return Breakfast.lambda47();
                case 74:
                    return Breakfast.lambda48();
                case 75:
                    return Breakfast.lambda49();
                case 76:
                    return this.$main.Image5$Click();
                case 77:
                    return Breakfast.lambda50();
                case 78:
                    return Breakfast.lambda51();
                default:
                    return super.apply0(moduleMethod);
            }
        }

        public int match0(ModuleMethod moduleMethod, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 18:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 19:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 20:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 21:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 22:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 23:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 24:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 25:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 26:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 27:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 28:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 29:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 30:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 31:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 32:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 33:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 34:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 35:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 36:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 37:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 38:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 39:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 40:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 41:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 42:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 43:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 44:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 45:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 46:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 47:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 48:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 49:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 50:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 51:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 52:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 53:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 54:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 55:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 56:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 57:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 58:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 59:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 60:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 61:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 62:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 63:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 64:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 65:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 66:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 67:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 68:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 69:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 70:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 71:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 72:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 73:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 74:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 75:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 76:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 77:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 78:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }
    }

    public Object Image5$Click() {
        C0643runtime.setThisForm();
        return C0643runtime.callYailPrimitive(C0643runtime.open$Mnanother$Mnscreen, LList.list1("Recipe"), Lit146, "open another screen");
    }

    static Object lambda50() {
        C0643runtime.setAndCoerceProperty$Ex(Lit149, Lit48, "Ham, egg and spinach Dutch baby", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit149, Lit49, Lit150, Lit13);
    }

    static Object lambda51() {
        C0643runtime.setAndCoerceProperty$Ex(Lit149, Lit48, "Ham, egg and spinach Dutch baby", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit149, Lit49, Lit150, Lit13);
    }

    public String getSimpleName(Object object) {
        return object.getClass().getSimpleName();
    }

    public void onCreate(Bundle icicle) {
        AppInventorCompatActivity.setClassicModeFromYail(true);
        super.onCreate(icicle);
    }

    public void androidLogForm(Object message) {
    }

    public void addToFormEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.form$Mnenvironment, object));
        this.form$Mnenvironment.put(name, object);
    }

    public Object lookupInFormEnvironment(Symbol name, Object default$Mnvalue) {
        boolean x = ((this.form$Mnenvironment == null ? 1 : 0) + 1) & true;
        if (x) {
            if (!this.form$Mnenvironment.isBound(name)) {
                return default$Mnvalue;
            }
        } else if (!x) {
            return default$Mnvalue;
        }
        return this.form$Mnenvironment.get(name);
    }

    public boolean isBoundInFormEnvironment(Symbol name) {
        return this.form$Mnenvironment.isBound(name);
    }

    public void addToGlobalVarEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.global$Mnvar$Mnenvironment, object));
        this.global$Mnvar$Mnenvironment.put(name, object);
    }

    public void addToEvents(Object component$Mnname, Object event$Mnname) {
        this.events$Mnto$Mnregister = C0655lists.cons(C0655lists.cons(component$Mnname, event$Mnname), this.events$Mnto$Mnregister);
    }

    public void addToComponents(Object container$Mnname, Object component$Mntype, Object component$Mnname, Object init$Mnthunk) {
        this.components$Mnto$Mncreate = C0655lists.cons(LList.list4(container$Mnname, component$Mntype, component$Mnname, init$Mnthunk), this.components$Mnto$Mncreate);
    }

    public void addToGlobalVars(Object var, Object val$Mnthunk) {
        this.global$Mnvars$Mnto$Mncreate = C0655lists.cons(LList.list2(var, val$Mnthunk), this.global$Mnvars$Mnto$Mncreate);
    }

    public void addToFormDoAfterCreation(Object thunk) {
        this.form$Mndo$Mnafter$Mncreation = C0655lists.cons(thunk, this.form$Mndo$Mnafter$Mncreation);
    }

    public void sendError(Object error) {
        RetValManager.sendError(error == null ? null : error.toString());
    }

    public void processException(Object ex) {
        Object apply1 = Scheme.applyToArgs.apply1(GetNamedPart.getNamedPart.apply2(ex, Lit1));
        RuntimeErrorAlert.alert(this, apply1 == null ? null : apply1.toString(), ex instanceof YailRuntimeError ? ((YailRuntimeError) ex).getErrorType() : "Runtime Error", "End Application");
    }

    public boolean dispatchEvent(Component componentObject, String registeredComponentName, String eventName, Object[] args) {
        boolean x;
        SimpleSymbol registeredObject = misc.string$To$Symbol(registeredComponentName);
        if (!isBoundInFormEnvironment(registeredObject)) {
            EventDispatcher.unregisterEventForDelegation(this, registeredComponentName, eventName);
            return false;
        } else if (lookupInFormEnvironment(registeredObject) != componentObject) {
            return false;
        } else {
            try {
                Scheme.apply.apply2(lookupHandler(registeredComponentName, eventName), LList.makeList(args, 0));
                return true;
            } catch (StopBlocksExecution e) {
                return false;
            } catch (PermissionException exception) {
                exception.printStackTrace();
                if (this == componentObject) {
                    x = true;
                } else {
                    x = false;
                }
                if (!x ? x : IsEqual.apply(eventName, "PermissionNeeded")) {
                    processException(exception);
                } else {
                    PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                }
                return false;
            } catch (Throwable exception2) {
                androidLogForm(exception2.getMessage());
                exception2.printStackTrace();
                processException(exception2);
                return false;
            }
        }
    }

    public void dispatchGenericEvent(Component componentObject, String eventName, boolean notAlreadyHandled, Object[] args) {
        Boolean bool;
        boolean x = true;
        Object handler = lookupInFormEnvironment(misc.string$To$Symbol(strings.stringAppend("any$", getSimpleName(componentObject), "$", eventName)));
        if (handler != Boolean.FALSE) {
            try {
                Apply apply = Scheme.apply;
                if (notAlreadyHandled) {
                    bool = Boolean.TRUE;
                } else {
                    bool = Boolean.FALSE;
                }
                apply.apply2(handler, C0655lists.cons(componentObject, C0655lists.cons(bool, LList.makeList(args, 0))));
            } catch (StopBlocksExecution e) {
            } catch (PermissionException exception) {
                exception.printStackTrace();
                if (this != componentObject) {
                    x = false;
                }
                if (!x ? x : IsEqual.apply(eventName, "PermissionNeeded")) {
                    processException(exception);
                } else {
                    PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                }
            } catch (Throwable exception2) {
                androidLogForm(exception2.getMessage());
                exception2.printStackTrace();
                processException(exception2);
            }
        }
    }

    public Object lookupHandler(Object componentName, Object eventName) {
        String str = null;
        String obj = componentName == null ? null : componentName.toString();
        if (eventName != null) {
            str = eventName.toString();
        }
        return lookupInFormEnvironment(misc.string$To$Symbol(EventDispatcher.makeFullEventName(obj, str)));
    }

    public void $define() {
        Object reverse;
        Object obj;
        Object reverse2;
        Object obj2;
        Object obj3;
        Object var;
        Object component$Mnname;
        Object obj4;
        Language.setDefaults(Scheme.getInstance());
        try {
            run();
        } catch (Exception exception) {
            androidLogForm(exception.getMessage());
            processException(exception);
        }
        Breakfast = this;
        addToFormEnvironment(Lit0, this);
        Object obj5 = this.events$Mnto$Mnregister;
        while (obj5 != LList.Empty) {
            try {
                Pair arg0 = (Pair) obj5;
                Object event$Mninfo = arg0.getCar();
                Object apply1 = C0655lists.car.apply1(event$Mninfo);
                String obj6 = apply1 == null ? null : apply1.toString();
                Object apply12 = C0655lists.cdr.apply1(event$Mninfo);
                EventDispatcher.registerEventForDelegation(this, obj6, apply12 == null ? null : apply12.toString());
                obj5 = arg0.getCdr();
            } catch (ClassCastException e) {
                throw new WrongType(e, "arg0", -2, obj5);
            }
        }
        try {
            LList components = C0655lists.reverse(this.components$Mnto$Mncreate);
            addToGlobalVars(Lit2, lambda$Fn1);
            reverse = C0655lists.reverse(this.form$Mndo$Mnafter$Mncreation);
            while (reverse != LList.Empty) {
                Pair arg02 = (Pair) reverse;
                misc.force(arg02.getCar());
                reverse = arg02.getCdr();
            }
            obj = components;
            while (obj != LList.Empty) {
                Pair arg03 = (Pair) obj;
                Object component$Mninfo = arg03.getCar();
                component$Mnname = C0655lists.caddr.apply1(component$Mninfo);
                C0655lists.cadddr.apply1(component$Mninfo);
                Object component$Mnobject = Invoke.make.apply2(C0655lists.cadr.apply1(component$Mninfo), lookupInFormEnvironment((Symbol) C0655lists.car.apply1(component$Mninfo)));
                SlotSet.set$Mnfield$Ex.apply3(this, component$Mnname, component$Mnobject);
                addToFormEnvironment((Symbol) component$Mnname, component$Mnobject);
                obj = arg03.getCdr();
            }
            reverse2 = C0655lists.reverse(this.global$Mnvars$Mnto$Mncreate);
            while (reverse2 != LList.Empty) {
                Pair arg04 = (Pair) reverse2;
                Object var$Mnval = arg04.getCar();
                var = C0655lists.car.apply1(var$Mnval);
                addToGlobalVarEnvironment((Symbol) var, Scheme.applyToArgs.apply1(C0655lists.cadr.apply1(var$Mnval)));
                reverse2 = arg04.getCdr();
            }
            LList component$Mndescriptors = components;
            obj2 = component$Mndescriptors;
            while (obj2 != LList.Empty) {
                Pair arg05 = (Pair) obj2;
                Object component$Mninfo2 = arg05.getCar();
                C0655lists.caddr.apply1(component$Mninfo2);
                Object init$Mnthunk = C0655lists.cadddr.apply1(component$Mninfo2);
                if (init$Mnthunk != Boolean.FALSE) {
                    Scheme.applyToArgs.apply1(init$Mnthunk);
                }
                obj2 = arg05.getCdr();
            }
            obj3 = component$Mndescriptors;
            while (obj3 != LList.Empty) {
                Pair arg06 = (Pair) obj3;
                Object component$Mninfo3 = arg06.getCar();
                Object component$Mnname2 = C0655lists.caddr.apply1(component$Mninfo3);
                C0655lists.cadddr.apply1(component$Mninfo3);
                callInitialize(SlotGet.field.apply2(this, component$Mnname2));
                obj3 = arg06.getCdr();
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "arg0", -2, obj3);
        } catch (ClassCastException e3) {
            throw new WrongType(e3, "arg0", -2, obj2);
        } catch (ClassCastException e4) {
            throw new WrongType(e4, "add-to-global-var-environment", 0, var);
        } catch (ClassCastException e5) {
            throw new WrongType(e5, "arg0", -2, reverse2);
        } catch (ClassCastException e6) {
            throw new WrongType(e6, "add-to-form-environment", 0, component$Mnname);
        } catch (ClassCastException e7) {
            throw new WrongType(e7, "lookup-in-form-environment", 0, obj4);
        } catch (ClassCastException e8) {
            throw new WrongType(e8, "arg0", -2, obj);
        } catch (ClassCastException e9) {
            throw new WrongType(e9, "arg0", -2, reverse);
        } catch (YailRuntimeError exception2) {
            processException(exception2);
        }
    }

    public static SimpleSymbol lambda1symbolAppend$V(Object[] argsArray) {
        LList symbols = LList.makeList(argsArray, 0);
        Apply apply = Scheme.apply;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        Object obj = LList.Empty;
        LList lList = symbols;
        while (lList != LList.Empty) {
            try {
                Pair arg0 = (Pair) lList;
                Object arg02 = arg0.getCdr();
                Object car = arg0.getCar();
                try {
                    obj = Pair.make(misc.symbol$To$String((Symbol) car), obj);
                    lList = arg02;
                } catch (ClassCastException e) {
                    throw new WrongType(e, "symbol->string", 1, car);
                }
            } catch (ClassCastException e2) {
                throw new WrongType(e2, "arg0", -2, lList);
            }
        }
        Object apply2 = apply.apply2(moduleMethod, LList.reverseInPlace(obj));
        try {
            return misc.string$To$Symbol((CharSequence) apply2);
        } catch (ClassCastException e3) {
            throw new WrongType(e3, "string->symbol", 1, apply2);
        }
    }

    static Object lambda2() {
        return null;
    }
}
