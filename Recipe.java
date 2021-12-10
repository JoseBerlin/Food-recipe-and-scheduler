package appinventor.ai_anon2042442813087.Food_recipe_checkpoint_final;

import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.AppInventorCompatActivity;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.HorizontalScrollArrangement;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.ListView;
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

/* compiled from: Recipe.yail */
public class Recipe extends Form implements Runnable {
    static final SimpleSymbol Lit0 = ((SimpleSymbol) new SimpleSymbol("Recipe").readResolve());
    static final SimpleSymbol Lit1 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final SimpleSymbol Lit10 = ((SimpleSymbol) new SimpleSymbol("VerticalScrollArrangement1").readResolve());
    static final SimpleSymbol Lit100 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit101 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final SimpleSymbol Lit102 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final SimpleSymbol Lit103 = ((SimpleSymbol) new SimpleSymbol("dispatchGenericEvent").readResolve());
    static final SimpleSymbol Lit104 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final SimpleSymbol Lit11 = ((SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve());
    static final IntNum Lit12 = IntNum.make(3);
    static final SimpleSymbol Lit13 = ((SimpleSymbol) new SimpleSymbol("number").readResolve());
    static final SimpleSymbol Lit14 = ((SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve());
    static final IntNum Lit15;
    static final SimpleSymbol Lit16 = ((SimpleSymbol) new SimpleSymbol("Height").readResolve());
    static final IntNum Lit17 = IntNum.make(-2);
    static final SimpleSymbol Lit18 = ((SimpleSymbol) new SimpleSymbol("Width").readResolve());
    static final FString Lit19 = new FString("com.google.appinventor.components.runtime.VerticalScrollArrangement");
    static final SimpleSymbol Lit2 = ((SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve());
    static final FString Lit20 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit21 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement8").readResolve());
    static final SimpleSymbol Lit22 = ((SimpleSymbol) new SimpleSymbol("AlignVertical").readResolve());
    static final IntNum Lit23 = IntNum.make(2);
    static final IntNum Lit24;
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
    static final PairWithPosition Lit34 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/Recipe.yail", 237643);
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
    static final PairWithPosition Lit63;
    static final SimpleSymbol Lit64 = ((SimpleSymbol) new SimpleSymbol("Image6$Click").readResolve());
    static final FString Lit65 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit66 = ((SimpleSymbol) new SimpleSymbol("Label7").readResolve());
    static final DFloNum Lit67 = DFloNum.make((double) 24);
    static final IntNum Lit68;
    static final FString Lit69 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit7 = ((SimpleSymbol) new SimpleSymbol("Sizing").readResolve());
    static final FString Lit70 = new FString("com.google.appinventor.components.runtime.Image");
    static final SimpleSymbol Lit71 = ((SimpleSymbol) new SimpleSymbol("Image8").readResolve());
    static final IntNum Lit72 = IntNum.make(-1030);
    static final IntNum Lit73 = IntNum.make(-1090);
    static final FString Lit74 = new FString("com.google.appinventor.components.runtime.Image");
    static final FString Lit75 = new FString("com.google.appinventor.components.runtime.HorizontalScrollArrangement");
    static final SimpleSymbol Lit76 = ((SimpleSymbol) new SimpleSymbol("HorizontalScrollArrangement1").readResolve());
    static final IntNum Lit77;
    static final FString Lit78 = new FString("com.google.appinventor.components.runtime.HorizontalScrollArrangement");
    static final FString Lit79 = new FString("com.google.appinventor.components.runtime.ListView");
    static final SimpleSymbol Lit8 = ((SimpleSymbol) new SimpleSymbol("Title").readResolve());
    static final SimpleSymbol Lit80 = ((SimpleSymbol) new SimpleSymbol("ListView1").readResolve());
    static final SimpleSymbol Lit81 = ((SimpleSymbol) new SimpleSymbol("ListData").readResolve());
    static final SimpleSymbol Lit82 = ((SimpleSymbol) new SimpleSymbol("SelectionColor").readResolve());
    static final IntNum Lit83;
    static final SimpleSymbol Lit84 = ((SimpleSymbol) new SimpleSymbol("TextSize").readResolve());
    static final IntNum Lit85 = IntNum.make(14);
    static final FString Lit86 = new FString("com.google.appinventor.components.runtime.ListView");
    static final FString Lit87 = new FString("com.google.appinventor.components.runtime.ListView");
    static final SimpleSymbol Lit88 = ((SimpleSymbol) new SimpleSymbol("ListView2").readResolve());
    static final IntNum Lit89;
    static final FString Lit9 = new FString("com.google.appinventor.components.runtime.VerticalScrollArrangement");
    static final FString Lit90 = new FString("com.google.appinventor.components.runtime.ListView");
    static final SimpleSymbol Lit91 = ((SimpleSymbol) new SimpleSymbol("get-simple-name").readResolve());
    static final SimpleSymbol Lit92 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final SimpleSymbol Lit93 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final SimpleSymbol Lit94 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final SimpleSymbol Lit95 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit96 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit97 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final SimpleSymbol Lit98 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final SimpleSymbol Lit99 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    public static Recipe Recipe;
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
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public HorizontalArrangement HorizontalArrangement10;
    public HorizontalArrangement HorizontalArrangement11;
    public HorizontalArrangement HorizontalArrangement12;
    public HorizontalArrangement HorizontalArrangement8;
    public HorizontalArrangement HorizontalArrangement9;
    public HorizontalScrollArrangement HorizontalScrollArrangement1;
    public Image Image6;
    public final ModuleMethod Image6$Click;
    public Image Image7;
    public final ModuleMethod Image7$Click;
    public Image Image8;
    public Label Label6;
    public Label Label7;
    public ListView ListView1;
    public ListView ListView2;
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
        iArr[0] = -65536;
        Lit89 = IntNum.make(iArr);
        int[] iArr2 = new int[2];
        iArr2[0] = -65536;
        Lit83 = IntNum.make(iArr2);
        int[] iArr3 = new int[2];
        iArr3[0] = -16777216;
        Lit77 = IntNum.make(iArr3);
        int[] iArr4 = new int[2];
        iArr4[0] = -65536;
        Lit68 = IntNum.make(iArr4);
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit4 = simpleSymbol;
        Lit63 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/Recipe.yail", 434254);
        int[] iArr5 = new int[2];
        iArr5[0] = -65536;
        Lit50 = IntNum.make(iArr5);
        int[] iArr6 = new int[2];
        iArr6[0] = -16777216;
        Lit24 = IntNum.make(iArr6);
        int[] iArr7 = new int[2];
        iArr7[0] = -16777216;
        Lit15 = IntNum.make(iArr7);
    }

    public Recipe() {
        ModuleInfo.register(this);
        frame frame2 = new frame();
        frame2.$main = this;
        this.get$Mnsimple$Mnname = new ModuleMethod(frame2, 1, Lit91, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.onCreate = new ModuleMethod(frame2, 2, "onCreate", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frame2, 3, Lit92, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frame2, 4, Lit93, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 5, Lit94, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 7, Lit95, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frame2, 8, Lit96, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frame2, 9, Lit97, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frame2, 10, Lit98, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frame2, 11, Lit99, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frame2, 12, Lit100, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frame2, 13, Lit101, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frame2, 14, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frame2, 15, Lit102, 16388);
        this.dispatchGenericEvent = new ModuleMethod(frame2, 16, Lit103, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frame2, 17, Lit104, 8194);
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
        lambda$Fn15 = new ModuleMethod(frame2, 35, (Object) null, 0);
        lambda$Fn16 = new ModuleMethod(frame2, 36, (Object) null, 0);
        lambda$Fn17 = new ModuleMethod(frame2, 37, (Object) null, 0);
        lambda$Fn18 = new ModuleMethod(frame2, 38, (Object) null, 0);
        lambda$Fn19 = new ModuleMethod(frame2, 39, (Object) null, 0);
        lambda$Fn20 = new ModuleMethod(frame2, 40, (Object) null, 0);
        lambda$Fn21 = new ModuleMethod(frame2, 41, (Object) null, 0);
        lambda$Fn22 = new ModuleMethod(frame2, 42, (Object) null, 0);
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
        Recipe = null;
        this.form$Mnname$Mnsymbol = Lit0;
        this.events$Mnto$Mnregister = LList.Empty;
        this.components$Mnto$Mncreate = LList.Empty;
        this.global$Mnvars$Mnto$Mncreate = LList.Empty;
        this.form$Mndo$Mnafter$Mncreation = LList.Empty;
        C0643runtime.$instance.run();
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0643runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "Food_recipe_checkpoint_final", Lit4);
            C0643runtime.setAndCoerceProperty$Ex(Lit0, Lit5, Boolean.TRUE, Lit6);
            C0643runtime.setAndCoerceProperty$Ex(Lit0, Lit7, "Responsive", Lit4);
            Values.writeValues(C0643runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "Recipe", Lit4), $result);
        } else {
            addToFormDoAfterCreation(new Promise(lambda$Fn2));
        }
        this.VerticalScrollArrangement1 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit0, Lit9, Lit10, lambda$Fn3), $result);
        } else {
            addToComponents(Lit0, Lit19, Lit10, lambda$Fn4);
        }
        this.HorizontalArrangement8 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit10, Lit20, Lit21, lambda$Fn5), $result);
        } else {
            addToComponents(Lit10, Lit26, Lit21, lambda$Fn6);
        }
        this.Image7 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit21, Lit27, Lit28, lambda$Fn7), $result);
        } else {
            addToComponents(Lit21, Lit33, Lit28, lambda$Fn8);
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
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit21, Lit37, Lit38, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit21, Lit39, Lit38, Boolean.FALSE);
        }
        this.HorizontalArrangement10 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit21, Lit40, Lit41, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit21, Lit42, Lit41, Boolean.FALSE);
        }
        this.Label6 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit21, Lit43, Lit44, lambda$Fn9), $result);
        } else {
            addToComponents(Lit21, Lit51, Lit44, lambda$Fn10);
        }
        this.HorizontalArrangement11 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit21, Lit52, Lit53, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit21, Lit54, Lit53, Boolean.FALSE);
        }
        this.HorizontalArrangement12 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit21, Lit55, Lit56, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit21, Lit57, Lit56, Boolean.FALSE);
        }
        this.Image6 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit21, Lit58, Lit59, lambda$Fn11), $result);
        } else {
            addToComponents(Lit21, Lit62, Lit59, lambda$Fn12);
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
        this.Label7 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit10, Lit65, Lit66, lambda$Fn13), $result);
        } else {
            addToComponents(Lit10, Lit69, Lit66, lambda$Fn14);
        }
        this.Image8 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit10, Lit70, Lit71, lambda$Fn15), $result);
        } else {
            addToComponents(Lit10, Lit74, Lit71, lambda$Fn16);
        }
        this.HorizontalScrollArrangement1 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit10, Lit75, Lit76, lambda$Fn17), $result);
        } else {
            addToComponents(Lit10, Lit78, Lit76, lambda$Fn18);
        }
        this.ListView1 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit76, Lit79, Lit80, lambda$Fn19), $result);
        } else {
            addToComponents(Lit76, Lit86, Lit80, lambda$Fn20);
        }
        this.ListView2 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit10, Lit87, Lit88, lambda$Fn21), $result);
        } else {
            addToComponents(Lit10, Lit90, Lit88, lambda$Fn22);
        }
        C0643runtime.initRuntime();
    }

    static Object lambda3() {
        C0643runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "Food_recipe_checkpoint_final", Lit4);
        C0643runtime.setAndCoerceProperty$Ex(Lit0, Lit5, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit0, Lit7, "Responsive", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "Recipe", Lit4);
    }

    static Object lambda4() {
        C0643runtime.setAndCoerceProperty$Ex(Lit10, Lit11, Lit12, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit10, Lit14, Lit15, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit10, Lit16, Lit17, Lit13);
        return C0643runtime.setAndCoerceProperty$Ex(Lit10, Lit18, Lit17, Lit13);
    }

    static Object lambda5() {
        C0643runtime.setAndCoerceProperty$Ex(Lit10, Lit11, Lit12, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit10, Lit14, Lit15, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit10, Lit16, Lit17, Lit13);
        return C0643runtime.setAndCoerceProperty$Ex(Lit10, Lit18, Lit17, Lit13);
    }

    static Object lambda6() {
        C0643runtime.setAndCoerceProperty$Ex(Lit21, Lit11, Lit12, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit21, Lit22, Lit23, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit21, Lit14, Lit24, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit21, Lit16, Lit25, Lit13);
        return C0643runtime.setAndCoerceProperty$Ex(Lit21, Lit18, Lit17, Lit13);
    }

    static Object lambda7() {
        C0643runtime.setAndCoerceProperty$Ex(Lit21, Lit11, Lit12, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit21, Lit22, Lit23, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit21, Lit14, Lit24, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit21, Lit16, Lit25, Lit13);
        return C0643runtime.setAndCoerceProperty$Ex(Lit21, Lit18, Lit17, Lit13);
    }

    static Object lambda8() {
        C0643runtime.setAndCoerceProperty$Ex(Lit28, Lit29, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit28, Lit16, Lit30, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit28, Lit31, "image_2021-11-25_125604.png", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit28, Lit18, Lit32, Lit13);
    }

    static Object lambda9() {
        C0643runtime.setAndCoerceProperty$Ex(Lit28, Lit29, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit28, Lit16, Lit30, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit28, Lit31, "image_2021-11-25_125604.png", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit28, Lit18, Lit32, Lit13);
    }

    public Object Image7$Click() {
        C0643runtime.setThisForm();
        return C0643runtime.callYailPrimitive(C0643runtime.open$Mnanother$Mnscreen, LList.list1("Home"), Lit34, "open another screen");
    }

    static Object lambda10() {
        C0643runtime.setAndCoerceProperty$Ex(Lit44, Lit45, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit44, Lit46, Lit47, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit44, Lit48, "Reciepe", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit44, Lit49, Lit50, Lit13);
    }

    static Object lambda11() {
        C0643runtime.setAndCoerceProperty$Ex(Lit44, Lit45, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit44, Lit46, Lit47, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit44, Lit48, "Reciepe", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit44, Lit49, Lit50, Lit13);
    }

    static Object lambda12() {
        C0643runtime.setAndCoerceProperty$Ex(Lit59, Lit29, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit59, Lit16, Lit60, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit59, Lit31, "image_2021-11-25_125652.png", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit59, Lit18, Lit61, Lit13);
    }

    static Object lambda13() {
        C0643runtime.setAndCoerceProperty$Ex(Lit59, Lit29, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit59, Lit16, Lit60, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit59, Lit31, "image_2021-11-25_125652.png", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit59, Lit18, Lit61, Lit13);
    }

    public Object Image6$Click() {
        C0643runtime.setThisForm();
        return C0643runtime.callYailPrimitive(C0643runtime.open$Mnanother$Mnscreen, LList.list1("Screen1"), Lit63, "open another screen");
    }

    static Object lambda14() {
        C0643runtime.setAndCoerceProperty$Ex(Lit66, Lit45, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit66, Lit46, Lit67, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit66, Lit48, "Salmon and egg breakfast wrap", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit66, Lit49, Lit68, Lit13);
    }

    static Object lambda15() {
        C0643runtime.setAndCoerceProperty$Ex(Lit66, Lit45, Boolean.TRUE, Lit6);
        C0643runtime.setAndCoerceProperty$Ex(Lit66, Lit46, Lit67, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit66, Lit48, "Salmon and egg breakfast wrap", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit66, Lit49, Lit68, Lit13);
    }

    static Object lambda16() {
        C0643runtime.setAndCoerceProperty$Ex(Lit71, Lit16, Lit72, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit71, Lit31, "image_2021-11-23_121142.png", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit71, Lit18, Lit73, Lit13);
    }

    static Object lambda17() {
        C0643runtime.setAndCoerceProperty$Ex(Lit71, Lit16, Lit72, Lit13);
        C0643runtime.setAndCoerceProperty$Ex(Lit71, Lit31, "image_2021-11-23_121142.png", Lit4);
        return C0643runtime.setAndCoerceProperty$Ex(Lit71, Lit18, Lit73, Lit13);
    }

    static Object lambda18() {
        return C0643runtime.setAndCoerceProperty$Ex(Lit76, Lit14, Lit77, Lit13);
    }

    static Object lambda19() {
        return C0643runtime.setAndCoerceProperty$Ex(Lit76, Lit14, Lit77, Lit13);
    }

    static Object lambda20() {
        C0643runtime.setAndCoerceProperty$Ex(Lit80, Lit81, "[{\"Text1\":\"Ingredients\", \"$H\":132676},{\"Text1\":\" 1] 2 large British lion eggs, beaten \", \"$H\":132847},{\"Text1\":\"2] 1 tbsp chopped fresh dill or chives \", \"$H\":132848},{\"Text1\":\"3] A pinch of salt and freshly ground black pepper \", \"$H\":132849},{\"Text1\":\"4] A drizzle of olive oil \", \"$H\":132850},{\"Text1\":\"5] 2 tbsp fat free Greek yogurt \", \"$H\":132851},{\"Text1\":\"6] A little grated zest and a squeeze of lemon juice \", \"$H\":132852},{\"Text1\":\"7] 40g smoked salmon, sliced into strips \", \"$H\":132853},{\"Text1\":\"8] A handful of watercress, spinach and rocket leaf salad\", \"$H\":132854}]", Lit4);
        C0643runtime.setAndCoerceProperty$Ex(Lit80, Lit82, Lit83, Lit13);
        return C0643runtime.setAndCoerceProperty$Ex(Lit80, Lit84, Lit85, Lit13);
    }

    static Object lambda21() {
        C0643runtime.setAndCoerceProperty$Ex(Lit80, Lit81, "[{\"Text1\":\"Ingredients\", \"$H\":132676},{\"Text1\":\" 1] 2 large British lion eggs, beaten \", \"$H\":132847},{\"Text1\":\"2] 1 tbsp chopped fresh dill or chives \", \"$H\":132848},{\"Text1\":\"3] A pinch of salt and freshly ground black pepper \", \"$H\":132849},{\"Text1\":\"4] A drizzle of olive oil \", \"$H\":132850},{\"Text1\":\"5] 2 tbsp fat free Greek yogurt \", \"$H\":132851},{\"Text1\":\"6] A little grated zest and a squeeze of lemon juice \", \"$H\":132852},{\"Text1\":\"7] 40g smoked salmon, sliced into strips \", \"$H\":132853},{\"Text1\":\"8] A handful of watercress, spinach and rocket leaf salad\", \"$H\":132854}]", Lit4);
        C0643runtime.setAndCoerceProperty$Ex(Lit80, Lit82, Lit83, Lit13);
        return C0643runtime.setAndCoerceProperty$Ex(Lit80, Lit84, Lit85, Lit13);
    }

    static Object lambda22() {
        C0643runtime.setAndCoerceProperty$Ex(Lit88, Lit81, "[{\"Text1\":\"Method \", \"$H\":132676},{\"Text1\":\" 1] In a jug beat the eggs, herb, salt and pepper. Heat a non-stick frying pan, add the oil and then pour in the eggs and cook for one minute or until the egg on the top has just set. \", \"$H\":132847},{\"Text1\":\"2] Flip over and cook for a further one minute until the base is golden. Transfer to a board to cool. \", \"$H\":132848},{\"Text1\":\"3] Mix the yogurt with the lemon zest and juice and plenty of ground black pepper. Scatter the smoked salmon over the egg wrap, top with the leaves and drizzle over the yogurt mix. \", \"$H\":132849},{\"Text1\":\"4] Roll up the egg wrap and wrap in paper to serve.\", \"$H\":132850}]", Lit4);
        C0643runtime.setAndCoerceProperty$Ex(Lit88, Lit82, Lit89, Lit13);
        return C0643runtime.setAndCoerceProperty$Ex(Lit88, Lit84, Lit85, Lit13);
    }

    static Object lambda23() {
        C0643runtime.setAndCoerceProperty$Ex(Lit88, Lit81, "[{\"Text1\":\"Method \", \"$H\":132676},{\"Text1\":\" 1] In a jug beat the eggs, herb, salt and pepper. Heat a non-stick frying pan, add the oil and then pour in the eggs and cook for one minute or until the egg on the top has just set. \", \"$H\":132847},{\"Text1\":\"2] Flip over and cook for a further one minute until the base is golden. Transfer to a board to cool. \", \"$H\":132848},{\"Text1\":\"3] Mix the yogurt with the lemon zest and juice and plenty of ground black pepper. Scatter the smoked salmon over the egg wrap, top with the leaves and drizzle over the yogurt mix. \", \"$H\":132849},{\"Text1\":\"4] Roll up the egg wrap and wrap in paper to serve.\", \"$H\":132850}]", Lit4);
        C0643runtime.setAndCoerceProperty$Ex(Lit88, Lit82, Lit89, Lit13);
        return C0643runtime.setAndCoerceProperty$Ex(Lit88, Lit84, Lit85, Lit13);
    }

    /* compiled from: Recipe.yail */
    public class frame extends ModuleBody {
        Recipe $main;

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 1:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 1;
                    return 0;
                case 2:
                    if (!(obj instanceof Recipe)) {
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
                    if (!(obj instanceof Recipe)) {
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
                    if (!(obj instanceof Recipe)) {
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
                    if (!(obj instanceof Recipe)) {
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
                    Recipe recipe = this.$main;
                    try {
                        Component component = (Component) obj;
                        try {
                            String str = (String) obj2;
                            try {
                                if (obj3 == Boolean.FALSE) {
                                    z = false;
                                }
                                try {
                                    recipe.dispatchGenericEvent(component, str, z, (Object[]) obj4);
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
                    return Recipe.lambda2();
                case 19:
                    this.$main.$define();
                    return Values.empty;
                case 20:
                    return Recipe.lambda3();
                case 21:
                    return Recipe.lambda4();
                case 22:
                    return Recipe.lambda5();
                case 23:
                    return Recipe.lambda6();
                case 24:
                    return Recipe.lambda7();
                case 25:
                    return Recipe.lambda8();
                case 26:
                    return Recipe.lambda9();
                case 27:
                    return this.$main.Image7$Click();
                case 28:
                    return Recipe.lambda10();
                case 29:
                    return Recipe.lambda11();
                case 30:
                    return Recipe.lambda12();
                case 31:
                    return Recipe.lambda13();
                case 32:
                    return this.$main.Image6$Click();
                case 33:
                    return Recipe.lambda14();
                case 34:
                    return Recipe.lambda15();
                case 35:
                    return Recipe.lambda16();
                case 36:
                    return Recipe.lambda17();
                case 37:
                    return Recipe.lambda18();
                case 38:
                    return Recipe.lambda19();
                case 39:
                    return Recipe.lambda20();
                case 40:
                    return Recipe.lambda21();
                case 41:
                    return Recipe.lambda22();
                case 42:
                    return Recipe.lambda23();
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
        Recipe = this;
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
