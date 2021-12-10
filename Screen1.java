package appinventor.ai_anon2042442813087.Food_recipe_checkpoint_final;

import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.AppInventorCompatActivity;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.File;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.TextBox;
import com.google.appinventor.components.runtime.VerticalArrangement;
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

/* compiled from: Screen1.yail */
public class Screen1 extends Form implements Runnable {
    static final SimpleSymbol Lit0 = ((SimpleSymbol) new SimpleSymbol("Screen1").readResolve());
    static final SimpleSymbol Lit1 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final SimpleSymbol Lit10 = ((SimpleSymbol) new SimpleSymbol("Screen1$BackPressed").readResolve());
    static final PairWithPosition Lit100 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit4, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/Screen1.yail", 888951), "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/Screen1.yail", 888945);
    static final PairWithPosition Lit101 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit4, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/Screen1.yail", 889062), "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/Screen1.yail", 889056);
    static final PairWithPosition Lit102 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/Screen1.yail", 889157);
    static final SimpleSymbol Lit103 = ((SimpleSymbol) new SimpleSymbol("Button1$Click").readResolve());
    static final SimpleSymbol Lit104 = ((SimpleSymbol) new SimpleSymbol("Click").readResolve());
    static final FString Lit105 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit106 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement5").readResolve());
    static final IntNum Lit107 = IntNum.make(16777215);
    static final FString Lit108 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit109 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit11 = ((SimpleSymbol) new SimpleSymbol("BackPressed").readResolve());
    static final SimpleSymbol Lit110 = ((SimpleSymbol) new SimpleSymbol("Button2").readResolve());
    static final IntNum Lit111;
    static final FString Lit112 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit113;
    static final SimpleSymbol Lit114 = ((SimpleSymbol) new SimpleSymbol("Button2$Click").readResolve());
    static final FString Lit115 = new FString("com.google.appinventor.components.runtime.File");
    static final SimpleSymbol Lit116 = ((SimpleSymbol) new SimpleSymbol("File1").readResolve());
    static final FString Lit117 = new FString("com.google.appinventor.components.runtime.File");
    static final SimpleSymbol Lit118 = ((SimpleSymbol) new SimpleSymbol("get-simple-name").readResolve());
    static final SimpleSymbol Lit119 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final FString Lit12 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final SimpleSymbol Lit120 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final SimpleSymbol Lit121 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final SimpleSymbol Lit122 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit123 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit124 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final SimpleSymbol Lit125 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final SimpleSymbol Lit126 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit127 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit128 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final SimpleSymbol Lit129 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final SimpleSymbol Lit13 = ((SimpleSymbol) new SimpleSymbol("VerticalArrangement1").readResolve());
    static final SimpleSymbol Lit130 = ((SimpleSymbol) new SimpleSymbol("dispatchGenericEvent").readResolve());
    static final SimpleSymbol Lit131 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final SimpleSymbol Lit14 = ((SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve());
    static final IntNum Lit15;
    static final SimpleSymbol Lit16 = ((SimpleSymbol) new SimpleSymbol("number").readResolve());
    static final SimpleSymbol Lit17 = ((SimpleSymbol) new SimpleSymbol("Height").readResolve());
    static final IntNum Lit18 = IntNum.make(-2);
    static final SimpleSymbol Lit19 = ((SimpleSymbol) new SimpleSymbol("Width").readResolve());
    static final SimpleSymbol Lit2 = ((SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve());
    static final FString Lit20 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final FString Lit21 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit22 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement8").readResolve());
    static final SimpleSymbol Lit23 = ((SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve());
    static final IntNum Lit24 = IntNum.make(3);
    static final SimpleSymbol Lit25 = ((SimpleSymbol) new SimpleSymbol("AlignVertical").readResolve());
    static final IntNum Lit26 = IntNum.make(2);
    static final IntNum Lit27;
    static final IntNum Lit28 = IntNum.make(-1008);
    static final FString Lit29 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit3 = ((SimpleSymbol) new SimpleSymbol("AppName").readResolve());
    static final FString Lit30 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit31 = ((SimpleSymbol) new SimpleSymbol("Label5").readResolve());
    static final SimpleSymbol Lit32 = ((SimpleSymbol) new SimpleSymbol("FontBold").readResolve());
    static final SimpleSymbol Lit33 = ((SimpleSymbol) new SimpleSymbol("FontSize").readResolve());
    static final DFloNum Lit34 = DFloNum.make((double) 24);
    static final SimpleSymbol Lit35 = ((SimpleSymbol) new SimpleSymbol("Text").readResolve());
    static final SimpleSymbol Lit36 = ((SimpleSymbol) new SimpleSymbol("TextColor").readResolve());
    static final IntNum Lit37;
    static final FString Lit38 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit39 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit4;
    static final SimpleSymbol Lit40 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement1").readResolve());
    static final IntNum Lit41;
    static final FString Lit42 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit43 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit44 = ((SimpleSymbol) new SimpleSymbol("Label1").readResolve());
    static final IntNum Lit45;
    static final IntNum Lit46 = IntNum.make(20);
    static final SimpleSymbol Lit47 = ((SimpleSymbol) new SimpleSymbol("FontTypeface").readResolve());
    static final SimpleSymbol Lit48 = ((SimpleSymbol) new SimpleSymbol("HTMLFormat").readResolve());
    static final IntNum Lit49;
    static final SimpleSymbol Lit5 = ((SimpleSymbol) new SimpleSymbol("ShowListsAsJson").readResolve());
    static final FString Lit50 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit51 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit52 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement2").readResolve());
    static final IntNum Lit53 = IntNum.make(16777215);
    static final FString Lit54 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit55 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit56 = ((SimpleSymbol) new SimpleSymbol("Label2").readResolve());
    static final IntNum Lit57;
    static final IntNum Lit58;
    static final FString Lit59 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit6 = ((SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve());
    static final FString Lit60 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final SimpleSymbol Lit61 = ((SimpleSymbol) new SimpleSymbol("TextBox1").readResolve());
    static final FString Lit62 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final FString Lit63 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit64 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement3").readResolve());
    static final IntNum Lit65 = IntNum.make(16777215);
    static final FString Lit66 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit67 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit68 = ((SimpleSymbol) new SimpleSymbol("Label3").readResolve());
    static final IntNum Lit69;
    static final SimpleSymbol Lit7 = ((SimpleSymbol) new SimpleSymbol("Sizing").readResolve());
    static final IntNum Lit70;
    static final FString Lit71 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit72 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final SimpleSymbol Lit73 = ((SimpleSymbol) new SimpleSymbol("TextBox2").readResolve());
    static final FString Lit74 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final FString Lit75 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit76 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement6").readResolve());
    static final IntNum Lit77;
    static final SimpleSymbol Lit78 = ((SimpleSymbol) new SimpleSymbol("Visible").readResolve());
    static final FString Lit79 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit8 = ((SimpleSymbol) new SimpleSymbol("Title").readResolve());
    static final FString Lit80 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit81 = ((SimpleSymbol) new SimpleSymbol("Label4").readResolve());
    static final IntNum Lit82;
    static final SimpleSymbol Lit83 = ((SimpleSymbol) new SimpleSymbol("FontItalic").readResolve());
    static final IntNum Lit84;
    static final FString Lit85 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit86 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit87 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement7").readResolve());
    static final IntNum Lit88;
    static final FString Lit89 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final PairWithPosition Lit9 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/Screen1.yail", 69710);
    static final FString Lit90 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit91 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement4").readResolve());
    static final IntNum Lit92 = IntNum.make(16777215);
    static final FString Lit93 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit94 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit95 = ((SimpleSymbol) new SimpleSymbol("Button1").readResolve());
    static final IntNum Lit96;
    static final SimpleSymbol Lit97 = ((SimpleSymbol) new SimpleSymbol("Shape").readResolve());
    static final IntNum Lit98 = IntNum.make(1);
    static final FString Lit99 = new FString("com.google.appinventor.components.runtime.Button");
    public static Screen1 Screen1;
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
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public Button Button1;
    public final ModuleMethod Button1$Click;
    public Button Button2;
    public final ModuleMethod Button2$Click;
    public File File1;
    public HorizontalArrangement HorizontalArrangement1;
    public HorizontalArrangement HorizontalArrangement2;
    public HorizontalArrangement HorizontalArrangement3;
    public HorizontalArrangement HorizontalArrangement4;
    public HorizontalArrangement HorizontalArrangement5;
    public HorizontalArrangement HorizontalArrangement6;
    public HorizontalArrangement HorizontalArrangement7;
    public HorizontalArrangement HorizontalArrangement8;
    public Label Label1;
    public Label Label2;
    public Label Label3;
    public Label Label4;
    public Label Label5;
    public final ModuleMethod Screen1$BackPressed;
    public TextBox TextBox1;
    public TextBox TextBox2;
    public VerticalArrangement VerticalArrangement1;
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
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit4 = simpleSymbol;
        Lit113 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/Screen1.yail", 987317);
        int[] iArr = new int[2];
        iArr[0] = -16711681;
        Lit111 = IntNum.make(iArr);
        int[] iArr2 = new int[2];
        iArr2[0] = -256;
        Lit96 = IntNum.make(iArr2);
        int[] iArr3 = new int[2];
        iArr3[0] = -16777216;
        Lit88 = IntNum.make(iArr3);
        int[] iArr4 = new int[2];
        iArr4[0] = -65536;
        Lit84 = IntNum.make(iArr4);
        int[] iArr5 = new int[2];
        iArr5[0] = -256;
        Lit82 = IntNum.make(iArr5);
        int[] iArr6 = new int[2];
        iArr6[0] = -16777216;
        Lit77 = IntNum.make(iArr6);
        int[] iArr7 = new int[2];
        iArr7[0] = -1;
        Lit70 = IntNum.make(iArr7);
        int[] iArr8 = new int[2];
        iArr8[0] = -12303292;
        Lit69 = IntNum.make(iArr8);
        int[] iArr9 = new int[2];
        iArr9[0] = -1;
        Lit58 = IntNum.make(iArr9);
        int[] iArr10 = new int[2];
        iArr10[0] = -12303292;
        Lit57 = IntNum.make(iArr10);
        int[] iArr11 = new int[2];
        iArr11[0] = -1;
        Lit49 = IntNum.make(iArr11);
        int[] iArr12 = new int[2];
        iArr12[0] = -12303292;
        Lit45 = IntNum.make(iArr12);
        int[] iArr13 = new int[2];
        iArr13[0] = -16777216;
        Lit41 = IntNum.make(iArr13);
        int[] iArr14 = new int[2];
        iArr14[0] = -65536;
        Lit37 = IntNum.make(iArr14);
        int[] iArr15 = new int[2];
        iArr15[0] = -16777216;
        Lit27 = IntNum.make(iArr15);
        int[] iArr16 = new int[2];
        iArr16[0] = -16777216;
        Lit15 = IntNum.make(iArr16);
    }

    public Screen1() {
        ModuleInfo.register(this);
        frame frame2 = new frame();
        frame2.$main = this;
        this.get$Mnsimple$Mnname = new ModuleMethod(frame2, 1, Lit118, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.onCreate = new ModuleMethod(frame2, 2, "onCreate", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frame2, 3, Lit119, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frame2, 4, Lit120, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 5, Lit121, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 7, Lit122, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frame2, 8, Lit123, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frame2, 9, Lit124, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frame2, 10, Lit125, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frame2, 11, Lit126, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frame2, 12, Lit127, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frame2, 13, Lit128, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frame2, 14, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frame2, 15, Lit129, 16388);
        this.dispatchGenericEvent = new ModuleMethod(frame2, 16, Lit130, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frame2, 17, Lit131, 8194);
        ModuleMethod moduleMethod = new ModuleMethod(frame2, 18, (Object) null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime2817826888930461115.scm:627");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(frame2, 19, "$define", 0);
        lambda$Fn2 = new ModuleMethod(frame2, 20, (Object) null, 0);
        this.Screen1$BackPressed = new ModuleMethod(frame2, 21, Lit10, 0);
        lambda$Fn3 = new ModuleMethod(frame2, 22, (Object) null, 0);
        lambda$Fn4 = new ModuleMethod(frame2, 23, (Object) null, 0);
        lambda$Fn5 = new ModuleMethod(frame2, 24, (Object) null, 0);
        lambda$Fn6 = new ModuleMethod(frame2, 25, (Object) null, 0);
        lambda$Fn7 = new ModuleMethod(frame2, 26, (Object) null, 0);
        lambda$Fn8 = new ModuleMethod(frame2, 27, (Object) null, 0);
        lambda$Fn9 = new ModuleMethod(frame2, 28, (Object) null, 0);
        lambda$Fn10 = new ModuleMethod(frame2, 29, (Object) null, 0);
        lambda$Fn11 = new ModuleMethod(frame2, 30, (Object) null, 0);
        lambda$Fn12 = new ModuleMethod(frame2, 31, (Object) null, 0);
        lambda$Fn13 = new ModuleMethod(frame2, 32, (Object) null, 0);
        lambda$Fn14 = new ModuleMethod(frame2, 33, (Object) null, 0);
        lambda$Fn15 = new ModuleMethod(frame2, 34, (Object) null, 0);
        lambda$Fn16 = new ModuleMethod(frame2, 35, (Object) null, 0);
        lambda$Fn17 = new ModuleMethod(frame2, 36, (Object) null, 0);
        lambda$Fn18 = new ModuleMethod(frame2, 37, (Object) null, 0);
        lambda$Fn19 = new ModuleMethod(frame2, 38, (Object) null, 0);
        lambda$Fn20 = new ModuleMethod(frame2, 39, (Object) null, 0);
        lambda$Fn21 = new ModuleMethod(frame2, 40, (Object) null, 0);
        lambda$Fn22 = new ModuleMethod(frame2, 41, (Object) null, 0);
        lambda$Fn23 = new ModuleMethod(frame2, 42, (Object) null, 0);
        lambda$Fn24 = new ModuleMethod(frame2, 43, (Object) null, 0);
        lambda$Fn25 = new ModuleMethod(frame2, 44, (Object) null, 0);
        lambda$Fn26 = new ModuleMethod(frame2, 45, (Object) null, 0);
        lambda$Fn27 = new ModuleMethod(frame2, 46, (Object) null, 0);
        lambda$Fn28 = new ModuleMethod(frame2, 47, (Object) null, 0);
        lambda$Fn29 = new ModuleMethod(frame2, 48, (Object) null, 0);
        lambda$Fn30 = new ModuleMethod(frame2, 49, (Object) null, 0);
        lambda$Fn31 = new ModuleMethod(frame2, 50, (Object) null, 0);
        lambda$Fn32 = new ModuleMethod(frame2, 51, (Object) null, 0);
        this.Button1$Click = new ModuleMethod(frame2, 52, Lit103, 0);
        lambda$Fn33 = new ModuleMethod(frame2, 53, (Object) null, 0);
        lambda$Fn34 = new ModuleMethod(frame2, 54, (Object) null, 0);
        lambda$Fn35 = new ModuleMethod(frame2, 55, (Object) null, 0);
        lambda$Fn36 = new ModuleMethod(frame2, 56, (Object) null, 0);
        this.Button2$Click = new ModuleMethod(frame2, 57, Lit114, 0);
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
        Screen1 = null;
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
            Values.writeValues(C0643runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "Screen1", Lit4), $result);
        } else {
            addToFormDoAfterCreation(new Promise(lambda$Fn2));
        }
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0643runtime.addToCurrentFormEnvironment(Lit10, this.Screen1$BackPressed);
        } else {
            addToFormEnvironment(Lit10, this.Screen1$BackPressed);
        }
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0643runtime.$Stthis$Mnform$St, "Screen1", "BackPressed");
        } else {
            addToEvents(Lit0, Lit11);
        }
        this.VerticalArrangement1 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit0, Lit12, Lit13, lambda$Fn3), $result);
        } else {
            addToComponents(Lit0, Lit20, Lit13, lambda$Fn4);
        }
        this.HorizontalArrangement8 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit13, Lit21, Lit22, lambda$Fn5), $result);
        } else {
            addToComponents(Lit13, Lit29, Lit22, lambda$Fn6);
        }
        this.Label5 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit22, Lit30, Lit31, lambda$Fn7), $result);
        } else {
            addToComponents(Lit22, Lit38, Lit31, lambda$Fn8);
        }
        this.HorizontalArrangement1 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit13, Lit39, Lit40, lambda$Fn9), $result);
        } else {
            addToComponents(Lit13, Lit42, Lit40, lambda$Fn10);
        }
        this.Label1 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit40, Lit43, Lit44, lambda$Fn11), $result);
        } else {
            addToComponents(Lit40, Lit50, Lit44, lambda$Fn12);
        }
        this.HorizontalArrangement2 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit13, Lit51, Lit52, lambda$Fn13), $result);
        } else {
            addToComponents(Lit13, Lit54, Lit52, lambda$Fn14);
        }
        this.Label2 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit52, Lit55, Lit56, lambda$Fn15), $result);
        } else {
            addToComponents(Lit52, Lit59, Lit56, lambda$Fn16);
        }
        this.TextBox1 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit52, Lit60, Lit61, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit52, Lit62, Lit61, Boolean.FALSE);
        }
        this.HorizontalArrangement3 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit13, Lit63, Lit64, lambda$Fn17), $result);
        } else {
            addToComponents(Lit13, Lit66, Lit64, lambda$Fn18);
        }
        this.Label3 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit64, Lit67, Lit68, lambda$Fn19), $result);
        } else {
            addToComponents(Lit64, Lit71, Lit68, lambda$Fn20);
        }
        this.TextBox2 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit64, Lit72, Lit73, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit64, Lit74, Lit73, Boolean.FALSE);
        }
        this.HorizontalArrangement6 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit13, Lit75, Lit76, lambda$Fn21), $result);
        } else {
            addToComponents(Lit13, Lit79, Lit76, lambda$Fn22);
        }
        this.Label4 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit76, Lit80, Lit81, lambda$Fn23), $result);
        } else {
            addToComponents(Lit76, Lit85, Lit81, lambda$Fn24);
        }
        this.HorizontalArrangement7 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit13, Lit86, Lit87, lambda$Fn25), $result);
        } else {
            addToComponents(Lit13, Lit89, Lit87, lambda$Fn26);
        }
        this.HorizontalArrangement4 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit13, Lit90, Lit91, lambda$Fn27), $result);
        } else {
            addToComponents(Lit13, Lit93, Lit91, lambda$Fn28);
        }
        this.Button1 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit91, Lit94, Lit95, lambda$Fn29), $result);
        } else {
            addToComponents(Lit91, Lit99, Lit95, lambda$Fn30);
        }
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0643runtime.addToCurrentFormEnvironment(Lit103, this.Button1$Click);
        } else {
            addToFormEnvironment(Lit103, this.Button1$Click);
        }
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0643runtime.$Stthis$Mnform$St, "Button1", "Click");
        } else {
            addToEvents(Lit95, Lit104);
        }
        this.HorizontalArrangement5 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit13, Lit105, Lit106, lambda$Fn33), $result);
        } else {
            addToComponents(Lit13, Lit108, Lit106, lambda$Fn34);
        }
        this.Button2 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit106, Lit109, Lit110, lambda$Fn35), $result);
        } else {
            addToComponents(Lit106, Lit112, Lit110, lambda$Fn36);
        }
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0643runtime.addToCurrentFormEnvironment(Lit114, this.Button2$Click);
        } else {
            addToFormEnvironment(Lit114, this.Button2$Click);
        }
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0643runtime.$Stthis$Mnform$St, "Button2", "Click");
        } else {
            addToEvents(Lit110, Lit104);
        }
        this.File1 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit0, Lit115, Lit116, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit117, Lit116, Boolean.FALSE);
        }
        C0643runtime.initRuntime();
    }

    static Object lambda3() {
        C0643runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "Food_recipe", Lit4);
        C0643runtime.setAndCoerceProperty$Ex(Lit0, Lit5, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit0, Lit7, "Responsive", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "Screen1", Lit4);
    }

    public Object Screen1$BackPressed() {
        C0643runtime.setThisForm();
        return C0643runtime.callYailPrimitive(C0643runtime.open$Mnanother$Mnscreen, LList.list1("Screen1"), Lit9, "open another screen");
    }

    static Object lambda4() {
        C0643runtime.setAndCoerceProperty$Ex(Lit13, Lit14, Lit15, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit13, Lit17, Lit18, Lit16);
        return C0643runtime.setAndCoerceProperty$Ex(Lit13, Lit19, Lit18, Lit16);
    }

    static Object lambda5() {
        C0643runtime.setAndCoerceProperty$Ex(Lit13, Lit14, Lit15, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit13, Lit17, Lit18, Lit16);
        return C0643runtime.setAndCoerceProperty$Ex(Lit13, Lit19, Lit18, Lit16);
    }

    static Object lambda6() {
        C0643runtime.setAndCoerceProperty$Ex(Lit22, Lit23, Lit24, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit22, Lit25, Lit26, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit22, Lit14, Lit27, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit22, Lit17, Lit28, Lit16);
        return C0643runtime.setAndCoerceProperty$Ex(Lit22, Lit19, Lit18, Lit16);
    }

    static Object lambda7() {
        C0643runtime.setAndCoerceProperty$Ex(Lit22, Lit23, Lit24, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit22, Lit25, Lit26, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit22, Lit14, Lit27, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit22, Lit17, Lit28, Lit16);
        return C0643runtime.setAndCoerceProperty$Ex(Lit22, Lit19, Lit18, Lit16);
    }

    static Object lambda8() {
        C0643runtime.setAndCoerceProperty$Ex(Lit31, Lit32, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit31, Lit33, Lit34, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit31, Lit35, "Food Time", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit31, Lit36, Lit37, Lit16);
    }

    static Object lambda9() {
        C0643runtime.setAndCoerceProperty$Ex(Lit31, Lit32, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit31, Lit33, Lit34, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit31, Lit35, "Food Time", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit31, Lit36, Lit37, Lit16);
    }

    static Object lambda10() {
        C0643runtime.setAndCoerceProperty$Ex(Lit40, Lit23, Lit24, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit40, Lit25, Lit26, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit40, Lit14, Lit41, Lit16);
        return C0643runtime.setAndCoerceProperty$Ex(Lit40, Lit19, Lit18, Lit16);
    }

    static Object lambda11() {
        C0643runtime.setAndCoerceProperty$Ex(Lit40, Lit23, Lit24, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit40, Lit25, Lit26, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit40, Lit14, Lit41, Lit16);
        return C0643runtime.setAndCoerceProperty$Ex(Lit40, Lit19, Lit18, Lit16);
    }

    static Object lambda12() {
        C0643runtime.setAndCoerceProperty$Ex(Lit44, Lit14, Lit45, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit44, Lit33, Lit46, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit44, Lit47, Lit24, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit44, Lit48, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit44, Lit35, "LOGIN", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit44, Lit36, Lit49, Lit16);
    }

    static Object lambda13() {
        C0643runtime.setAndCoerceProperty$Ex(Lit44, Lit14, Lit45, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit44, Lit33, Lit46, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit44, Lit47, Lit24, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit44, Lit48, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit44, Lit35, "LOGIN", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit44, Lit36, Lit49, Lit16);
    }

    static Object lambda14() {
        C0643runtime.setAndCoerceProperty$Ex(Lit52, Lit23, Lit24, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit52, Lit25, Lit26, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit52, Lit14, Lit53, Lit16);
        return C0643runtime.setAndCoerceProperty$Ex(Lit52, Lit19, Lit18, Lit16);
    }

    static Object lambda15() {
        C0643runtime.setAndCoerceProperty$Ex(Lit52, Lit23, Lit24, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit52, Lit25, Lit26, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit52, Lit14, Lit53, Lit16);
        return C0643runtime.setAndCoerceProperty$Ex(Lit52, Lit19, Lit18, Lit16);
    }

    static Object lambda16() {
        C0643runtime.setAndCoerceProperty$Ex(Lit56, Lit14, Lit57, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit56, Lit35, "Username", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit56, Lit36, Lit58, Lit16);
    }

    static Object lambda17() {
        C0643runtime.setAndCoerceProperty$Ex(Lit56, Lit14, Lit57, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit56, Lit35, "Username", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit56, Lit36, Lit58, Lit16);
    }

    static Object lambda18() {
        C0643runtime.setAndCoerceProperty$Ex(Lit64, Lit23, Lit24, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit64, Lit25, Lit26, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit64, Lit14, Lit65, Lit16);
        return C0643runtime.setAndCoerceProperty$Ex(Lit64, Lit19, Lit18, Lit16);
    }

    static Object lambda19() {
        C0643runtime.setAndCoerceProperty$Ex(Lit64, Lit23, Lit24, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit64, Lit25, Lit26, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit64, Lit14, Lit65, Lit16);
        return C0643runtime.setAndCoerceProperty$Ex(Lit64, Lit19, Lit18, Lit16);
    }

    static Object lambda20() {
        C0643runtime.setAndCoerceProperty$Ex(Lit68, Lit14, Lit69, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit68, Lit35, "Password", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit68, Lit36, Lit70, Lit16);
    }

    static Object lambda21() {
        C0643runtime.setAndCoerceProperty$Ex(Lit68, Lit14, Lit69, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit68, Lit35, "Password", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit68, Lit36, Lit70, Lit16);
    }

    static Object lambda22() {
        C0643runtime.setAndCoerceProperty$Ex(Lit76, Lit23, Lit24, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit76, Lit25, Lit26, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit76, Lit14, Lit77, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit76, Lit78, Boolean.FALSE, Lit6);
        return C0643runtime.setAndCoerceProperty$Ex(Lit76, Lit19, Lit18, Lit16);
    }

    static Object lambda23() {
        C0643runtime.setAndCoerceProperty$Ex(Lit76, Lit23, Lit24, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit76, Lit25, Lit26, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit76, Lit14, Lit77, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit76, Lit78, Boolean.FALSE, Lit6);
        return C0643runtime.setAndCoerceProperty$Ex(Lit76, Lit19, Lit18, Lit16);
    }

    static Object lambda24() {
        C0643runtime.setAndCoerceProperty$Ex(Lit81, Lit14, Lit82, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit81, Lit32, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit81, Lit83, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit81, Lit33, Lit46, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit81, Lit47, Lit24, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit81, Lit48, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit81, Lit35, "Invalid password", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit81, Lit36, Lit84, Lit16);
    }

    static Object lambda25() {
        C0643runtime.setAndCoerceProperty$Ex(Lit81, Lit14, Lit82, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit81, Lit32, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit81, Lit83, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit81, Lit33, Lit46, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit81, Lit47, Lit24, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit81, Lit48, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit81, Lit35, "Invalid password", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit81, Lit36, Lit84, Lit16);
    }

    static Object lambda26() {
        C0643runtime.setAndCoerceProperty$Ex(Lit87, Lit23, Lit24, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit87, Lit25, Lit26, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit87, Lit14, Lit88, Lit16);
        return C0643runtime.setAndCoerceProperty$Ex(Lit87, Lit19, Lit18, Lit16);
    }

    static Object lambda27() {
        C0643runtime.setAndCoerceProperty$Ex(Lit87, Lit23, Lit24, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit87, Lit25, Lit26, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit87, Lit14, Lit88, Lit16);
        return C0643runtime.setAndCoerceProperty$Ex(Lit87, Lit19, Lit18, Lit16);
    }

    static Object lambda28() {
        C0643runtime.setAndCoerceProperty$Ex(Lit91, Lit23, Lit24, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit91, Lit14, Lit92, Lit16);
        return C0643runtime.setAndCoerceProperty$Ex(Lit91, Lit19, Lit18, Lit16);
    }

    static Object lambda29() {
        C0643runtime.setAndCoerceProperty$Ex(Lit91, Lit23, Lit24, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit91, Lit14, Lit92, Lit16);
        return C0643runtime.setAndCoerceProperty$Ex(Lit91, Lit19, Lit18, Lit16);
    }

    static Object lambda30() {
        C0643runtime.setAndCoerceProperty$Ex(Lit95, Lit14, Lit96, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit95, Lit97, Lit98, Lit16);
        return C0643runtime.setAndCoerceProperty$Ex(Lit95, Lit35, "Login", Lit4);
    }

    static Object lambda31() {
        C0643runtime.setAndCoerceProperty$Ex(Lit95, Lit14, Lit96, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit95, Lit97, Lit98, Lit16);
        return C0643runtime.setAndCoerceProperty$Ex(Lit95, Lit35, "Login", Lit4);
    }

    public Object Button1$Click() {
        C0643runtime.setThisForm();
        if (C0643runtime.processAndDelayed$V(new Object[]{lambda$Fn31, lambda$Fn32}) != Boolean.FALSE) {
            C0643runtime.callYailPrimitive(C0643runtime.open$Mnanother$Mnscreen, LList.list1("Home"), Lit102, "open another screen");
        } else {
            C0643runtime.setAndCoerceProperty$Ex(Lit76, Lit78, Boolean.TRUE, Lit6);
        }
        return C0643runtime.setAndCoerceProperty$Ex(Lit76, Lit78, Boolean.FALSE, Lit6);
    }

    static Object lambda32() {
        return C0643runtime.callYailPrimitive(strings.string$Eq$Qu, LList.list2(C0643runtime.get$Mnproperty.apply2(Lit61, Lit35), "guest"), Lit100, "text=");
    }

    static Object lambda33() {
        return C0643runtime.callYailPrimitive(strings.string$Eq$Qu, LList.list2(C0643runtime.get$Mnproperty.apply2(Lit73, Lit35), "Pass"), Lit101, "text=");
    }

    static Object lambda34() {
        C0643runtime.setAndCoerceProperty$Ex(Lit106, Lit23, Lit24, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit106, Lit14, Lit107, Lit16);
        return C0643runtime.setAndCoerceProperty$Ex(Lit106, Lit19, Lit18, Lit16);
    }

    static Object lambda35() {
        C0643runtime.setAndCoerceProperty$Ex(Lit106, Lit23, Lit24, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit106, Lit14, Lit107, Lit16);
        return C0643runtime.setAndCoerceProperty$Ex(Lit106, Lit19, Lit18, Lit16);
    }

    static Object lambda36() {
        C0643runtime.setAndCoerceProperty$Ex(Lit110, Lit14, Lit111, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit110, Lit97, Lit98, Lit16);
        return C0643runtime.setAndCoerceProperty$Ex(Lit110, Lit35, "New User", Lit4);
    }

    static Object lambda37() {
        C0643runtime.setAndCoerceProperty$Ex(Lit110, Lit14, Lit111, Lit16);
        C0643runtime.setAndCoerceProperty$Ex(Lit110, Lit97, Lit98, Lit16);
        return C0643runtime.setAndCoerceProperty$Ex(Lit110, Lit35, "New User", Lit4);
    }

    public Object Button2$Click() {
        C0643runtime.setThisForm();
        C0643runtime.setAndCoerceProperty$Ex(Lit61, Lit35, "", Lit4);
        C0643runtime.setAndCoerceProperty$Ex(Lit73, Lit35, "", Lit4);
        return C0643runtime.callYailPrimitive(C0643runtime.open$Mnanother$Mnscreen, LList.list1("New_User"), Lit113, "open another screen");
    }

    /* compiled from: Screen1.yail */
    public class frame extends ModuleBody {
        Screen1 $main;

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 1:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 1;
                    return 0;
                case 2:
                    if (!(obj instanceof Screen1)) {
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
                    if (!(obj instanceof Screen1)) {
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
                    if (!(obj instanceof Screen1)) {
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
                    if (!(obj instanceof Screen1)) {
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
                    Screen1 screen1 = this.$main;
                    try {
                        Component component = (Component) obj;
                        try {
                            String str = (String) obj2;
                            try {
                                if (obj3 == Boolean.FALSE) {
                                    z = false;
                                }
                                try {
                                    screen1.dispatchGenericEvent(component, str, z, (Object[]) obj4);
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
                    return Screen1.lambda2();
                case 19:
                    this.$main.$define();
                    return Values.empty;
                case 20:
                    return Screen1.lambda3();
                case 21:
                    return this.$main.Screen1$BackPressed();
                case 22:
                    return Screen1.lambda4();
                case 23:
                    return Screen1.lambda5();
                case 24:
                    return Screen1.lambda6();
                case 25:
                    return Screen1.lambda7();
                case 26:
                    return Screen1.lambda8();
                case 27:
                    return Screen1.lambda9();
                case 28:
                    return Screen1.lambda10();
                case 29:
                    return Screen1.lambda11();
                case 30:
                    return Screen1.lambda12();
                case 31:
                    return Screen1.lambda13();
                case 32:
                    return Screen1.lambda14();
                case 33:
                    return Screen1.lambda15();
                case 34:
                    return Screen1.lambda16();
                case 35:
                    return Screen1.lambda17();
                case 36:
                    return Screen1.lambda18();
                case 37:
                    return Screen1.lambda19();
                case 38:
                    return Screen1.lambda20();
                case 39:
                    return Screen1.lambda21();
                case 40:
                    return Screen1.lambda22();
                case 41:
                    return Screen1.lambda23();
                case 42:
                    return Screen1.lambda24();
                case 43:
                    return Screen1.lambda25();
                case 44:
                    return Screen1.lambda26();
                case 45:
                    return Screen1.lambda27();
                case 46:
                    return Screen1.lambda28();
                case 47:
                    return Screen1.lambda29();
                case 48:
                    return Screen1.lambda30();
                case 49:
                    return Screen1.lambda31();
                case 50:
                    return Screen1.lambda32();
                case 51:
                    return Screen1.lambda33();
                case 52:
                    return this.$main.Button1$Click();
                case 53:
                    return Screen1.lambda34();
                case 54:
                    return Screen1.lambda35();
                case 55:
                    return Screen1.lambda36();
                case 56:
                    return Screen1.lambda37();
                case 57:
                    return this.$main.Button2$Click();
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
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }
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
        Screen1 = this;
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
