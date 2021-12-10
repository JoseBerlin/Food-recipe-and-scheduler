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
import kawa.standard.require;

/* compiled from: Home.yail */
public class Home extends Form implements Runnable {
    public static Home Home;
    static final SimpleSymbol Lit0 = ((SimpleSymbol) new SimpleSymbol("Home").readResolve());
    static final SimpleSymbol Lit1 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final SimpleSymbol Lit10 = ((SimpleSymbol) new SimpleSymbol("VerticalScrollArrangement1").readResolve());
    static final IntNum Lit100;
    static final FString Lit101 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit102;
    static final SimpleSymbol Lit103 = ((SimpleSymbol) new SimpleSymbol("Button2$Click").readResolve());
    static final SimpleSymbol Lit104 = ((SimpleSymbol) new SimpleSymbol("get-simple-name").readResolve());
    static final SimpleSymbol Lit105 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final SimpleSymbol Lit106 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final SimpleSymbol Lit107 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final SimpleSymbol Lit108 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit109 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit11 = ((SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve());
    static final SimpleSymbol Lit110 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final SimpleSymbol Lit111 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final SimpleSymbol Lit112 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit113 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit114 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final SimpleSymbol Lit115 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final SimpleSymbol Lit116 = ((SimpleSymbol) new SimpleSymbol("dispatchGenericEvent").readResolve());
    static final SimpleSymbol Lit117 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final IntNum Lit12 = IntNum.make(3);
    static final SimpleSymbol Lit13 = ((SimpleSymbol) new SimpleSymbol("number").readResolve());
    static final SimpleSymbol Lit14 = ((SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve());
    static final IntNum Lit15;
    static final SimpleSymbol Lit16 = ((SimpleSymbol) new SimpleSymbol("Width").readResolve());
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
    static final FString Lit27 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit28 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement9").readResolve());
    static final FString Lit29 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit3 = ((SimpleSymbol) new SimpleSymbol("AppName").readResolve());
    static final FString Lit30 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit31 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement13").readResolve());
    static final FString Lit32 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit33 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit34 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement10").readResolve());
    static final FString Lit35 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit36 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit37 = ((SimpleSymbol) new SimpleSymbol("Label6").readResolve());
    static final IntNum Lit38;
    static final SimpleSymbol Lit39 = ((SimpleSymbol) new SimpleSymbol("FontBold").readResolve());
    static final SimpleSymbol Lit4;
    static final SimpleSymbol Lit40 = ((SimpleSymbol) new SimpleSymbol("FontSize").readResolve());
    static final DFloNum Lit41 = DFloNum.make((double) 24);
    static final SimpleSymbol Lit42 = ((SimpleSymbol) new SimpleSymbol("Text").readResolve());
    static final FString Lit43 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit44 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit45 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement11").readResolve());
    static final FString Lit46 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit47 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit48 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement12").readResolve());
    static final FString Lit49 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit5 = ((SimpleSymbol) new SimpleSymbol("ShowListsAsJson").readResolve());
    static final FString Lit50 = new FString("com.google.appinventor.components.runtime.Image");
    static final SimpleSymbol Lit51 = ((SimpleSymbol) new SimpleSymbol("Image6").readResolve());
    static final SimpleSymbol Lit52 = ((SimpleSymbol) new SimpleSymbol("Clickable").readResolve());
    static final IntNum Lit53 = IntNum.make(-1007);
    static final SimpleSymbol Lit54 = ((SimpleSymbol) new SimpleSymbol("Picture").readResolve());
    static final IntNum Lit55 = IntNum.make(-1012);
    static final FString Lit56 = new FString("com.google.appinventor.components.runtime.Image");
    static final PairWithPosition Lit57 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/Home.yail", 385102);
    static final SimpleSymbol Lit58 = ((SimpleSymbol) new SimpleSymbol("Image6$Click").readResolve());
    static final SimpleSymbol Lit59 = ((SimpleSymbol) new SimpleSymbol("Click").readResolve());
    static final SimpleSymbol Lit6 = ((SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve());
    static final FString Lit60 = new FString("com.google.appinventor.components.runtime.Image");
    static final SimpleSymbol Lit61 = ((SimpleSymbol) new SimpleSymbol("Image1").readResolve());
    static final SimpleSymbol Lit62 = ((SimpleSymbol) new SimpleSymbol("AlternateText").readResolve());
    static final IntNum Lit63 = IntNum.make(150);
    static final SimpleSymbol Lit64 = ((SimpleSymbol) new SimpleSymbol("ScalePictureToFit").readResolve());
    static final IntNum Lit65 = IntNum.make(300);
    static final FString Lit66 = new FString("com.google.appinventor.components.runtime.Image");
    static final PairWithPosition Lit67 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/Home.yail", 462928);
    static final SimpleSymbol Lit68 = ((SimpleSymbol) new SimpleSymbol("Image1$Click").readResolve());
    static final FString Lit69 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit7 = ((SimpleSymbol) new SimpleSymbol("Sizing").readResolve());
    static final SimpleSymbol Lit70 = ((SimpleSymbol) new SimpleSymbol("Label1").readResolve());
    static final SimpleSymbol Lit71 = ((SimpleSymbol) new SimpleSymbol("TextColor").readResolve());
    static final IntNum Lit72;
    static final FString Lit73 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit74 = new FString("com.google.appinventor.components.runtime.Image");
    static final SimpleSymbol Lit75 = ((SimpleSymbol) new SimpleSymbol("Image2").readResolve());
    static final FString Lit76 = new FString("com.google.appinventor.components.runtime.Image");
    static final PairWithPosition Lit77 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/Home.yail", 577612);
    static final SimpleSymbol Lit78 = ((SimpleSymbol) new SimpleSymbol("Image2$Click").readResolve());
    static final FString Lit79 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit8 = ((SimpleSymbol) new SimpleSymbol("Title").readResolve());
    static final SimpleSymbol Lit80 = ((SimpleSymbol) new SimpleSymbol("Label2").readResolve());
    static final IntNum Lit81;
    static final FString Lit82 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit83 = new FString("com.google.appinventor.components.runtime.Image");
    static final SimpleSymbol Lit84 = ((SimpleSymbol) new SimpleSymbol("Image3").readResolve());
    static final FString Lit85 = new FString("com.google.appinventor.components.runtime.Image");
    static final PairWithPosition Lit86 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/Home.yail", 692301);
    static final SimpleSymbol Lit87 = ((SimpleSymbol) new SimpleSymbol("Image3$Click").readResolve());
    static final FString Lit88 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit89 = ((SimpleSymbol) new SimpleSymbol("Label3").readResolve());
    static final FString Lit9 = new FString("com.google.appinventor.components.runtime.VerticalScrollArrangement");
    static final IntNum Lit90;
    static final FString Lit91 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit92 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit93 = ((SimpleSymbol) new SimpleSymbol("Button1").readResolve());
    static final IntNum Lit94;
    static final FString Lit95 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit96 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/Home.yail", 774231);
    static final SimpleSymbol Lit97 = ((SimpleSymbol) new SimpleSymbol("Button1$Click").readResolve());
    static final FString Lit98 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit99 = ((SimpleSymbol) new SimpleSymbol("Button2").readResolve());
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
    static final ModuleMethod lambda$Fn3 = null;
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
    public HorizontalArrangement HorizontalArrangement10;
    public HorizontalArrangement HorizontalArrangement11;
    public HorizontalArrangement HorizontalArrangement12;
    public HorizontalArrangement HorizontalArrangement13;
    public HorizontalArrangement HorizontalArrangement8;
    public HorizontalArrangement HorizontalArrangement9;
    public Image Image1;
    public final ModuleMethod Image1$Click;
    public Image Image2;
    public final ModuleMethod Image2$Click;
    public Image Image3;
    public final ModuleMethod Image3$Click;
    public Image Image6;
    public final ModuleMethod Image6$Click;
    public Label Label1;
    public Label Label2;
    public Label Label3;
    public Label Label6;
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
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit4 = simpleSymbol;
        Lit102 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/Home.yail", 819284);
        int[] iArr = new int[2];
        iArr[0] = -1;
        Lit100 = IntNum.make(iArr);
        int[] iArr2 = new int[2];
        iArr2[0] = -1;
        Lit94 = IntNum.make(iArr2);
        int[] iArr3 = new int[2];
        iArr3[0] = -1;
        Lit90 = IntNum.make(iArr3);
        int[] iArr4 = new int[2];
        iArr4[0] = -1;
        Lit81 = IntNum.make(iArr4);
        int[] iArr5 = new int[2];
        iArr5[0] = -1;
        Lit72 = IntNum.make(iArr5);
        int[] iArr6 = new int[2];
        iArr6[0] = -65536;
        Lit38 = IntNum.make(iArr6);
        int[] iArr7 = new int[2];
        iArr7[0] = -16777216;
        Lit23 = IntNum.make(iArr7);
        int[] iArr8 = new int[2];
        iArr8[0] = -16777216;
        Lit15 = IntNum.make(iArr8);
    }

    public Home() {
        ModuleInfo.register(this);
        frame frame2 = new frame();
        frame2.$main = this;
        this.get$Mnsimple$Mnname = new ModuleMethod(frame2, 1, Lit104, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.onCreate = new ModuleMethod(frame2, 2, "onCreate", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frame2, 3, Lit105, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frame2, 4, Lit106, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 5, Lit107, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 7, Lit108, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frame2, 8, Lit109, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frame2, 9, Lit110, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frame2, 10, Lit111, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frame2, 11, Lit112, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frame2, 12, Lit113, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frame2, 13, Lit114, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frame2, 14, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frame2, 15, Lit115, 16388);
        this.dispatchGenericEvent = new ModuleMethod(frame2, 16, Lit116, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frame2, 17, Lit117, 8194);
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
        lambda$Fn9 = new ModuleMethod(frame2, 27, (Object) null, 0);
        lambda$Fn10 = new ModuleMethod(frame2, 28, (Object) null, 0);
        this.Image6$Click = new ModuleMethod(frame2, 29, Lit58, 0);
        lambda$Fn11 = new ModuleMethod(frame2, 30, (Object) null, 0);
        lambda$Fn12 = new ModuleMethod(frame2, 31, (Object) null, 0);
        this.Image1$Click = new ModuleMethod(frame2, 32, Lit68, 0);
        lambda$Fn13 = new ModuleMethod(frame2, 33, (Object) null, 0);
        lambda$Fn14 = new ModuleMethod(frame2, 34, (Object) null, 0);
        lambda$Fn15 = new ModuleMethod(frame2, 35, (Object) null, 0);
        lambda$Fn16 = new ModuleMethod(frame2, 36, (Object) null, 0);
        this.Image2$Click = new ModuleMethod(frame2, 37, Lit78, 0);
        lambda$Fn17 = new ModuleMethod(frame2, 38, (Object) null, 0);
        lambda$Fn18 = new ModuleMethod(frame2, 39, (Object) null, 0);
        lambda$Fn19 = new ModuleMethod(frame2, 40, (Object) null, 0);
        lambda$Fn20 = new ModuleMethod(frame2, 41, (Object) null, 0);
        this.Image3$Click = new ModuleMethod(frame2, 42, Lit87, 0);
        lambda$Fn21 = new ModuleMethod(frame2, 43, (Object) null, 0);
        lambda$Fn22 = new ModuleMethod(frame2, 44, (Object) null, 0);
        lambda$Fn23 = new ModuleMethod(frame2, 45, (Object) null, 0);
        lambda$Fn24 = new ModuleMethod(frame2, 46, (Object) null, 0);
        this.Button1$Click = new ModuleMethod(frame2, 47, Lit97, 0);
        lambda$Fn25 = new ModuleMethod(frame2, 48, (Object) null, 0);
        lambda$Fn26 = new ModuleMethod(frame2, 49, (Object) null, 0);
        this.Button2$Click = new ModuleMethod(frame2, 50, Lit103, 0);
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
        Object find = require.find("com.google.youngandroid.runtime");
        try {
            ((Runnable) find).run();
            this.$Stdebug$Mnform$St = Boolean.FALSE;
            this.form$Mnenvironment = Environment.make(misc.symbol$To$String(Lit0));
            FString stringAppend = strings.stringAppend(misc.symbol$To$String(Lit0), "-global-vars");
            if (stringAppend == null) {
                obj = null;
            } else {
                obj = stringAppend.toString();
            }
            this.global$Mnvar$Mnenvironment = Environment.make(obj);
            Home = null;
            this.form$Mnname$Mnsymbol = Lit0;
            this.events$Mnto$Mnregister = LList.Empty;
            this.components$Mnto$Mncreate = LList.Empty;
            this.global$Mnvars$Mnto$Mncreate = LList.Empty;
            this.form$Mndo$Mnafter$Mncreation = LList.Empty;
            Object find2 = require.find("com.google.youngandroid.runtime");
            try {
                ((Runnable) find2).run();
                if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    C0643runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "Food_recipe", Lit4);
                    C0643runtime.setAndCoerceProperty$Ex(Lit0, Lit5, Boolean.TRUE, Lit6);
                    C0643runtime.setAndCoerceProperty$Ex(Lit0, Lit7, "Responsive", Lit4);
                    Values.writeValues(C0643runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "Home", Lit4), $result);
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
                this.HorizontalArrangement9 = null;
                if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0643runtime.addComponentWithinRepl(Lit20, Lit27, Lit28, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit20, Lit29, Lit28, Boolean.FALSE);
                }
                this.HorizontalArrangement13 = null;
                if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0643runtime.addComponentWithinRepl(Lit20, Lit30, Lit31, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit20, Lit32, Lit31, Boolean.FALSE);
                }
                this.HorizontalArrangement10 = null;
                if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0643runtime.addComponentWithinRepl(Lit20, Lit33, Lit34, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit20, Lit35, Lit34, Boolean.FALSE);
                }
                this.Label6 = null;
                if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0643runtime.addComponentWithinRepl(Lit20, Lit36, Lit37, lambda$Fn7), $result);
                } else {
                    addToComponents(Lit20, Lit43, Lit37, lambda$Fn8);
                }
                this.HorizontalArrangement11 = null;
                if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0643runtime.addComponentWithinRepl(Lit20, Lit44, Lit45, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit20, Lit46, Lit45, Boolean.FALSE);
                }
                this.HorizontalArrangement12 = null;
                if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0643runtime.addComponentWithinRepl(Lit20, Lit47, Lit48, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit20, Lit49, Lit48, Boolean.FALSE);
                }
                this.Image6 = null;
                if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0643runtime.addComponentWithinRepl(Lit20, Lit50, Lit51, lambda$Fn9), $result);
                } else {
                    addToComponents(Lit20, Lit56, Lit51, lambda$Fn10);
                }
                if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    C0643runtime.addToCurrentFormEnvironment(Lit58, this.Image6$Click);
                } else {
                    addToFormEnvironment(Lit58, this.Image6$Click);
                }
                if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0643runtime.$Stthis$Mnform$St, "Image6", "Click");
                } else {
                    addToEvents(Lit51, Lit59);
                }
                this.Image1 = null;
                if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0643runtime.addComponentWithinRepl(Lit10, Lit60, Lit61, lambda$Fn11), $result);
                } else {
                    addToComponents(Lit10, Lit66, Lit61, lambda$Fn12);
                }
                if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    C0643runtime.addToCurrentFormEnvironment(Lit68, this.Image1$Click);
                } else {
                    addToFormEnvironment(Lit68, this.Image1$Click);
                }
                if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0643runtime.$Stthis$Mnform$St, "Image1", "Click");
                } else {
                    addToEvents(Lit61, Lit59);
                }
                this.Label1 = null;
                if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0643runtime.addComponentWithinRepl(Lit10, Lit69, Lit70, lambda$Fn13), $result);
                } else {
                    addToComponents(Lit10, Lit73, Lit70, lambda$Fn14);
                }
                this.Image2 = null;
                if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0643runtime.addComponentWithinRepl(Lit10, Lit74, Lit75, lambda$Fn15), $result);
                } else {
                    addToComponents(Lit10, Lit76, Lit75, lambda$Fn16);
                }
                if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    C0643runtime.addToCurrentFormEnvironment(Lit78, this.Image2$Click);
                } else {
                    addToFormEnvironment(Lit78, this.Image2$Click);
                }
                if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0643runtime.$Stthis$Mnform$St, "Image2", "Click");
                } else {
                    addToEvents(Lit75, Lit59);
                }
                this.Label2 = null;
                if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0643runtime.addComponentWithinRepl(Lit10, Lit79, Lit80, lambda$Fn17), $result);
                } else {
                    addToComponents(Lit10, Lit82, Lit80, lambda$Fn18);
                }
                this.Image3 = null;
                if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0643runtime.addComponentWithinRepl(Lit10, Lit83, Lit84, lambda$Fn19), $result);
                } else {
                    addToComponents(Lit10, Lit85, Lit84, lambda$Fn20);
                }
                if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    C0643runtime.addToCurrentFormEnvironment(Lit87, this.Image3$Click);
                } else {
                    addToFormEnvironment(Lit87, this.Image3$Click);
                }
                if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0643runtime.$Stthis$Mnform$St, "Image3", "Click");
                } else {
                    addToEvents(Lit84, Lit59);
                }
                this.Label3 = null;
                if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0643runtime.addComponentWithinRepl(Lit10, Lit88, Lit89, lambda$Fn21), $result);
                } else {
                    addToComponents(Lit10, Lit91, Lit89, lambda$Fn22);
                }
                this.Button1 = null;
                if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0643runtime.addComponentWithinRepl(Lit10, Lit92, Lit93, lambda$Fn23), $result);
                } else {
                    addToComponents(Lit10, Lit95, Lit93, lambda$Fn24);
                }
                if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    C0643runtime.addToCurrentFormEnvironment(Lit97, this.Button1$Click);
                } else {
                    addToFormEnvironment(Lit97, this.Button1$Click);
                }
                if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0643runtime.$Stthis$Mnform$St, "Button1", "Click");
                } else {
                    addToEvents(Lit93, Lit59);
                }
                this.Button2 = null;
                if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0643runtime.addComponentWithinRepl(Lit10, Lit98, Lit99, lambda$Fn25), $result);
                } else {
                    addToComponents(Lit10, Lit101, Lit99, lambda$Fn26);
                }
                if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    C0643runtime.addToCurrentFormEnvironment(Lit103, this.Button2$Click);
                } else {
                    addToFormEnvironment(Lit103, this.Button2$Click);
                }
                if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0643runtime.$Stthis$Mnform$St, "Button2", "Click");
                } else {
                    addToEvents(Lit99, Lit59);
                }
                C0643runtime.initRuntime();
            } catch (ClassCastException e) {
                throw new WrongType(e, "java.lang.Runnable.run()", 1, find2);
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "java.lang.Runnable.run()", 1, find);
        }
    }

    static Object lambda3() {
        C0643runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "Food_recipe", Lit4);
        C0643runtime.setAndCoerceProperty$Ex(Lit0, Lit5, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit0, Lit7, "Responsive", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "Home", Lit4);
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
        C0643runtime.setAndCoerceProperty$Ex(Lit37, Lit14, Lit38, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit37, Lit39, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit37, Lit40, Lit41, Lit13);
        return C0643runtime.setAndCoerceProperty$Ex(Lit37, Lit42, "Home", Lit4);
    }

    static Object lambda9() {
        C0643runtime.setAndCoerceProperty$Ex(Lit37, Lit14, Lit38, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit37, Lit39, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit37, Lit40, Lit41, Lit13);
        return C0643runtime.setAndCoerceProperty$Ex(Lit37, Lit42, "Home", Lit4);
    }

    static Object lambda10() {
        C0643runtime.setAndCoerceProperty$Ex(Lit51, Lit52, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit51, Lit24, Lit53, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit51, Lit54, "image_2021-11-25_125652.png", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit51, Lit16, Lit55, Lit13);
    }

    static Object lambda11() {
        C0643runtime.setAndCoerceProperty$Ex(Lit51, Lit52, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit51, Lit24, Lit53, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit51, Lit54, "image_2021-11-25_125652.png", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit51, Lit16, Lit55, Lit13);
    }

    public Object Image6$Click() {
        C0643runtime.setThisForm();
        return C0643runtime.callYailPrimitive(C0643runtime.open$Mnanother$Mnscreen, LList.list1("Screen1"), Lit57, "open another screen");
    }

    static Object lambda12() {
        C0643runtime.setAndCoerceProperty$Ex(Lit61, Lit62, "Can't Load the Image", Lit4);
        C0643runtime.setAndCoerceProperty$Ex(Lit61, Lit52, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit61, Lit24, Lit63, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit61, Lit54, "image_2021-11-23_121142.png", Lit4);
        C0643runtime.setAndCoerceProperty$Ex(Lit61, Lit64, Boolean.TRUE, Lit6);
        return C0643runtime.setAndCoerceProperty$Ex(Lit61, Lit16, Lit65, Lit13);
    }

    static Object lambda13() {
        C0643runtime.setAndCoerceProperty$Ex(Lit61, Lit62, "Can't Load the Image", Lit4);
        C0643runtime.setAndCoerceProperty$Ex(Lit61, Lit52, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit61, Lit24, Lit63, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit61, Lit54, "image_2021-11-23_121142.png", Lit4);
        C0643runtime.setAndCoerceProperty$Ex(Lit61, Lit64, Boolean.TRUE, Lit6);
        return C0643runtime.setAndCoerceProperty$Ex(Lit61, Lit16, Lit65, Lit13);
    }

    public Object Image1$Click() {
        C0643runtime.setThisForm();
        return C0643runtime.callYailPrimitive(C0643runtime.open$Mnanother$Mnscreen, LList.list1("Breakfast"), Lit67, "open another screen");
    }

    static Object lambda14() {
        C0643runtime.setAndCoerceProperty$Ex(Lit70, Lit42, "Breakfast", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit70, Lit71, Lit72, Lit13);
    }

    static Object lambda15() {
        C0643runtime.setAndCoerceProperty$Ex(Lit70, Lit42, "Breakfast", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit70, Lit71, Lit72, Lit13);
    }

    static Object lambda16() {
        C0643runtime.setAndCoerceProperty$Ex(Lit75, Lit62, "Can't Load the Image", Lit4);
        C0643runtime.setAndCoerceProperty$Ex(Lit75, Lit52, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit75, Lit24, Lit63, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit75, Lit54, "image_2021-11-24_122150.png", Lit4);
        C0643runtime.setAndCoerceProperty$Ex(Lit75, Lit64, Boolean.TRUE, Lit6);
        return C0643runtime.setAndCoerceProperty$Ex(Lit75, Lit16, Lit65, Lit13);
    }

    static Object lambda17() {
        C0643runtime.setAndCoerceProperty$Ex(Lit75, Lit62, "Can't Load the Image", Lit4);
        C0643runtime.setAndCoerceProperty$Ex(Lit75, Lit52, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit75, Lit24, Lit63, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit75, Lit54, "image_2021-11-24_122150.png", Lit4);
        C0643runtime.setAndCoerceProperty$Ex(Lit75, Lit64, Boolean.TRUE, Lit6);
        return C0643runtime.setAndCoerceProperty$Ex(Lit75, Lit16, Lit65, Lit13);
    }

    public Object Image2$Click() {
        C0643runtime.setThisForm();
        return C0643runtime.callYailPrimitive(C0643runtime.open$Mnanother$Mnscreen, LList.list1("Lunch"), Lit77, "open another screen");
    }

    static Object lambda18() {
        C0643runtime.setAndCoerceProperty$Ex(Lit80, Lit42, "Lunch", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit80, Lit71, Lit81, Lit13);
    }

    static Object lambda19() {
        C0643runtime.setAndCoerceProperty$Ex(Lit80, Lit42, "Lunch", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit80, Lit71, Lit81, Lit13);
    }

    static Object lambda20() {
        C0643runtime.setAndCoerceProperty$Ex(Lit84, Lit62, "Can't Load the Image", Lit4);
        C0643runtime.setAndCoerceProperty$Ex(Lit84, Lit52, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit84, Lit24, Lit63, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit84, Lit54, "image_2021-11-22_115101.png", Lit4);
        C0643runtime.setAndCoerceProperty$Ex(Lit84, Lit64, Boolean.TRUE, Lit6);
        return C0643runtime.setAndCoerceProperty$Ex(Lit84, Lit16, Lit65, Lit13);
    }

    static Object lambda21() {
        C0643runtime.setAndCoerceProperty$Ex(Lit84, Lit62, "Can't Load the Image", Lit4);
        C0643runtime.setAndCoerceProperty$Ex(Lit84, Lit52, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit84, Lit24, Lit63, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit84, Lit54, "image_2021-11-22_115101.png", Lit4);
        C0643runtime.setAndCoerceProperty$Ex(Lit84, Lit64, Boolean.TRUE, Lit6);
        return C0643runtime.setAndCoerceProperty$Ex(Lit84, Lit16, Lit65, Lit13);
    }

    public Object Image3$Click() {
        C0643runtime.setThisForm();
        return C0643runtime.callYailPrimitive(C0643runtime.open$Mnanother$Mnscreen, LList.list1("Dinner"), Lit86, "open another screen");
    }

    static Object lambda22() {
        C0643runtime.setAndCoerceProperty$Ex(Lit89, Lit42, "Dinner", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit89, Lit71, Lit90, Lit13);
    }

    static Object lambda23() {
        C0643runtime.setAndCoerceProperty$Ex(Lit89, Lit42, "Dinner", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit89, Lit71, Lit90, Lit13);
    }

    static Object lambda24() {
        C0643runtime.setAndCoerceProperty$Ex(Lit93, Lit14, Lit94, Lit13);
        return C0643runtime.setAndCoerceProperty$Ex(Lit93, Lit42, "Make a Schedule", Lit4);
    }

    static Object lambda25() {
        C0643runtime.setAndCoerceProperty$Ex(Lit93, Lit14, Lit94, Lit13);
        return C0643runtime.setAndCoerceProperty$Ex(Lit93, Lit42, "Make a Schedule", Lit4);
    }

    public Object Button1$Click() {
        C0643runtime.setThisForm();
        return C0643runtime.callYailPrimitive(C0643runtime.open$Mnanother$Mnscreen, LList.list1("Suggest_schedule"), Lit96, "open another screen");
    }

    static Object lambda26() {
        C0643runtime.setAndCoerceProperty$Ex(Lit99, Lit14, Lit100, Lit13);
        return C0643runtime.setAndCoerceProperty$Ex(Lit99, Lit42, "View Schedule", Lit4);
    }

    static Object lambda27() {
        C0643runtime.setAndCoerceProperty$Ex(Lit99, Lit14, Lit100, Lit13);
        return C0643runtime.setAndCoerceProperty$Ex(Lit99, Lit42, "View Schedule", Lit4);
    }

    public Object Button2$Click() {
        C0643runtime.setThisForm();
        return C0643runtime.callYailPrimitive(C0643runtime.open$Mnanother$Mnscreen, LList.list1("View_schedule"), Lit102, "open another screen");
    }

    /* compiled from: Home.yail */
    public class frame extends ModuleBody {
        Home $main;

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 1:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 1;
                    return 0;
                case 2:
                    if (!(obj instanceof Home)) {
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
                    if (!(obj instanceof Home)) {
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
                    if (!(obj instanceof Home)) {
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
                    if (!(obj instanceof Home)) {
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
                    Home home = this.$main;
                    try {
                        Component component = (Component) obj;
                        try {
                            String str = (String) obj2;
                            try {
                                if (obj3 == Boolean.FALSE) {
                                    z = false;
                                }
                                try {
                                    home.dispatchGenericEvent(component, str, z, (Object[]) obj4);
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
                    return Home.lambda2();
                case 19:
                    this.$main.$define();
                    return Values.empty;
                case 20:
                    return Home.lambda3();
                case 21:
                    return Home.lambda4();
                case 22:
                    return Home.lambda5();
                case 23:
                    return Home.lambda6();
                case 24:
                    return Home.lambda7();
                case 25:
                    return Home.lambda8();
                case 26:
                    return Home.lambda9();
                case 27:
                    return Home.lambda10();
                case 28:
                    return Home.lambda11();
                case 29:
                    return this.$main.Image6$Click();
                case 30:
                    return Home.lambda12();
                case 31:
                    return Home.lambda13();
                case 32:
                    return this.$main.Image1$Click();
                case 33:
                    return Home.lambda14();
                case 34:
                    return Home.lambda15();
                case 35:
                    return Home.lambda16();
                case 36:
                    return Home.lambda17();
                case 37:
                    return this.$main.Image2$Click();
                case 38:
                    return Home.lambda18();
                case 39:
                    return Home.lambda19();
                case 40:
                    return Home.lambda20();
                case 41:
                    return Home.lambda21();
                case 42:
                    return this.$main.Image3$Click();
                case 43:
                    return Home.lambda22();
                case 44:
                    return Home.lambda23();
                case 45:
                    return Home.lambda24();
                case 46:
                    return Home.lambda25();
                case 47:
                    return this.$main.Button1$Click();
                case 48:
                    return Home.lambda26();
                case 49:
                    return Home.lambda27();
                case 50:
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
        Home = this;
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
