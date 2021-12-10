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
import com.google.appinventor.components.runtime.HorizontalScrollArrangement;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.TableArrangement;
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

/* compiled from: View_schedule.yail */
public class View_schedule extends Form implements Runnable {
    static final SimpleSymbol Lit0 = ((SimpleSymbol) new SimpleSymbol("View_schedule").readResolve());
    static final SimpleSymbol Lit1 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final FString Lit10 = new FString("com.google.appinventor.components.runtime.VerticalScrollArrangement");
    static final FString Lit100 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit101 = ((SimpleSymbol) new SimpleSymbol("Label11").readResolve());
    static final FString Lit102 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit103 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit104 = ((SimpleSymbol) new SimpleSymbol("Label12").readResolve());
    static final FString Lit105 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit106 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit107 = ((SimpleSymbol) new SimpleSymbol("Label13").readResolve());
    static final FString Lit108 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit109 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit11 = ((SimpleSymbol) new SimpleSymbol("VerticalScrollArrangement1").readResolve());
    static final SimpleSymbol Lit110 = ((SimpleSymbol) new SimpleSymbol("Label14").readResolve());
    static final IntNum Lit111 = IntNum.make(5);
    static final FString Lit112 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit113 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit114 = ((SimpleSymbol) new SimpleSymbol("Label15").readResolve());
    static final IntNum Lit115 = IntNum.make(6);
    static final FString Lit116 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit117 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit118 = ((SimpleSymbol) new SimpleSymbol("Label16").readResolve());
    static final IntNum Lit119 = IntNum.make(7);
    static final SimpleSymbol Lit12 = ((SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve());
    static final FString Lit120 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit121 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit122 = ((SimpleSymbol) new SimpleSymbol("Label17").readResolve());
    static final FString Lit123 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit124 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit125 = ((SimpleSymbol) new SimpleSymbol("Label18").readResolve());
    static final FString Lit126 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit127 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit128 = ((SimpleSymbol) new SimpleSymbol("Label19").readResolve());
    static final FString Lit129 = new FString("com.google.appinventor.components.runtime.Label");
    static final IntNum Lit13 = IntNum.make(3);
    static final FString Lit130 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit131 = ((SimpleSymbol) new SimpleSymbol("Label20").readResolve());
    static final FString Lit132 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit133 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit134 = ((SimpleSymbol) new SimpleSymbol("Label21").readResolve());
    static final FString Lit135 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit136 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit137 = ((SimpleSymbol) new SimpleSymbol("Label22").readResolve());
    static final FString Lit138 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit139 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit14;
    static final SimpleSymbol Lit140 = ((SimpleSymbol) new SimpleSymbol("Label23").readResolve());
    static final FString Lit141 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit142 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit143 = ((SimpleSymbol) new SimpleSymbol("Label24").readResolve());
    static final FString Lit144 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit145 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit146 = ((SimpleSymbol) new SimpleSymbol("Label25").readResolve());
    static final FString Lit147 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit148 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit149 = ((SimpleSymbol) new SimpleSymbol("Label26").readResolve());
    static final SimpleSymbol Lit15 = ((SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve());
    static final FString Lit150 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit151 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit152 = ((SimpleSymbol) new SimpleSymbol("Label27").readResolve());
    static final FString Lit153 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit154 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit155 = ((SimpleSymbol) new SimpleSymbol("Label28").readResolve());
    static final FString Lit156 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit157 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit158 = ((SimpleSymbol) new SimpleSymbol("Label29").readResolve());
    static final FString Lit159 = new FString("com.google.appinventor.components.runtime.Label");
    static final IntNum Lit16;
    static final FString Lit160 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit161 = ((SimpleSymbol) new SimpleSymbol("Label30").readResolve());
    static final FString Lit162 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit163 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit164 = ((SimpleSymbol) new SimpleSymbol("Label31").readResolve());
    static final FString Lit165 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit166 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit167 = ((SimpleSymbol) new SimpleSymbol("Label32").readResolve());
    static final FString Lit168 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit169 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit17 = ((SimpleSymbol) new SimpleSymbol("Height").readResolve());
    static final SimpleSymbol Lit170 = ((SimpleSymbol) new SimpleSymbol("Label33").readResolve());
    static final FString Lit171 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit172 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit173 = ((SimpleSymbol) new SimpleSymbol("Label34").readResolve());
    static final FString Lit174 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit175 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit176 = ((SimpleSymbol) new SimpleSymbol("Label35").readResolve());
    static final FString Lit177 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit178 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit179 = ((SimpleSymbol) new SimpleSymbol("Label36").readResolve());
    static final IntNum Lit18 = IntNum.make(-2);
    static final FString Lit180 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit181 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit182 = ((SimpleSymbol) new SimpleSymbol("Label37").readResolve());
    static final FString Lit183 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit184 = new FString("com.google.appinventor.components.runtime.File");
    static final FString Lit185 = new FString("com.google.appinventor.components.runtime.File");
    static final SimpleSymbol Lit186 = ((SimpleSymbol) new SimpleSymbol("$text").readResolve());
    static final PairWithPosition Lit187;
    static final PairWithPosition Lit188 = PairWithPosition.make((SimpleSymbol) new SimpleSymbol("any").readResolve(), LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1876187);
    static final SimpleSymbol Lit189 = ((SimpleSymbol) new SimpleSymbol("$item").readResolve());
    static final SimpleSymbol Lit19 = ((SimpleSymbol) new SimpleSymbol("Width").readResolve());
    static final PairWithPosition Lit190 = PairWithPosition.make(Lit242, PairWithPosition.make(Lit14, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1876372), "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1876366);
    static final PairWithPosition Lit191 = PairWithPosition.make(Lit242, PairWithPosition.make(Lit14, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1876539), "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1876533);
    static final PairWithPosition Lit192 = PairWithPosition.make(Lit242, PairWithPosition.make(Lit14, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1876706), "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1876700);
    static final PairWithPosition Lit193 = PairWithPosition.make(Lit242, PairWithPosition.make(Lit14, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1876873), "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1876867);
    static final PairWithPosition Lit194 = PairWithPosition.make(Lit242, PairWithPosition.make(Lit14, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1877040), "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1877034);
    static final PairWithPosition Lit195 = PairWithPosition.make(Lit242, PairWithPosition.make(Lit14, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1877207), "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1877201);
    static final PairWithPosition Lit196 = PairWithPosition.make(Lit242, PairWithPosition.make(Lit14, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1877374), "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1877368);
    static final PairWithPosition Lit197 = PairWithPosition.make(Lit242, PairWithPosition.make(Lit14, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1877541), "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1877535);
    static final IntNum Lit198 = IntNum.make(9);
    static final PairWithPosition Lit199 = PairWithPosition.make(Lit242, PairWithPosition.make(Lit14, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1877708), "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1877702);
    static final SimpleSymbol Lit2 = ((SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve());
    static final FString Lit20 = new FString("com.google.appinventor.components.runtime.VerticalScrollArrangement");
    static final IntNum Lit200 = IntNum.make(10);
    static final PairWithPosition Lit201 = PairWithPosition.make(Lit242, PairWithPosition.make(Lit14, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1877876), "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1877870);
    static final IntNum Lit202 = IntNum.make(11);
    static final PairWithPosition Lit203 = PairWithPosition.make(Lit242, PairWithPosition.make(Lit14, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1878044), "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1878038);
    static final IntNum Lit204 = IntNum.make(12);
    static final PairWithPosition Lit205 = PairWithPosition.make(Lit242, PairWithPosition.make(Lit14, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1878212), "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1878206);
    static final IntNum Lit206 = IntNum.make(13);
    static final PairWithPosition Lit207 = PairWithPosition.make(Lit242, PairWithPosition.make(Lit14, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1878380), "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1878374);
    static final IntNum Lit208 = IntNum.make(14);
    static final PairWithPosition Lit209 = PairWithPosition.make(Lit242, PairWithPosition.make(Lit14, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1878548), "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1878542);
    static final FString Lit21 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final IntNum Lit210 = IntNum.make(15);
    static final PairWithPosition Lit211 = PairWithPosition.make(Lit242, PairWithPosition.make(Lit14, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1878716), "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1878710);
    static final IntNum Lit212 = IntNum.make(16);
    static final PairWithPosition Lit213 = PairWithPosition.make(Lit242, PairWithPosition.make(Lit14, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1878884), "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1878878);
    static final IntNum Lit214 = IntNum.make(17);
    static final PairWithPosition Lit215 = PairWithPosition.make(Lit242, PairWithPosition.make(Lit14, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1879052), "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1879046);
    static final IntNum Lit216 = IntNum.make(18);
    static final PairWithPosition Lit217 = PairWithPosition.make(Lit242, PairWithPosition.make(Lit14, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1879220), "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1879214);
    static final IntNum Lit218 = IntNum.make(19);
    static final PairWithPosition Lit219 = PairWithPosition.make(Lit242, PairWithPosition.make(Lit14, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1879388), "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1879382);
    static final SimpleSymbol Lit22 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement8").readResolve());
    static final IntNum Lit220 = IntNum.make(20);
    static final PairWithPosition Lit221 = PairWithPosition.make(Lit242, PairWithPosition.make(Lit14, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1879556), "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1879550);
    static final IntNum Lit222 = IntNum.make(21);
    static final PairWithPosition Lit223;
    static final SimpleSymbol Lit224 = ((SimpleSymbol) new SimpleSymbol("$name").readResolve());
    static final SimpleSymbol Lit225 = ((SimpleSymbol) new SimpleSymbol("File1$GotText").readResolve());
    static final SimpleSymbol Lit226 = ((SimpleSymbol) new SimpleSymbol("GotText").readResolve());
    static final SimpleSymbol Lit227 = ((SimpleSymbol) new SimpleSymbol("get-simple-name").readResolve());
    static final SimpleSymbol Lit228 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final SimpleSymbol Lit229 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final SimpleSymbol Lit23 = ((SimpleSymbol) new SimpleSymbol("AlignVertical").readResolve());
    static final SimpleSymbol Lit230 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final SimpleSymbol Lit231 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit232 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit233 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final SimpleSymbol Lit234 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final SimpleSymbol Lit235 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit236 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit237 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final SimpleSymbol Lit238 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final SimpleSymbol Lit239 = ((SimpleSymbol) new SimpleSymbol("dispatchGenericEvent").readResolve());
    static final IntNum Lit24 = IntNum.make(2);
    static final SimpleSymbol Lit240 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final SimpleSymbol Lit241 = ((SimpleSymbol) new SimpleSymbol("proc").readResolve());
    static final SimpleSymbol Lit242 = ((SimpleSymbol) new SimpleSymbol("list").readResolve());
    static final IntNum Lit25;
    static final IntNum Lit26 = IntNum.make(-1010);
    static final FString Lit27 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit28 = new FString("com.google.appinventor.components.runtime.Image");
    static final SimpleSymbol Lit29 = ((SimpleSymbol) new SimpleSymbol("Image7").readResolve());
    static final SimpleSymbol Lit3 = ((SimpleSymbol) new SimpleSymbol("g$table1").readResolve());
    static final SimpleSymbol Lit30 = ((SimpleSymbol) new SimpleSymbol("Clickable").readResolve());
    static final IntNum Lit31 = IntNum.make(-1007);
    static final SimpleSymbol Lit32 = ((SimpleSymbol) new SimpleSymbol("Picture").readResolve());
    static final IntNum Lit33 = IntNum.make(-1012);
    static final FString Lit34 = new FString("com.google.appinventor.components.runtime.Image");
    static final PairWithPosition Lit35 = PairWithPosition.make(Lit5, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 241739);
    static final SimpleSymbol Lit36 = ((SimpleSymbol) new SimpleSymbol("Image7$Click").readResolve());
    static final SimpleSymbol Lit37 = ((SimpleSymbol) new SimpleSymbol("Click").readResolve());
    static final FString Lit38 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit39 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement9").readResolve());
    static final SimpleSymbol Lit4 = ((SimpleSymbol) new SimpleSymbol("AppName").readResolve());
    static final FString Lit40 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit41 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit42 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement10").readResolve());
    static final FString Lit43 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit44 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit45 = ((SimpleSymbol) new SimpleSymbol("Label6").readResolve());
    static final SimpleSymbol Lit46 = ((SimpleSymbol) new SimpleSymbol("FontBold").readResolve());
    static final SimpleSymbol Lit47 = ((SimpleSymbol) new SimpleSymbol("FontSize").readResolve());
    static final DFloNum Lit48 = DFloNum.make((double) 24);
    static final SimpleSymbol Lit49 = ((SimpleSymbol) new SimpleSymbol("Text").readResolve());
    static final SimpleSymbol Lit5;
    static final SimpleSymbol Lit50 = ((SimpleSymbol) new SimpleSymbol("TextColor").readResolve());
    static final IntNum Lit51;
    static final FString Lit52 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit53 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit54 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement11").readResolve());
    static final FString Lit55 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit56 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit57 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement12").readResolve());
    static final FString Lit58 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit59 = new FString("com.google.appinventor.components.runtime.Image");
    static final SimpleSymbol Lit6 = ((SimpleSymbol) new SimpleSymbol("ShowListsAsJson").readResolve());
    static final SimpleSymbol Lit60 = ((SimpleSymbol) new SimpleSymbol("Image6").readResolve());
    static final IntNum Lit61 = IntNum.make(-1007);
    static final IntNum Lit62 = IntNum.make(-1012);
    static final FString Lit63 = new FString("com.google.appinventor.components.runtime.Image");
    static final PairWithPosition Lit64 = PairWithPosition.make(Lit5, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 438350);
    static final SimpleSymbol Lit65 = ((SimpleSymbol) new SimpleSymbol("Image6$Click").readResolve());
    static final FString Lit66 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit67 = ((SimpleSymbol) new SimpleSymbol("Button1").readResolve());
    static final FString Lit68 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit69 = ((SimpleSymbol) new SimpleSymbol("File1").readResolve());
    static final SimpleSymbol Lit7 = ((SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve());
    static final SimpleSymbol Lit70 = ((SimpleSymbol) new SimpleSymbol("ReadFrom").readResolve());
    static final PairWithPosition Lit71 = PairWithPosition.make(Lit5, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 475216);
    static final SimpleSymbol Lit72 = ((SimpleSymbol) new SimpleSymbol("TableArrangement1").readResolve());
    static final SimpleSymbol Lit73 = ((SimpleSymbol) new SimpleSymbol("Visible").readResolve());
    static final SimpleSymbol Lit74 = ((SimpleSymbol) new SimpleSymbol("Button1$Click").readResolve());
    static final FString Lit75 = new FString("com.google.appinventor.components.runtime.HorizontalScrollArrangement");
    static final SimpleSymbol Lit76 = ((SimpleSymbol) new SimpleSymbol("HorizontalScrollArrangement1").readResolve());
    static final FString Lit77 = new FString("com.google.appinventor.components.runtime.HorizontalScrollArrangement");
    static final FString Lit78 = new FString("com.google.appinventor.components.runtime.TableArrangement");
    static final SimpleSymbol Lit79 = ((SimpleSymbol) new SimpleSymbol("Columns").readResolve());
    static final SimpleSymbol Lit8 = ((SimpleSymbol) new SimpleSymbol("Sizing").readResolve());
    static final IntNum Lit80 = IntNum.make(4);
    static final SimpleSymbol Lit81 = ((SimpleSymbol) new SimpleSymbol("Rows").readResolve());
    static final IntNum Lit82 = IntNum.make(8);
    static final FString Lit83 = new FString("com.google.appinventor.components.runtime.TableArrangement");
    static final FString Lit84 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit85 = ((SimpleSymbol) new SimpleSymbol("Label7").readResolve());
    static final SimpleSymbol Lit86 = ((SimpleSymbol) new SimpleSymbol("Column").readResolve());
    static final IntNum Lit87 = IntNum.make(1);
    static final SimpleSymbol Lit88 = ((SimpleSymbol) new SimpleSymbol("Row").readResolve());
    static final IntNum Lit89 = IntNum.make(0);
    static final SimpleSymbol Lit9 = ((SimpleSymbol) new SimpleSymbol("Title").readResolve());
    static final FString Lit90 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit91 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit92 = ((SimpleSymbol) new SimpleSymbol("Label8").readResolve());
    static final FString Lit93 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit94 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit95 = ((SimpleSymbol) new SimpleSymbol("Label9").readResolve());
    static final FString Lit96 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit97 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit98 = ((SimpleSymbol) new SimpleSymbol("Label10").readResolve());
    static final FString Lit99 = new FString("com.google.appinventor.components.runtime.Label");
    public static View_schedule View_schedule;
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
    static final ModuleMethod lambda$Fn51 = null;
    static final ModuleMethod lambda$Fn52 = null;
    static final ModuleMethod lambda$Fn53 = null;
    static final ModuleMethod lambda$Fn54 = null;
    static final ModuleMethod lambda$Fn55 = null;
    static final ModuleMethod lambda$Fn56 = null;
    static final ModuleMethod lambda$Fn57 = null;
    static final ModuleMethod lambda$Fn58 = null;
    static final ModuleMethod lambda$Fn59 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn60 = null;
    static final ModuleMethod lambda$Fn61 = null;
    static final ModuleMethod lambda$Fn62 = null;
    static final ModuleMethod lambda$Fn63 = null;
    static final ModuleMethod lambda$Fn64 = null;
    static final ModuleMethod lambda$Fn65 = null;
    static final ModuleMethod lambda$Fn66 = null;
    static final ModuleMethod lambda$Fn67 = null;
    static final ModuleMethod lambda$Fn68 = null;
    static final ModuleMethod lambda$Fn69 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn70 = null;
    static final ModuleMethod lambda$Fn71 = null;
    static final ModuleMethod lambda$Fn72 = null;
    static final ModuleMethod lambda$Fn73 = null;
    static final ModuleMethod lambda$Fn74 = null;
    static final ModuleMethod lambda$Fn75 = null;
    static final ModuleMethod lambda$Fn76 = null;
    static final ModuleMethod lambda$Fn77 = null;
    static final ModuleMethod lambda$Fn78 = null;
    static final ModuleMethod lambda$Fn79 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    static final ModuleMethod proc$Fn80 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public Button Button1;
    public final ModuleMethod Button1$Click;
    public File File1;
    public final ModuleMethod File1$GotText;
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
    public Label Label10;
    public Label Label11;
    public Label Label12;
    public Label Label13;
    public Label Label14;
    public Label Label15;
    public Label Label16;
    public Label Label17;
    public Label Label18;
    public Label Label19;
    public Label Label20;
    public Label Label21;
    public Label Label22;
    public Label Label23;
    public Label Label24;
    public Label Label25;
    public Label Label26;
    public Label Label27;
    public Label Label28;
    public Label Label29;
    public Label Label30;
    public Label Label31;
    public Label Label32;
    public Label Label33;
    public Label Label34;
    public Label Label35;
    public Label Label36;
    public Label Label37;
    public Label Label6;
    public Label Label7;
    public Label Label8;
    public Label Label9;
    public TableArrangement TableArrangement1;
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
        SimpleSymbol simpleSymbol = Lit242;
        SimpleSymbol simpleSymbol2 = (SimpleSymbol) new SimpleSymbol("number").readResolve();
        Lit14 = simpleSymbol2;
        Lit223 = PairWithPosition.make(simpleSymbol, PairWithPosition.make(simpleSymbol2, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1879724), "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1879718);
        SimpleSymbol simpleSymbol3 = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit5 = simpleSymbol3;
        Lit187 = PairWithPosition.make(simpleSymbol3, PairWithPosition.make(Lit5, LList.Empty, "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1876169), "/tmp/1638778377245_0.9129277085230348-0/youngandroidproject/../src/appinventor/ai_anon2042442813087/Food_recipe_checkpoint_final/View_schedule.yail", 1876163);
        int[] iArr = new int[2];
        iArr[0] = -65536;
        Lit51 = IntNum.make(iArr);
        int[] iArr2 = new int[2];
        iArr2[0] = -16777216;
        Lit25 = IntNum.make(iArr2);
        int[] iArr3 = new int[2];
        iArr3[0] = -16711681;
        Lit16 = IntNum.make(iArr3);
    }

    public View_schedule() {
        ModuleInfo.register(this);
        frame frame2 = new frame();
        frame2.$main = this;
        this.get$Mnsimple$Mnname = new ModuleMethod(frame2, 1, Lit227, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.onCreate = new ModuleMethod(frame2, 2, "onCreate", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frame2, 3, Lit228, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frame2, 4, Lit229, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 5, Lit230, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 7, Lit231, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frame2, 8, Lit232, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frame2, 9, Lit233, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frame2, 10, Lit234, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frame2, 11, Lit235, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frame2, 12, Lit236, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frame2, 13, Lit237, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frame2, 14, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frame2, 15, Lit238, 16388);
        this.dispatchGenericEvent = new ModuleMethod(frame2, 16, Lit239, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frame2, 17, Lit240, 8194);
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
        this.Image7$Click = new ModuleMethod(frame2, 28, Lit36, 0);
        lambda$Fn10 = new ModuleMethod(frame2, 29, (Object) null, 0);
        lambda$Fn11 = new ModuleMethod(frame2, 30, (Object) null, 0);
        lambda$Fn12 = new ModuleMethod(frame2, 31, (Object) null, 0);
        lambda$Fn13 = new ModuleMethod(frame2, 32, (Object) null, 0);
        this.Image6$Click = new ModuleMethod(frame2, 33, Lit65, 0);
        lambda$Fn14 = new ModuleMethod(frame2, 34, (Object) null, 0);
        lambda$Fn15 = new ModuleMethod(frame2, 35, (Object) null, 0);
        this.Button1$Click = new ModuleMethod(frame2, 36, Lit74, 0);
        lambda$Fn16 = new ModuleMethod(frame2, 37, (Object) null, 0);
        lambda$Fn17 = new ModuleMethod(frame2, 38, (Object) null, 0);
        lambda$Fn18 = new ModuleMethod(frame2, 39, (Object) null, 0);
        lambda$Fn19 = new ModuleMethod(frame2, 40, (Object) null, 0);
        lambda$Fn20 = new ModuleMethod(frame2, 41, (Object) null, 0);
        lambda$Fn21 = new ModuleMethod(frame2, 42, (Object) null, 0);
        lambda$Fn22 = new ModuleMethod(frame2, 43, (Object) null, 0);
        lambda$Fn23 = new ModuleMethod(frame2, 44, (Object) null, 0);
        lambda$Fn24 = new ModuleMethod(frame2, 45, (Object) null, 0);
        lambda$Fn25 = new ModuleMethod(frame2, 46, (Object) null, 0);
        lambda$Fn26 = new ModuleMethod(frame2, 47, (Object) null, 0);
        lambda$Fn27 = new ModuleMethod(frame2, 48, (Object) null, 0);
        lambda$Fn28 = new ModuleMethod(frame2, 49, (Object) null, 0);
        lambda$Fn29 = new ModuleMethod(frame2, 50, (Object) null, 0);
        lambda$Fn30 = new ModuleMethod(frame2, 51, (Object) null, 0);
        lambda$Fn31 = new ModuleMethod(frame2, 52, (Object) null, 0);
        lambda$Fn32 = new ModuleMethod(frame2, 53, (Object) null, 0);
        lambda$Fn33 = new ModuleMethod(frame2, 54, (Object) null, 0);
        lambda$Fn34 = new ModuleMethod(frame2, 55, (Object) null, 0);
        lambda$Fn35 = new ModuleMethod(frame2, 56, (Object) null, 0);
        lambda$Fn36 = new ModuleMethod(frame2, 57, (Object) null, 0);
        lambda$Fn37 = new ModuleMethod(frame2, 58, (Object) null, 0);
        lambda$Fn38 = new ModuleMethod(frame2, 59, (Object) null, 0);
        lambda$Fn39 = new ModuleMethod(frame2, 60, (Object) null, 0);
        lambda$Fn40 = new ModuleMethod(frame2, 61, (Object) null, 0);
        lambda$Fn41 = new ModuleMethod(frame2, 62, (Object) null, 0);
        lambda$Fn42 = new ModuleMethod(frame2, 63, (Object) null, 0);
        lambda$Fn43 = new ModuleMethod(frame2, 64, (Object) null, 0);
        lambda$Fn44 = new ModuleMethod(frame2, 65, (Object) null, 0);
        lambda$Fn45 = new ModuleMethod(frame2, 66, (Object) null, 0);
        lambda$Fn46 = new ModuleMethod(frame2, 67, (Object) null, 0);
        lambda$Fn47 = new ModuleMethod(frame2, 68, (Object) null, 0);
        lambda$Fn48 = new ModuleMethod(frame2, 69, (Object) null, 0);
        lambda$Fn49 = new ModuleMethod(frame2, 70, (Object) null, 0);
        lambda$Fn50 = new ModuleMethod(frame2, 71, (Object) null, 0);
        lambda$Fn51 = new ModuleMethod(frame2, 72, (Object) null, 0);
        lambda$Fn52 = new ModuleMethod(frame2, 73, (Object) null, 0);
        lambda$Fn53 = new ModuleMethod(frame2, 74, (Object) null, 0);
        lambda$Fn54 = new ModuleMethod(frame2, 75, (Object) null, 0);
        lambda$Fn55 = new ModuleMethod(frame2, 76, (Object) null, 0);
        lambda$Fn56 = new ModuleMethod(frame2, 77, (Object) null, 0);
        lambda$Fn57 = new ModuleMethod(frame2, 78, (Object) null, 0);
        lambda$Fn58 = new ModuleMethod(frame2, 79, (Object) null, 0);
        lambda$Fn59 = new ModuleMethod(frame2, 80, (Object) null, 0);
        lambda$Fn60 = new ModuleMethod(frame2, 81, (Object) null, 0);
        lambda$Fn61 = new ModuleMethod(frame2, 82, (Object) null, 0);
        lambda$Fn62 = new ModuleMethod(frame2, 83, (Object) null, 0);
        lambda$Fn63 = new ModuleMethod(frame2, 84, (Object) null, 0);
        lambda$Fn64 = new ModuleMethod(frame2, 85, (Object) null, 0);
        lambda$Fn65 = new ModuleMethod(frame2, 86, (Object) null, 0);
        lambda$Fn66 = new ModuleMethod(frame2, 87, (Object) null, 0);
        lambda$Fn67 = new ModuleMethod(frame2, 88, (Object) null, 0);
        lambda$Fn68 = new ModuleMethod(frame2, 89, (Object) null, 0);
        lambda$Fn69 = new ModuleMethod(frame2, 90, (Object) null, 0);
        lambda$Fn70 = new ModuleMethod(frame2, 91, (Object) null, 0);
        lambda$Fn71 = new ModuleMethod(frame2, 92, (Object) null, 0);
        lambda$Fn72 = new ModuleMethod(frame2, 93, (Object) null, 0);
        lambda$Fn73 = new ModuleMethod(frame2, 94, (Object) null, 0);
        lambda$Fn74 = new ModuleMethod(frame2, 95, (Object) null, 0);
        lambda$Fn75 = new ModuleMethod(frame2, 96, (Object) null, 0);
        lambda$Fn76 = new ModuleMethod(frame2, 97, (Object) null, 0);
        lambda$Fn77 = new ModuleMethod(frame2, 98, (Object) null, 0);
        lambda$Fn78 = new ModuleMethod(frame2, 99, (Object) null, 0);
        lambda$Fn79 = new ModuleMethod(frame2, 100, (Object) null, 0);
        proc$Fn80 = new ModuleMethod(frame2, 101, Lit241, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.File1$GotText = new ModuleMethod(frame2, 102, Lit225, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
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
        View_schedule = null;
        this.form$Mnname$Mnsymbol = Lit0;
        this.events$Mnto$Mnregister = LList.Empty;
        this.components$Mnto$Mncreate = LList.Empty;
        this.global$Mnvars$Mnto$Mncreate = LList.Empty;
        this.form$Mndo$Mnafter$Mncreation = LList.Empty;
        C0643runtime.$instance.run();
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addGlobalVarToCurrentFormEnvironment(Lit3, C0643runtime.callYailPrimitive(C0643runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list")), $result);
        } else {
            addToGlobalVars(Lit3, lambda$Fn2);
        }
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0643runtime.setAndCoerceProperty$Ex(Lit0, Lit4, "Food_recipe", Lit5);
            C0643runtime.setAndCoerceProperty$Ex(Lit0, Lit6, Boolean.TRUE, Lit7);
            C0643runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "Responsive", Lit5);
            Values.writeValues(C0643runtime.setAndCoerceProperty$Ex(Lit0, Lit9, "View_schedule", Lit5), $result);
        } else {
            addToFormDoAfterCreation(new Promise(lambda$Fn3));
        }
        this.VerticalScrollArrangement1 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit0, Lit10, Lit11, lambda$Fn4), $result);
        } else {
            addToComponents(Lit0, Lit20, Lit11, lambda$Fn5);
        }
        this.HorizontalArrangement8 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit11, Lit21, Lit22, lambda$Fn6), $result);
        } else {
            addToComponents(Lit11, Lit27, Lit22, lambda$Fn7);
        }
        this.Image7 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit22, Lit28, Lit29, lambda$Fn8), $result);
        } else {
            addToComponents(Lit22, Lit34, Lit29, lambda$Fn9);
        }
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0643runtime.addToCurrentFormEnvironment(Lit36, this.Image7$Click);
        } else {
            addToFormEnvironment(Lit36, this.Image7$Click);
        }
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0643runtime.$Stthis$Mnform$St, "Image7", "Click");
        } else {
            addToEvents(Lit29, Lit37);
        }
        this.HorizontalArrangement9 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit22, Lit38, Lit39, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit22, Lit40, Lit39, Boolean.FALSE);
        }
        this.HorizontalArrangement10 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit22, Lit41, Lit42, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit22, Lit43, Lit42, Boolean.FALSE);
        }
        this.Label6 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit22, Lit44, Lit45, lambda$Fn10), $result);
        } else {
            addToComponents(Lit22, Lit52, Lit45, lambda$Fn11);
        }
        this.HorizontalArrangement11 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit22, Lit53, Lit54, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit22, Lit55, Lit54, Boolean.FALSE);
        }
        this.HorizontalArrangement12 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit22, Lit56, Lit57, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit22, Lit58, Lit57, Boolean.FALSE);
        }
        this.Image6 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit22, Lit59, Lit60, lambda$Fn12), $result);
        } else {
            addToComponents(Lit22, Lit63, Lit60, lambda$Fn13);
        }
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0643runtime.addToCurrentFormEnvironment(Lit65, this.Image6$Click);
        } else {
            addToFormEnvironment(Lit65, this.Image6$Click);
        }
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0643runtime.$Stthis$Mnform$St, "Image6", "Click");
        } else {
            addToEvents(Lit60, Lit37);
        }
        this.Button1 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit11, Lit66, Lit67, lambda$Fn14), $result);
        } else {
            addToComponents(Lit11, Lit68, Lit67, lambda$Fn15);
        }
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0643runtime.addToCurrentFormEnvironment(Lit74, this.Button1$Click);
        } else {
            addToFormEnvironment(Lit74, this.Button1$Click);
        }
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0643runtime.$Stthis$Mnform$St, "Button1", "Click");
        } else {
            addToEvents(Lit67, Lit37);
        }
        this.HorizontalScrollArrangement1 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit11, Lit75, Lit76, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit11, Lit77, Lit76, Boolean.FALSE);
        }
        this.TableArrangement1 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit76, Lit78, Lit72, lambda$Fn16), $result);
        } else {
            addToComponents(Lit76, Lit83, Lit72, lambda$Fn17);
        }
        this.Label7 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit72, Lit84, Lit85, lambda$Fn18), $result);
        } else {
            addToComponents(Lit72, Lit90, Lit85, lambda$Fn19);
        }
        this.Label8 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit72, Lit91, Lit92, lambda$Fn20), $result);
        } else {
            addToComponents(Lit72, Lit93, Lit92, lambda$Fn21);
        }
        this.Label9 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit72, Lit94, Lit95, lambda$Fn22), $result);
        } else {
            addToComponents(Lit72, Lit96, Lit95, lambda$Fn23);
        }
        this.Label10 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit72, Lit97, Lit98, lambda$Fn24), $result);
        } else {
            addToComponents(Lit72, Lit99, Lit98, lambda$Fn25);
        }
        this.Label11 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit72, Lit100, Lit101, lambda$Fn26), $result);
        } else {
            addToComponents(Lit72, Lit102, Lit101, lambda$Fn27);
        }
        this.Label12 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit72, Lit103, Lit104, lambda$Fn28), $result);
        } else {
            addToComponents(Lit72, Lit105, Lit104, lambda$Fn29);
        }
        this.Label13 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit72, Lit106, Lit107, lambda$Fn30), $result);
        } else {
            addToComponents(Lit72, Lit108, Lit107, lambda$Fn31);
        }
        this.Label14 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit72, Lit109, Lit110, lambda$Fn32), $result);
        } else {
            addToComponents(Lit72, Lit112, Lit110, lambda$Fn33);
        }
        this.Label15 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit72, Lit113, Lit114, lambda$Fn34), $result);
        } else {
            addToComponents(Lit72, Lit116, Lit114, lambda$Fn35);
        }
        this.Label16 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit72, Lit117, Lit118, lambda$Fn36), $result);
        } else {
            addToComponents(Lit72, Lit120, Lit118, lambda$Fn37);
        }
        this.Label17 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit72, Lit121, Lit122, lambda$Fn38), $result);
        } else {
            addToComponents(Lit72, Lit123, Lit122, lambda$Fn39);
        }
        this.Label18 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit72, Lit124, Lit125, lambda$Fn40), $result);
        } else {
            addToComponents(Lit72, Lit126, Lit125, lambda$Fn41);
        }
        this.Label19 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit72, Lit127, Lit128, lambda$Fn42), $result);
        } else {
            addToComponents(Lit72, Lit129, Lit128, lambda$Fn43);
        }
        this.Label20 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit72, Lit130, Lit131, lambda$Fn44), $result);
        } else {
            addToComponents(Lit72, Lit132, Lit131, lambda$Fn45);
        }
        this.Label21 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit72, Lit133, Lit134, lambda$Fn46), $result);
        } else {
            addToComponents(Lit72, Lit135, Lit134, lambda$Fn47);
        }
        this.Label22 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit72, Lit136, Lit137, lambda$Fn48), $result);
        } else {
            addToComponents(Lit72, Lit138, Lit137, lambda$Fn49);
        }
        this.Label23 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit72, Lit139, Lit140, lambda$Fn50), $result);
        } else {
            addToComponents(Lit72, Lit141, Lit140, lambda$Fn51);
        }
        this.Label24 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit72, Lit142, Lit143, lambda$Fn52), $result);
        } else {
            addToComponents(Lit72, Lit144, Lit143, lambda$Fn53);
        }
        this.Label25 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit72, Lit145, Lit146, lambda$Fn54), $result);
        } else {
            addToComponents(Lit72, Lit147, Lit146, lambda$Fn55);
        }
        this.Label26 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit72, Lit148, Lit149, lambda$Fn56), $result);
        } else {
            addToComponents(Lit72, Lit150, Lit149, lambda$Fn57);
        }
        this.Label27 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit72, Lit151, Lit152, lambda$Fn58), $result);
        } else {
            addToComponents(Lit72, Lit153, Lit152, lambda$Fn59);
        }
        this.Label28 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit72, Lit154, Lit155, lambda$Fn60), $result);
        } else {
            addToComponents(Lit72, Lit156, Lit155, lambda$Fn61);
        }
        this.Label29 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit72, Lit157, Lit158, lambda$Fn62), $result);
        } else {
            addToComponents(Lit72, Lit159, Lit158, lambda$Fn63);
        }
        this.Label30 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit72, Lit160, Lit161, lambda$Fn64), $result);
        } else {
            addToComponents(Lit72, Lit162, Lit161, lambda$Fn65);
        }
        this.Label31 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit72, Lit163, Lit164, lambda$Fn66), $result);
        } else {
            addToComponents(Lit72, Lit165, Lit164, lambda$Fn67);
        }
        this.Label32 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit72, Lit166, Lit167, lambda$Fn68), $result);
        } else {
            addToComponents(Lit72, Lit168, Lit167, lambda$Fn69);
        }
        this.Label33 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit72, Lit169, Lit170, lambda$Fn70), $result);
        } else {
            addToComponents(Lit72, Lit171, Lit170, lambda$Fn71);
        }
        this.Label34 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit72, Lit172, Lit173, lambda$Fn72), $result);
        } else {
            addToComponents(Lit72, Lit174, Lit173, lambda$Fn73);
        }
        this.Label35 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit72, Lit175, Lit176, lambda$Fn74), $result);
        } else {
            addToComponents(Lit72, Lit177, Lit176, lambda$Fn75);
        }
        this.Label36 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit72, Lit178, Lit179, lambda$Fn76), $result);
        } else {
            addToComponents(Lit72, Lit180, Lit179, lambda$Fn77);
        }
        this.Label37 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit72, Lit181, Lit182, lambda$Fn78), $result);
        } else {
            addToComponents(Lit72, Lit183, Lit182, lambda$Fn79);
        }
        this.File1 = null;
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0643runtime.addComponentWithinRepl(Lit0, Lit184, Lit69, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit185, Lit69, Boolean.FALSE);
        }
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0643runtime.addToCurrentFormEnvironment(Lit225, this.File1$GotText);
        } else {
            addToFormEnvironment(Lit225, this.File1$GotText);
        }
        if (C0643runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0643runtime.$Stthis$Mnform$St, "File1", "GotText");
        } else {
            addToEvents(Lit69, Lit226);
        }
        C0643runtime.initRuntime();
    }

    static Object lambda3() {
        return C0643runtime.callYailPrimitive(C0643runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list");
    }

    static Object lambda4() {
        C0643runtime.setAndCoerceProperty$Ex(Lit0, Lit4, "Food_recipe", Lit5);
        C0643runtime.setAndCoerceProperty$Ex(Lit0, Lit6, Boolean.TRUE, Lit7);
        C0643runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "Responsive", Lit5);
        return C0643runtime.setAndCoerceProperty$Ex(Lit0, Lit9, "View_schedule", Lit5);
    }

    static Object lambda5() {
        C0643runtime.setAndCoerceProperty$Ex(Lit11, Lit12, Lit13, Lit14);
        C0643runtime.setAndCoerceProperty$Ex(Lit11, Lit15, Lit16, Lit14);
        C0643runtime.setAndCoerceProperty$Ex(Lit11, Lit17, Lit18, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit11, Lit19, Lit18, Lit14);
    }

    static Object lambda6() {
        C0643runtime.setAndCoerceProperty$Ex(Lit11, Lit12, Lit13, Lit14);
        C0643runtime.setAndCoerceProperty$Ex(Lit11, Lit15, Lit16, Lit14);
        C0643runtime.setAndCoerceProperty$Ex(Lit11, Lit17, Lit18, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit11, Lit19, Lit18, Lit14);
    }

    static Object lambda7() {
        C0643runtime.setAndCoerceProperty$Ex(Lit22, Lit12, Lit13, Lit14);
        C0643runtime.setAndCoerceProperty$Ex(Lit22, Lit23, Lit24, Lit14);
        C0643runtime.setAndCoerceProperty$Ex(Lit22, Lit15, Lit25, Lit14);
        C0643runtime.setAndCoerceProperty$Ex(Lit22, Lit17, Lit26, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit22, Lit19, Lit18, Lit14);
    }

    static Object lambda8() {
        C0643runtime.setAndCoerceProperty$Ex(Lit22, Lit12, Lit13, Lit14);
        C0643runtime.setAndCoerceProperty$Ex(Lit22, Lit23, Lit24, Lit14);
        C0643runtime.setAndCoerceProperty$Ex(Lit22, Lit15, Lit25, Lit14);
        C0643runtime.setAndCoerceProperty$Ex(Lit22, Lit17, Lit26, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit22, Lit19, Lit18, Lit14);
    }

    static Object lambda10() {
        C0643runtime.setAndCoerceProperty$Ex(Lit29, Lit30, Boolean.TRUE, Lit7);
        C0643runtime.setAndCoerceProperty$Ex(Lit29, Lit17, Lit31, Lit14);
        C0643runtime.setAndCoerceProperty$Ex(Lit29, Lit32, "image_2021-11-25_125604.png", Lit5);
        return C0643runtime.setAndCoerceProperty$Ex(Lit29, Lit19, Lit33, Lit14);
    }

    static Object lambda9() {
        C0643runtime.setAndCoerceProperty$Ex(Lit29, Lit30, Boolean.TRUE, Lit7);
        C0643runtime.setAndCoerceProperty$Ex(Lit29, Lit17, Lit31, Lit14);
        C0643runtime.setAndCoerceProperty$Ex(Lit29, Lit32, "image_2021-11-25_125604.png", Lit5);
        return C0643runtime.setAndCoerceProperty$Ex(Lit29, Lit19, Lit33, Lit14);
    }

    public Object Image7$Click() {
        C0643runtime.setThisForm();
        return C0643runtime.callYailPrimitive(C0643runtime.open$Mnanother$Mnscreen, LList.list1("Home"), Lit35, "open another screen");
    }

    static Object lambda11() {
        C0643runtime.setAndCoerceProperty$Ex(Lit45, Lit46, Boolean.TRUE, Lit7);
        C0643runtime.setAndCoerceProperty$Ex(Lit45, Lit47, Lit48, Lit14);
        C0643runtime.setAndCoerceProperty$Ex(Lit45, Lit49, "Breakfast", Lit5);
        return C0643runtime.setAndCoerceProperty$Ex(Lit45, Lit50, Lit51, Lit14);
    }

    static Object lambda12() {
        C0643runtime.setAndCoerceProperty$Ex(Lit45, Lit46, Boolean.TRUE, Lit7);
        C0643runtime.setAndCoerceProperty$Ex(Lit45, Lit47, Lit48, Lit14);
        C0643runtime.setAndCoerceProperty$Ex(Lit45, Lit49, "Breakfast", Lit5);
        return C0643runtime.setAndCoerceProperty$Ex(Lit45, Lit50, Lit51, Lit14);
    }

    static Object lambda13() {
        C0643runtime.setAndCoerceProperty$Ex(Lit60, Lit30, Boolean.TRUE, Lit7);
        C0643runtime.setAndCoerceProperty$Ex(Lit60, Lit17, Lit61, Lit14);
        C0643runtime.setAndCoerceProperty$Ex(Lit60, Lit32, "image_2021-11-25_125652.png", Lit5);
        return C0643runtime.setAndCoerceProperty$Ex(Lit60, Lit19, Lit62, Lit14);
    }

    static Object lambda14() {
        C0643runtime.setAndCoerceProperty$Ex(Lit60, Lit30, Boolean.TRUE, Lit7);
        C0643runtime.setAndCoerceProperty$Ex(Lit60, Lit17, Lit61, Lit14);
        C0643runtime.setAndCoerceProperty$Ex(Lit60, Lit32, "image_2021-11-25_125652.png", Lit5);
        return C0643runtime.setAndCoerceProperty$Ex(Lit60, Lit19, Lit62, Lit14);
    }

    public Object Image6$Click() {
        C0643runtime.setThisForm();
        return C0643runtime.callYailPrimitive(C0643runtime.open$Mnanother$Mnscreen, LList.list1("Screen1"), Lit64, "open another screen");
    }

    static Object lambda15() {
        return C0643runtime.setAndCoerceProperty$Ex(Lit67, Lit49, "View Table", Lit5);
    }

    static Object lambda16() {
        return C0643runtime.setAndCoerceProperty$Ex(Lit67, Lit49, "View Table", Lit5);
    }

    public Object Button1$Click() {
        C0643runtime.setThisForm();
        C0643runtime.callComponentMethod(Lit69, Lit70, LList.list1("txtdoc.txt"), Lit71);
        return C0643runtime.setAndCoerceProperty$Ex(Lit72, Lit73, Boolean.TRUE, Lit7);
    }

    static Object lambda17() {
        C0643runtime.setAndCoerceProperty$Ex(Lit72, Lit79, Lit80, Lit14);
        C0643runtime.setAndCoerceProperty$Ex(Lit72, Lit81, Lit82, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit72, Lit73, Boolean.FALSE, Lit7);
    }

    static Object lambda18() {
        C0643runtime.setAndCoerceProperty$Ex(Lit72, Lit79, Lit80, Lit14);
        C0643runtime.setAndCoerceProperty$Ex(Lit72, Lit81, Lit82, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit72, Lit73, Boolean.FALSE, Lit7);
    }

    static Object lambda19() {
        C0643runtime.setAndCoerceProperty$Ex(Lit85, Lit86, Lit87, Lit14);
        C0643runtime.setAndCoerceProperty$Ex(Lit85, Lit46, Boolean.TRUE, Lit7);
        C0643runtime.setAndCoerceProperty$Ex(Lit85, Lit88, Lit89, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit85, Lit49, "Breakfast", Lit5);
    }

    static Object lambda20() {
        C0643runtime.setAndCoerceProperty$Ex(Lit85, Lit86, Lit87, Lit14);
        C0643runtime.setAndCoerceProperty$Ex(Lit85, Lit46, Boolean.TRUE, Lit7);
        C0643runtime.setAndCoerceProperty$Ex(Lit85, Lit88, Lit89, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit85, Lit49, "Breakfast", Lit5);
    }

    static Object lambda21() {
        C0643runtime.setAndCoerceProperty$Ex(Lit92, Lit86, Lit24, Lit14);
        C0643runtime.setAndCoerceProperty$Ex(Lit92, Lit46, Boolean.TRUE, Lit7);
        C0643runtime.setAndCoerceProperty$Ex(Lit92, Lit88, Lit89, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit92, Lit49, "Lunch", Lit5);
    }

    static Object lambda22() {
        C0643runtime.setAndCoerceProperty$Ex(Lit92, Lit86, Lit24, Lit14);
        C0643runtime.setAndCoerceProperty$Ex(Lit92, Lit46, Boolean.TRUE, Lit7);
        C0643runtime.setAndCoerceProperty$Ex(Lit92, Lit88, Lit89, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit92, Lit49, "Lunch", Lit5);
    }

    static Object lambda23() {
        C0643runtime.setAndCoerceProperty$Ex(Lit95, Lit86, Lit13, Lit14);
        C0643runtime.setAndCoerceProperty$Ex(Lit95, Lit46, Boolean.TRUE, Lit7);
        C0643runtime.setAndCoerceProperty$Ex(Lit95, Lit88, Lit89, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit95, Lit49, "Dinner", Lit5);
    }

    static Object lambda24() {
        C0643runtime.setAndCoerceProperty$Ex(Lit95, Lit86, Lit13, Lit14);
        C0643runtime.setAndCoerceProperty$Ex(Lit95, Lit46, Boolean.TRUE, Lit7);
        C0643runtime.setAndCoerceProperty$Ex(Lit95, Lit88, Lit89, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit95, Lit49, "Dinner", Lit5);
    }

    static Object lambda25() {
        C0643runtime.setAndCoerceProperty$Ex(Lit98, Lit86, Lit89, Lit14);
        C0643runtime.setAndCoerceProperty$Ex(Lit98, Lit46, Boolean.TRUE, Lit7);
        C0643runtime.setAndCoerceProperty$Ex(Lit98, Lit88, Lit87, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit98, Lit49, "Monday", Lit5);
    }

    static Object lambda26() {
        C0643runtime.setAndCoerceProperty$Ex(Lit98, Lit86, Lit89, Lit14);
        C0643runtime.setAndCoerceProperty$Ex(Lit98, Lit46, Boolean.TRUE, Lit7);
        C0643runtime.setAndCoerceProperty$Ex(Lit98, Lit88, Lit87, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit98, Lit49, "Monday", Lit5);
    }

    static Object lambda27() {
        C0643runtime.setAndCoerceProperty$Ex(Lit101, Lit86, Lit89, Lit14);
        C0643runtime.setAndCoerceProperty$Ex(Lit101, Lit46, Boolean.TRUE, Lit7);
        C0643runtime.setAndCoerceProperty$Ex(Lit101, Lit88, Lit24, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit101, Lit49, "Tuesday", Lit5);
    }

    static Object lambda28() {
        C0643runtime.setAndCoerceProperty$Ex(Lit101, Lit86, Lit89, Lit14);
        C0643runtime.setAndCoerceProperty$Ex(Lit101, Lit46, Boolean.TRUE, Lit7);
        C0643runtime.setAndCoerceProperty$Ex(Lit101, Lit88, Lit24, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit101, Lit49, "Tuesday", Lit5);
    }

    static Object lambda29() {
        C0643runtime.setAndCoerceProperty$Ex(Lit104, Lit86, Lit89, Lit14);
        C0643runtime.setAndCoerceProperty$Ex(Lit104, Lit46, Boolean.TRUE, Lit7);
        C0643runtime.setAndCoerceProperty$Ex(Lit104, Lit88, Lit13, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit104, Lit49, "Wednesday", Lit5);
    }

    static Object lambda30() {
        C0643runtime.setAndCoerceProperty$Ex(Lit104, Lit86, Lit89, Lit14);
        C0643runtime.setAndCoerceProperty$Ex(Lit104, Lit46, Boolean.TRUE, Lit7);
        C0643runtime.setAndCoerceProperty$Ex(Lit104, Lit88, Lit13, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit104, Lit49, "Wednesday", Lit5);
    }

    static Object lambda31() {
        C0643runtime.setAndCoerceProperty$Ex(Lit107, Lit86, Lit89, Lit14);
        C0643runtime.setAndCoerceProperty$Ex(Lit107, Lit46, Boolean.TRUE, Lit7);
        C0643runtime.setAndCoerceProperty$Ex(Lit107, Lit88, Lit80, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit107, Lit49, "Thursday", Lit5);
    }

    static Object lambda32() {
        C0643runtime.setAndCoerceProperty$Ex(Lit107, Lit86, Lit89, Lit14);
        C0643runtime.setAndCoerceProperty$Ex(Lit107, Lit46, Boolean.TRUE, Lit7);
        C0643runtime.setAndCoerceProperty$Ex(Lit107, Lit88, Lit80, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit107, Lit49, "Thursday", Lit5);
    }

    static Object lambda33() {
        C0643runtime.setAndCoerceProperty$Ex(Lit110, Lit86, Lit89, Lit14);
        C0643runtime.setAndCoerceProperty$Ex(Lit110, Lit46, Boolean.TRUE, Lit7);
        C0643runtime.setAndCoerceProperty$Ex(Lit110, Lit88, Lit111, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit110, Lit49, "Friday", Lit5);
    }

    static Object lambda34() {
        C0643runtime.setAndCoerceProperty$Ex(Lit110, Lit86, Lit89, Lit14);
        C0643runtime.setAndCoerceProperty$Ex(Lit110, Lit46, Boolean.TRUE, Lit7);
        C0643runtime.setAndCoerceProperty$Ex(Lit110, Lit88, Lit111, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit110, Lit49, "Friday", Lit5);
    }

    static Object lambda35() {
        C0643runtime.setAndCoerceProperty$Ex(Lit114, Lit86, Lit89, Lit14);
        C0643runtime.setAndCoerceProperty$Ex(Lit114, Lit46, Boolean.TRUE, Lit7);
        C0643runtime.setAndCoerceProperty$Ex(Lit114, Lit88, Lit115, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit114, Lit49, "Saturday", Lit5);
    }

    static Object lambda36() {
        C0643runtime.setAndCoerceProperty$Ex(Lit114, Lit86, Lit89, Lit14);
        C0643runtime.setAndCoerceProperty$Ex(Lit114, Lit46, Boolean.TRUE, Lit7);
        C0643runtime.setAndCoerceProperty$Ex(Lit114, Lit88, Lit115, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit114, Lit49, "Saturday", Lit5);
    }

    static Object lambda37() {
        C0643runtime.setAndCoerceProperty$Ex(Lit118, Lit86, Lit89, Lit14);
        C0643runtime.setAndCoerceProperty$Ex(Lit118, Lit46, Boolean.TRUE, Lit7);
        C0643runtime.setAndCoerceProperty$Ex(Lit118, Lit88, Lit119, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit118, Lit49, "Sunday", Lit5);
    }

    static Object lambda38() {
        C0643runtime.setAndCoerceProperty$Ex(Lit118, Lit86, Lit89, Lit14);
        C0643runtime.setAndCoerceProperty$Ex(Lit118, Lit46, Boolean.TRUE, Lit7);
        C0643runtime.setAndCoerceProperty$Ex(Lit118, Lit88, Lit119, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit118, Lit49, "Sunday", Lit5);
    }

    static Object lambda39() {
        C0643runtime.setAndCoerceProperty$Ex(Lit122, Lit86, Lit87, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit122, Lit88, Lit87, Lit14);
    }

    static Object lambda40() {
        C0643runtime.setAndCoerceProperty$Ex(Lit122, Lit86, Lit87, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit122, Lit88, Lit87, Lit14);
    }

    static Object lambda41() {
        C0643runtime.setAndCoerceProperty$Ex(Lit125, Lit86, Lit24, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit125, Lit88, Lit87, Lit14);
    }

    static Object lambda42() {
        C0643runtime.setAndCoerceProperty$Ex(Lit125, Lit86, Lit24, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit125, Lit88, Lit87, Lit14);
    }

    static Object lambda43() {
        C0643runtime.setAndCoerceProperty$Ex(Lit128, Lit86, Lit13, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit128, Lit88, Lit87, Lit14);
    }

    static Object lambda44() {
        C0643runtime.setAndCoerceProperty$Ex(Lit128, Lit86, Lit13, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit128, Lit88, Lit87, Lit14);
    }

    static Object lambda45() {
        C0643runtime.setAndCoerceProperty$Ex(Lit131, Lit86, Lit87, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit131, Lit88, Lit24, Lit14);
    }

    static Object lambda46() {
        C0643runtime.setAndCoerceProperty$Ex(Lit131, Lit86, Lit87, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit131, Lit88, Lit24, Lit14);
    }

    static Object lambda47() {
        C0643runtime.setAndCoerceProperty$Ex(Lit134, Lit86, Lit24, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit134, Lit88, Lit24, Lit14);
    }

    static Object lambda48() {
        C0643runtime.setAndCoerceProperty$Ex(Lit134, Lit86, Lit24, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit134, Lit88, Lit24, Lit14);
    }

    /* compiled from: View_schedule.yail */
    public class frame extends ModuleBody {
        View_schedule $main;

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 1:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 1;
                    return 0;
                case 2:
                    if (!(obj instanceof View_schedule)) {
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
                    if (!(obj instanceof View_schedule)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 1;
                    return 0;
                case 101:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 1;
                    return 0;
                case 102:
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
                    if (!(obj instanceof View_schedule)) {
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
                    if (!(obj instanceof View_schedule)) {
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
                case 101:
                    return View_schedule.lambda81proc(obj);
                case 102:
                    return this.$main.File1$GotText(obj);
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
                    View_schedule view_schedule = this.$main;
                    try {
                        Component component = (Component) obj;
                        try {
                            String str = (String) obj2;
                            try {
                                if (obj3 == Boolean.FALSE) {
                                    z = false;
                                }
                                try {
                                    view_schedule.dispatchGenericEvent(component, str, z, (Object[]) obj4);
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
                    return View_schedule.lambda2();
                case 19:
                    this.$main.$define();
                    return Values.empty;
                case 20:
                    return View_schedule.lambda3();
                case 21:
                    return View_schedule.lambda4();
                case 22:
                    return View_schedule.lambda5();
                case 23:
                    return View_schedule.lambda6();
                case 24:
                    return View_schedule.lambda7();
                case 25:
                    return View_schedule.lambda8();
                case 26:
                    return View_schedule.lambda9();
                case 27:
                    return View_schedule.lambda10();
                case 28:
                    return this.$main.Image7$Click();
                case 29:
                    return View_schedule.lambda11();
                case 30:
                    return View_schedule.lambda12();
                case 31:
                    return View_schedule.lambda13();
                case 32:
                    return View_schedule.lambda14();
                case 33:
                    return this.$main.Image6$Click();
                case 34:
                    return View_schedule.lambda15();
                case 35:
                    return View_schedule.lambda16();
                case 36:
                    return this.$main.Button1$Click();
                case 37:
                    return View_schedule.lambda17();
                case 38:
                    return View_schedule.lambda18();
                case 39:
                    return View_schedule.lambda19();
                case 40:
                    return View_schedule.lambda20();
                case 41:
                    return View_schedule.lambda21();
                case 42:
                    return View_schedule.lambda22();
                case 43:
                    return View_schedule.lambda23();
                case 44:
                    return View_schedule.lambda24();
                case 45:
                    return View_schedule.lambda25();
                case 46:
                    return View_schedule.lambda26();
                case 47:
                    return View_schedule.lambda27();
                case 48:
                    return View_schedule.lambda28();
                case 49:
                    return View_schedule.lambda29();
                case 50:
                    return View_schedule.lambda30();
                case 51:
                    return View_schedule.lambda31();
                case 52:
                    return View_schedule.lambda32();
                case 53:
                    return View_schedule.lambda33();
                case 54:
                    return View_schedule.lambda34();
                case 55:
                    return View_schedule.lambda35();
                case 56:
                    return View_schedule.lambda36();
                case 57:
                    return View_schedule.lambda37();
                case 58:
                    return View_schedule.lambda38();
                case 59:
                    return View_schedule.lambda39();
                case 60:
                    return View_schedule.lambda40();
                case 61:
                    return View_schedule.lambda41();
                case 62:
                    return View_schedule.lambda42();
                case 63:
                    return View_schedule.lambda43();
                case 64:
                    return View_schedule.lambda44();
                case 65:
                    return View_schedule.lambda45();
                case 66:
                    return View_schedule.lambda46();
                case 67:
                    return View_schedule.lambda47();
                case 68:
                    return View_schedule.lambda48();
                case 69:
                    return View_schedule.lambda49();
                case 70:
                    return View_schedule.lambda50();
                case 71:
                    return View_schedule.lambda51();
                case 72:
                    return View_schedule.lambda52();
                case 73:
                    return View_schedule.lambda53();
                case 74:
                    return View_schedule.lambda54();
                case 75:
                    return View_schedule.lambda55();
                case 76:
                    return View_schedule.lambda56();
                case 77:
                    return View_schedule.lambda57();
                case 78:
                    return View_schedule.lambda58();
                case 79:
                    return View_schedule.lambda59();
                case 80:
                    return View_schedule.lambda60();
                case 81:
                    return View_schedule.lambda61();
                case 82:
                    return View_schedule.lambda62();
                case 83:
                    return View_schedule.lambda63();
                case 84:
                    return View_schedule.lambda64();
                case 85:
                    return View_schedule.lambda65();
                case 86:
                    return View_schedule.lambda66();
                case 87:
                    return View_schedule.lambda67();
                case 88:
                    return View_schedule.lambda68();
                case 89:
                    return View_schedule.lambda69();
                case 90:
                    return View_schedule.lambda70();
                case 91:
                    return View_schedule.lambda71();
                case 92:
                    return View_schedule.lambda72();
                case 93:
                    return View_schedule.lambda73();
                case 94:
                    return View_schedule.lambda74();
                case 95:
                    return View_schedule.lambda75();
                case 96:
                    return View_schedule.lambda76();
                case 97:
                    return View_schedule.lambda77();
                case 98:
                    return View_schedule.lambda78();
                case 99:
                    return View_schedule.lambda79();
                case 100:
                    return View_schedule.lambda80();
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
                case 79:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 80:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 81:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 82:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 83:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 84:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 85:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 86:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 87:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 88:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 89:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 90:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 91:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 92:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 93:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 94:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 95:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 96:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 97:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 98:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 99:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                case 100:
                    callContext.proc = moduleMethod;
                    callContext.f226pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }
    }

    static Object lambda49() {
        C0643runtime.setAndCoerceProperty$Ex(Lit137, Lit86, Lit13, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit137, Lit88, Lit24, Lit14);
    }

    static Object lambda50() {
        C0643runtime.setAndCoerceProperty$Ex(Lit137, Lit86, Lit13, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit137, Lit88, Lit24, Lit14);
    }

    static Object lambda51() {
        C0643runtime.setAndCoerceProperty$Ex(Lit140, Lit86, Lit87, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit140, Lit88, Lit13, Lit14);
    }

    static Object lambda52() {
        C0643runtime.setAndCoerceProperty$Ex(Lit140, Lit86, Lit87, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit140, Lit88, Lit13, Lit14);
    }

    static Object lambda53() {
        C0643runtime.setAndCoerceProperty$Ex(Lit143, Lit86, Lit24, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit143, Lit88, Lit13, Lit14);
    }

    static Object lambda54() {
        C0643runtime.setAndCoerceProperty$Ex(Lit143, Lit86, Lit24, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit143, Lit88, Lit13, Lit14);
    }

    static Object lambda55() {
        C0643runtime.setAndCoerceProperty$Ex(Lit146, Lit86, Lit13, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit146, Lit88, Lit13, Lit14);
    }

    static Object lambda56() {
        C0643runtime.setAndCoerceProperty$Ex(Lit146, Lit86, Lit13, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit146, Lit88, Lit13, Lit14);
    }

    static Object lambda57() {
        C0643runtime.setAndCoerceProperty$Ex(Lit149, Lit86, Lit87, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit149, Lit88, Lit80, Lit14);
    }

    static Object lambda58() {
        C0643runtime.setAndCoerceProperty$Ex(Lit149, Lit86, Lit87, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit149, Lit88, Lit80, Lit14);
    }

    static Object lambda59() {
        C0643runtime.setAndCoerceProperty$Ex(Lit152, Lit86, Lit24, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit152, Lit88, Lit80, Lit14);
    }

    static Object lambda60() {
        C0643runtime.setAndCoerceProperty$Ex(Lit152, Lit86, Lit24, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit152, Lit88, Lit80, Lit14);
    }

    static Object lambda61() {
        C0643runtime.setAndCoerceProperty$Ex(Lit155, Lit86, Lit13, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit155, Lit88, Lit80, Lit14);
    }

    static Object lambda62() {
        C0643runtime.setAndCoerceProperty$Ex(Lit155, Lit86, Lit13, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit155, Lit88, Lit80, Lit14);
    }

    static Object lambda63() {
        C0643runtime.setAndCoerceProperty$Ex(Lit158, Lit86, Lit87, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit158, Lit88, Lit111, Lit14);
    }

    static Object lambda64() {
        C0643runtime.setAndCoerceProperty$Ex(Lit158, Lit86, Lit87, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit158, Lit88, Lit111, Lit14);
    }

    static Object lambda65() {
        C0643runtime.setAndCoerceProperty$Ex(Lit161, Lit86, Lit24, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit161, Lit88, Lit111, Lit14);
    }

    static Object lambda66() {
        C0643runtime.setAndCoerceProperty$Ex(Lit161, Lit86, Lit24, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit161, Lit88, Lit111, Lit14);
    }

    static Object lambda67() {
        C0643runtime.setAndCoerceProperty$Ex(Lit164, Lit86, Lit13, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit164, Lit88, Lit111, Lit14);
    }

    static Object lambda68() {
        C0643runtime.setAndCoerceProperty$Ex(Lit164, Lit86, Lit13, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit164, Lit88, Lit111, Lit14);
    }

    static Object lambda69() {
        C0643runtime.setAndCoerceProperty$Ex(Lit167, Lit86, Lit87, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit167, Lit88, Lit115, Lit14);
    }

    static Object lambda70() {
        C0643runtime.setAndCoerceProperty$Ex(Lit167, Lit86, Lit87, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit167, Lit88, Lit115, Lit14);
    }

    static Object lambda71() {
        C0643runtime.setAndCoerceProperty$Ex(Lit170, Lit86, Lit24, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit170, Lit88, Lit115, Lit14);
    }

    static Object lambda72() {
        C0643runtime.setAndCoerceProperty$Ex(Lit170, Lit86, Lit24, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit170, Lit88, Lit115, Lit14);
    }

    static Object lambda73() {
        C0643runtime.setAndCoerceProperty$Ex(Lit173, Lit86, Lit13, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit173, Lit88, Lit115, Lit14);
    }

    static Object lambda74() {
        C0643runtime.setAndCoerceProperty$Ex(Lit173, Lit86, Lit13, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit173, Lit88, Lit115, Lit14);
    }

    static Object lambda75() {
        C0643runtime.setAndCoerceProperty$Ex(Lit176, Lit86, Lit87, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit176, Lit88, Lit119, Lit14);
    }

    static Object lambda76() {
        C0643runtime.setAndCoerceProperty$Ex(Lit176, Lit86, Lit87, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit176, Lit88, Lit119, Lit14);
    }

    static Object lambda77() {
        C0643runtime.setAndCoerceProperty$Ex(Lit179, Lit86, Lit24, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit179, Lit88, Lit119, Lit14);
    }

    static Object lambda78() {
        C0643runtime.setAndCoerceProperty$Ex(Lit179, Lit86, Lit24, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit179, Lit88, Lit119, Lit14);
    }

    static Object lambda79() {
        C0643runtime.setAndCoerceProperty$Ex(Lit182, Lit86, Lit13, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit182, Lit88, Lit119, Lit14);
    }

    static Object lambda80() {
        C0643runtime.setAndCoerceProperty$Ex(Lit182, Lit86, Lit13, Lit14);
        return C0643runtime.setAndCoerceProperty$Ex(Lit182, Lit88, Lit119, Lit14);
    }

    public Object File1$GotText(Object $text) {
        Object $text2 = C0643runtime.sanitizeComponentData($text);
        C0643runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit3;
        if ($text2 instanceof Package) {
            $text2 = C0643runtime.signalRuntimeError(strings.stringAppend("The variable ", C0643runtime.getDisplayRepresentation(Lit186), " is not bound in the current context"), "Unbound Variable");
        }
        C0643runtime.addGlobalVarToCurrentFormEnvironment(simpleSymbol, $text2);
        Object $name = C0643runtime.callYailPrimitive(C0643runtime.make$Mnyail$Mnlist, LList.list1(C0643runtime.callYailPrimitive(C0643runtime.string$Mnsplit, LList.list2(C0643runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, C0643runtime.$Stthe$Mnnull$Mnvalue$St), ","), Lit187, "split")), Lit188, "make a list");
        ModuleMethod moduleMethod = proc$Fn80;
        ModuleMethod moduleMethod2 = proc$Fn80;
        if ($name instanceof Package) {
            $name = C0643runtime.signalRuntimeError(strings.stringAppend("The variable ", C0643runtime.getDisplayRepresentation(Lit224), " is not bound in the current context"), "Unbound Variable");
        }
        return C0643runtime.yailForEach(moduleMethod2, $name);
    }

    public static Object lambda81proc(Object $item) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        Object obj17;
        Object obj18;
        Object obj19;
        Object obj20;
        SimpleSymbol simpleSymbol = Lit122;
        SimpleSymbol simpleSymbol2 = Lit49;
        ModuleMethod moduleMethod = C0643runtime.yail$Mnlist$Mnget$Mnitem;
        if ($item instanceof Package) {
            obj = C0643runtime.signalRuntimeError(strings.stringAppend("The variable ", C0643runtime.getDisplayRepresentation(Lit189), " is not bound in the current context"), "Unbound Variable");
        } else {
            obj = $item;
        }
        C0643runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, C0643runtime.callYailPrimitive(moduleMethod, LList.list2(obj, Lit87), Lit190, "select list item"), Lit5);
        SimpleSymbol simpleSymbol3 = Lit125;
        SimpleSymbol simpleSymbol4 = Lit49;
        ModuleMethod moduleMethod2 = C0643runtime.yail$Mnlist$Mnget$Mnitem;
        if ($item instanceof Package) {
            obj2 = C0643runtime.signalRuntimeError(strings.stringAppend("The variable ", C0643runtime.getDisplayRepresentation(Lit189), " is not bound in the current context"), "Unbound Variable");
        } else {
            obj2 = $item;
        }
        C0643runtime.setAndCoerceProperty$Ex(simpleSymbol3, simpleSymbol4, C0643runtime.callYailPrimitive(moduleMethod2, LList.list2(obj2, Lit24), Lit191, "select list item"), Lit5);
        SimpleSymbol simpleSymbol5 = Lit128;
        SimpleSymbol simpleSymbol6 = Lit49;
        ModuleMethod moduleMethod3 = C0643runtime.yail$Mnlist$Mnget$Mnitem;
        if ($item instanceof Package) {
            obj3 = C0643runtime.signalRuntimeError(strings.stringAppend("The variable ", C0643runtime.getDisplayRepresentation(Lit189), " is not bound in the current context"), "Unbound Variable");
        } else {
            obj3 = $item;
        }
        C0643runtime.setAndCoerceProperty$Ex(simpleSymbol5, simpleSymbol6, C0643runtime.callYailPrimitive(moduleMethod3, LList.list2(obj3, Lit13), Lit192, "select list item"), Lit5);
        SimpleSymbol simpleSymbol7 = Lit131;
        SimpleSymbol simpleSymbol8 = Lit49;
        ModuleMethod moduleMethod4 = C0643runtime.yail$Mnlist$Mnget$Mnitem;
        if ($item instanceof Package) {
            obj4 = C0643runtime.signalRuntimeError(strings.stringAppend("The variable ", C0643runtime.getDisplayRepresentation(Lit189), " is not bound in the current context"), "Unbound Variable");
        } else {
            obj4 = $item;
        }
        C0643runtime.setAndCoerceProperty$Ex(simpleSymbol7, simpleSymbol8, C0643runtime.callYailPrimitive(moduleMethod4, LList.list2(obj4, Lit80), Lit193, "select list item"), Lit5);
        SimpleSymbol simpleSymbol9 = Lit134;
        SimpleSymbol simpleSymbol10 = Lit49;
        ModuleMethod moduleMethod5 = C0643runtime.yail$Mnlist$Mnget$Mnitem;
        if ($item instanceof Package) {
            obj5 = C0643runtime.signalRuntimeError(strings.stringAppend("The variable ", C0643runtime.getDisplayRepresentation(Lit189), " is not bound in the current context"), "Unbound Variable");
        } else {
            obj5 = $item;
        }
        C0643runtime.setAndCoerceProperty$Ex(simpleSymbol9, simpleSymbol10, C0643runtime.callYailPrimitive(moduleMethod5, LList.list2(obj5, Lit111), Lit194, "select list item"), Lit5);
        SimpleSymbol simpleSymbol11 = Lit137;
        SimpleSymbol simpleSymbol12 = Lit49;
        ModuleMethod moduleMethod6 = C0643runtime.yail$Mnlist$Mnget$Mnitem;
        if ($item instanceof Package) {
            obj6 = C0643runtime.signalRuntimeError(strings.stringAppend("The variable ", C0643runtime.getDisplayRepresentation(Lit189), " is not bound in the current context"), "Unbound Variable");
        } else {
            obj6 = $item;
        }
        C0643runtime.setAndCoerceProperty$Ex(simpleSymbol11, simpleSymbol12, C0643runtime.callYailPrimitive(moduleMethod6, LList.list2(obj6, Lit115), Lit195, "select list item"), Lit5);
        SimpleSymbol simpleSymbol13 = Lit140;
        SimpleSymbol simpleSymbol14 = Lit49;
        ModuleMethod moduleMethod7 = C0643runtime.yail$Mnlist$Mnget$Mnitem;
        if ($item instanceof Package) {
            obj7 = C0643runtime.signalRuntimeError(strings.stringAppend("The variable ", C0643runtime.getDisplayRepresentation(Lit189), " is not bound in the current context"), "Unbound Variable");
        } else {
            obj7 = $item;
        }
        C0643runtime.setAndCoerceProperty$Ex(simpleSymbol13, simpleSymbol14, C0643runtime.callYailPrimitive(moduleMethod7, LList.list2(obj7, Lit119), Lit196, "select list item"), Lit5);
        SimpleSymbol simpleSymbol15 = Lit143;
        SimpleSymbol simpleSymbol16 = Lit49;
        ModuleMethod moduleMethod8 = C0643runtime.yail$Mnlist$Mnget$Mnitem;
        if ($item instanceof Package) {
            obj8 = C0643runtime.signalRuntimeError(strings.stringAppend("The variable ", C0643runtime.getDisplayRepresentation(Lit189), " is not bound in the current context"), "Unbound Variable");
        } else {
            obj8 = $item;
        }
        C0643runtime.setAndCoerceProperty$Ex(simpleSymbol15, simpleSymbol16, C0643runtime.callYailPrimitive(moduleMethod8, LList.list2(obj8, Lit82), Lit197, "select list item"), Lit5);
        SimpleSymbol simpleSymbol17 = Lit146;
        SimpleSymbol simpleSymbol18 = Lit49;
        ModuleMethod moduleMethod9 = C0643runtime.yail$Mnlist$Mnget$Mnitem;
        if ($item instanceof Package) {
            obj9 = C0643runtime.signalRuntimeError(strings.stringAppend("The variable ", C0643runtime.getDisplayRepresentation(Lit189), " is not bound in the current context"), "Unbound Variable");
        } else {
            obj9 = $item;
        }
        C0643runtime.setAndCoerceProperty$Ex(simpleSymbol17, simpleSymbol18, C0643runtime.callYailPrimitive(moduleMethod9, LList.list2(obj9, Lit198), Lit199, "select list item"), Lit5);
        SimpleSymbol simpleSymbol19 = Lit149;
        SimpleSymbol simpleSymbol20 = Lit49;
        ModuleMethod moduleMethod10 = C0643runtime.yail$Mnlist$Mnget$Mnitem;
        if ($item instanceof Package) {
            obj10 = C0643runtime.signalRuntimeError(strings.stringAppend("The variable ", C0643runtime.getDisplayRepresentation(Lit189), " is not bound in the current context"), "Unbound Variable");
        } else {
            obj10 = $item;
        }
        C0643runtime.setAndCoerceProperty$Ex(simpleSymbol19, simpleSymbol20, C0643runtime.callYailPrimitive(moduleMethod10, LList.list2(obj10, Lit200), Lit201, "select list item"), Lit5);
        SimpleSymbol simpleSymbol21 = Lit152;
        SimpleSymbol simpleSymbol22 = Lit49;
        ModuleMethod moduleMethod11 = C0643runtime.yail$Mnlist$Mnget$Mnitem;
        if ($item instanceof Package) {
            obj11 = C0643runtime.signalRuntimeError(strings.stringAppend("The variable ", C0643runtime.getDisplayRepresentation(Lit189), " is not bound in the current context"), "Unbound Variable");
        } else {
            obj11 = $item;
        }
        C0643runtime.setAndCoerceProperty$Ex(simpleSymbol21, simpleSymbol22, C0643runtime.callYailPrimitive(moduleMethod11, LList.list2(obj11, Lit202), Lit203, "select list item"), Lit5);
        SimpleSymbol simpleSymbol23 = Lit155;
        SimpleSymbol simpleSymbol24 = Lit49;
        ModuleMethod moduleMethod12 = C0643runtime.yail$Mnlist$Mnget$Mnitem;
        if ($item instanceof Package) {
            obj12 = C0643runtime.signalRuntimeError(strings.stringAppend("The variable ", C0643runtime.getDisplayRepresentation(Lit189), " is not bound in the current context"), "Unbound Variable");
        } else {
            obj12 = $item;
        }
        C0643runtime.setAndCoerceProperty$Ex(simpleSymbol23, simpleSymbol24, C0643runtime.callYailPrimitive(moduleMethod12, LList.list2(obj12, Lit204), Lit205, "select list item"), Lit5);
        SimpleSymbol simpleSymbol25 = Lit158;
        SimpleSymbol simpleSymbol26 = Lit49;
        ModuleMethod moduleMethod13 = C0643runtime.yail$Mnlist$Mnget$Mnitem;
        if ($item instanceof Package) {
            obj13 = C0643runtime.signalRuntimeError(strings.stringAppend("The variable ", C0643runtime.getDisplayRepresentation(Lit189), " is not bound in the current context"), "Unbound Variable");
        } else {
            obj13 = $item;
        }
        C0643runtime.setAndCoerceProperty$Ex(simpleSymbol25, simpleSymbol26, C0643runtime.callYailPrimitive(moduleMethod13, LList.list2(obj13, Lit206), Lit207, "select list item"), Lit5);
        SimpleSymbol simpleSymbol27 = Lit161;
        SimpleSymbol simpleSymbol28 = Lit49;
        ModuleMethod moduleMethod14 = C0643runtime.yail$Mnlist$Mnget$Mnitem;
        if ($item instanceof Package) {
            obj14 = C0643runtime.signalRuntimeError(strings.stringAppend("The variable ", C0643runtime.getDisplayRepresentation(Lit189), " is not bound in the current context"), "Unbound Variable");
        } else {
            obj14 = $item;
        }
        C0643runtime.setAndCoerceProperty$Ex(simpleSymbol27, simpleSymbol28, C0643runtime.callYailPrimitive(moduleMethod14, LList.list2(obj14, Lit208), Lit209, "select list item"), Lit5);
        SimpleSymbol simpleSymbol29 = Lit164;
        SimpleSymbol simpleSymbol30 = Lit49;
        ModuleMethod moduleMethod15 = C0643runtime.yail$Mnlist$Mnget$Mnitem;
        if ($item instanceof Package) {
            obj15 = C0643runtime.signalRuntimeError(strings.stringAppend("The variable ", C0643runtime.getDisplayRepresentation(Lit189), " is not bound in the current context"), "Unbound Variable");
        } else {
            obj15 = $item;
        }
        C0643runtime.setAndCoerceProperty$Ex(simpleSymbol29, simpleSymbol30, C0643runtime.callYailPrimitive(moduleMethod15, LList.list2(obj15, Lit210), Lit211, "select list item"), Lit5);
        SimpleSymbol simpleSymbol31 = Lit167;
        SimpleSymbol simpleSymbol32 = Lit49;
        ModuleMethod moduleMethod16 = C0643runtime.yail$Mnlist$Mnget$Mnitem;
        if ($item instanceof Package) {
            obj16 = C0643runtime.signalRuntimeError(strings.stringAppend("The variable ", C0643runtime.getDisplayRepresentation(Lit189), " is not bound in the current context"), "Unbound Variable");
        } else {
            obj16 = $item;
        }
        C0643runtime.setAndCoerceProperty$Ex(simpleSymbol31, simpleSymbol32, C0643runtime.callYailPrimitive(moduleMethod16, LList.list2(obj16, Lit212), Lit213, "select list item"), Lit5);
        SimpleSymbol simpleSymbol33 = Lit170;
        SimpleSymbol simpleSymbol34 = Lit49;
        ModuleMethod moduleMethod17 = C0643runtime.yail$Mnlist$Mnget$Mnitem;
        if ($item instanceof Package) {
            obj17 = C0643runtime.signalRuntimeError(strings.stringAppend("The variable ", C0643runtime.getDisplayRepresentation(Lit189), " is not bound in the current context"), "Unbound Variable");
        } else {
            obj17 = $item;
        }
        C0643runtime.setAndCoerceProperty$Ex(simpleSymbol33, simpleSymbol34, C0643runtime.callYailPrimitive(moduleMethod17, LList.list2(obj17, Lit214), Lit215, "select list item"), Lit5);
        SimpleSymbol simpleSymbol35 = Lit173;
        SimpleSymbol simpleSymbol36 = Lit49;
        ModuleMethod moduleMethod18 = C0643runtime.yail$Mnlist$Mnget$Mnitem;
        if ($item instanceof Package) {
            obj18 = C0643runtime.signalRuntimeError(strings.stringAppend("The variable ", C0643runtime.getDisplayRepresentation(Lit189), " is not bound in the current context"), "Unbound Variable");
        } else {
            obj18 = $item;
        }
        C0643runtime.setAndCoerceProperty$Ex(simpleSymbol35, simpleSymbol36, C0643runtime.callYailPrimitive(moduleMethod18, LList.list2(obj18, Lit216), Lit217, "select list item"), Lit5);
        SimpleSymbol simpleSymbol37 = Lit176;
        SimpleSymbol simpleSymbol38 = Lit49;
        ModuleMethod moduleMethod19 = C0643runtime.yail$Mnlist$Mnget$Mnitem;
        if ($item instanceof Package) {
            obj19 = C0643runtime.signalRuntimeError(strings.stringAppend("The variable ", C0643runtime.getDisplayRepresentation(Lit189), " is not bound in the current context"), "Unbound Variable");
        } else {
            obj19 = $item;
        }
        C0643runtime.setAndCoerceProperty$Ex(simpleSymbol37, simpleSymbol38, C0643runtime.callYailPrimitive(moduleMethod19, LList.list2(obj19, Lit218), Lit219, "select list item"), Lit5);
        SimpleSymbol simpleSymbol39 = Lit179;
        SimpleSymbol simpleSymbol40 = Lit49;
        ModuleMethod moduleMethod20 = C0643runtime.yail$Mnlist$Mnget$Mnitem;
        if ($item instanceof Package) {
            obj20 = C0643runtime.signalRuntimeError(strings.stringAppend("The variable ", C0643runtime.getDisplayRepresentation(Lit189), " is not bound in the current context"), "Unbound Variable");
        } else {
            obj20 = $item;
        }
        C0643runtime.setAndCoerceProperty$Ex(simpleSymbol39, simpleSymbol40, C0643runtime.callYailPrimitive(moduleMethod20, LList.list2(obj20, Lit220), Lit221, "select list item"), Lit5);
        SimpleSymbol simpleSymbol41 = Lit182;
        SimpleSymbol simpleSymbol42 = Lit49;
        ModuleMethod moduleMethod21 = C0643runtime.yail$Mnlist$Mnget$Mnitem;
        if ($item instanceof Package) {
            $item = C0643runtime.signalRuntimeError(strings.stringAppend("The variable ", C0643runtime.getDisplayRepresentation(Lit189), " is not bound in the current context"), "Unbound Variable");
        }
        return C0643runtime.setAndCoerceProperty$Ex(simpleSymbol41, simpleSymbol42, C0643runtime.callYailPrimitive(moduleMethod21, LList.list2($item, Lit222), Lit223, "select list item"), Lit5);
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
        View_schedule = this;
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
