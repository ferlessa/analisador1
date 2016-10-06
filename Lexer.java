/* The following code was generated by JFlex 1.6.1 */

package analisador;

import static analisador.Token.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>C:/Users/Fernanda/Desktop/AnalisadorLexico/src/analisador/Lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\3\1\53\1\53\1\3\22\0\1\3\1\13\1\31"+
    "\2\0\1\10\1\11\1\0\1\27\1\30\1\6\1\4\1\31\1\5"+
    "\1\31\1\7\12\2\1\0\1\31\1\15\1\16\1\14\2\0\22\1"+
    "\1\52\7\1\1\31\1\0\1\31\1\0\1\1\1\0\1\24\1\40"+
    "\1\36\1\37\1\22\1\23\1\51\1\46\1\33\1\1\1\50\1\25"+
    "\1\43\1\42\1\35\1\32\1\1\1\20\1\26\1\17\1\21\1\34"+
    "\1\44\1\41\1\45\1\47\1\31\1\12\1\31\7\0\1\53\u1fa2\0"+
    "\1\53\1\53\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\5\5\3\6\2\7"+
    "\1\10\7\2\2\11\12\2\1\10\1\12\1\6\1\7"+
    "\21\2\1\0\3\2\1\13\10\2\1\13\34\2\1\0"+
    "\4\2\1\13\20\2\1\14\12\2\1\3\16\2\1\13"+
    "\2\2\1\13\42\2";

  private static int [] zzUnpackAction() {
    int [] result = new int[184];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\54\0\130\0\204\0\54\0\260\0\334\0\u0108"+
    "\0\u0134\0\u0160\0\u018c\0\u01b8\0\u01e4\0\u0210\0\u023c\0\u01e4"+
    "\0\u0268\0\u0294\0\u02c0\0\u02ec\0\u0318\0\u0344\0\u0370\0\u039c"+
    "\0\54\0\u03c8\0\u03f4\0\u0420\0\u044c\0\u0478\0\u04a4\0\u04d0"+
    "\0\u04fc\0\u0528\0\u0554\0\54\0\54\0\54\0\54\0\u0580"+
    "\0\u05ac\0\u05d8\0\u0604\0\u0630\0\u065c\0\u0688\0\u06b4\0\u06e0"+
    "\0\u070c\0\u0738\0\u0764\0\u0790\0\u07bc\0\u07e8\0\u0814\0\u0840"+
    "\0\u086c\0\u0898\0\u08c4\0\u08f0\0\130\0\u091c\0\u0948\0\u0974"+
    "\0\u09a0\0\u09cc\0\u09f8\0\u0a24\0\u0a50\0\u0a7c\0\u0aa8\0\u0ad4"+
    "\0\u0b00\0\u0b2c\0\u0b58\0\u0b84\0\u0bb0\0\u0bdc\0\u0c08\0\u0c34"+
    "\0\u0c60\0\u0c8c\0\u0cb8\0\u0ce4\0\u0d10\0\u0d3c\0\u0d68\0\u0d94"+
    "\0\u0dc0\0\u0dec\0\u0e18\0\u0e44\0\u0e70\0\u0e9c\0\u0ec8\0\u0ef4"+
    "\0\u0f20\0\u0f4c\0\u0f78\0\u0fa4\0\u0fd0\0\u0ffc\0\u1028\0\u1054"+
    "\0\u1080\0\u10ac\0\u10d8\0\u1104\0\u1130\0\u115c\0\u1188\0\u11b4"+
    "\0\u11e0\0\u120c\0\u1238\0\u1264\0\u1290\0\u12bc\0\u12e8\0\u1314"+
    "\0\130\0\u1340\0\u136c\0\u1398\0\u13c4\0\u13f0\0\u141c\0\u1448"+
    "\0\u1474\0\u14a0\0\u14cc\0\54\0\u14f8\0\u1524\0\u1550\0\u157c"+
    "\0\u15a8\0\u15d4\0\u1600\0\u162c\0\u1658\0\u1684\0\u16b0\0\u16dc"+
    "\0\u1708\0\u1734\0\u0cb8\0\u1760\0\u178c\0\u17b8\0\u17e4\0\u1810"+
    "\0\u183c\0\u1868\0\u1894\0\u18c0\0\u18ec\0\u1918\0\u1944\0\u1970"+
    "\0\u199c\0\u19c8\0\u19f4\0\u1a20\0\u1a4c\0\u1a78\0\u1aa4\0\u1ad0"+
    "\0\u1afc\0\u1b28\0\u1b54\0\u1b80\0\u1bac\0\u1bd8\0\u1c04\0\u1c30"+
    "\0\u1c5c\0\u1c88\0\u1cb4\0\u1ce0\0\u1d0c\0\u1d38\0\u1d64\0\u1d90";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[184];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\3\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\2\31\1\32\1\33\1\34\1\3\1\35\1\36\1\37"+
    "\1\3\1\40\1\3\1\41\4\3\1\42\1\43\56\0"+
    "\2\3\14\0\10\3\3\0\21\3\3\0\1\4\55\0"+
    "\1\44\11\0\1\44\42\0\1\44\10\0\1\44\44\0"+
    "\1\45\6\0\1\44\43\0\2\45\6\0\1\44\53\0"+
    "\1\44\46\0\1\46\54\0\1\46\57\0\1\47\51\0"+
    "\1\47\1\0\1\47\52\0\2\47\36\0\2\3\14\0"+
    "\1\3\1\50\6\3\3\0\14\3\1\51\4\3\2\0"+
    "\2\3\14\0\3\3\1\52\4\3\3\0\21\3\2\0"+
    "\2\3\14\0\6\3\1\53\1\3\3\0\7\3\1\54"+
    "\11\3\2\0\2\3\14\0\5\3\1\55\1\56\1\3"+
    "\3\0\1\3\1\57\1\3\1\60\15\3\2\0\2\3"+
    "\14\0\7\3\1\61\3\0\6\3\1\62\12\3\2\0"+
    "\2\3\14\0\10\3\3\0\3\3\1\63\15\3\2\0"+
    "\2\3\14\0\1\64\1\3\1\65\5\3\3\0\12\3"+
    "\1\66\1\67\1\70\4\3\6\0\1\71\47\0\2\3"+
    "\14\0\1\3\1\72\1\73\2\3\1\74\2\3\3\0"+
    "\21\3\2\0\2\3\14\0\4\3\1\75\3\3\3\0"+
    "\10\3\1\76\1\77\7\3\2\0\2\3\14\0\10\3"+
    "\3\0\3\3\1\100\15\3\2\0\2\3\14\0\5\3"+
    "\1\101\1\102\1\3\3\0\3\3\1\103\10\3\1\104"+
    "\4\3\2\0\2\3\14\0\3\3\1\105\4\3\3\0"+
    "\3\3\1\106\15\3\2\0\2\3\14\0\1\3\1\107"+
    "\6\3\3\0\3\3\1\110\7\3\1\111\5\3\2\0"+
    "\2\3\14\0\2\3\1\112\1\113\1\3\1\114\2\3"+
    "\3\0\21\3\2\0\2\3\14\0\10\3\3\0\14\3"+
    "\1\115\4\3\2\0\2\3\14\0\10\3\3\0\3\3"+
    "\1\116\15\3\2\0\2\3\14\0\1\117\7\3\3\0"+
    "\21\3\2\0\2\3\14\0\2\3\1\120\2\3\1\121"+
    "\2\3\3\0\13\3\1\75\5\3\2\0\2\3\14\0"+
    "\1\3\1\122\6\3\3\0\1\3\1\123\17\3\2\0"+
    "\2\3\14\0\1\124\7\3\3\0\21\3\2\0\2\3"+
    "\14\0\7\3\1\125\3\0\21\3\2\0\2\3\14\0"+
    "\1\126\7\3\3\0\21\3\2\0\2\3\14\0\6\3"+
    "\1\127\1\3\3\0\21\3\2\0\2\3\14\0\10\3"+
    "\3\0\3\3\1\130\15\3\2\0\2\3\14\0\10\3"+
    "\3\0\10\3\1\131\10\3\2\0\2\3\14\0\1\3"+
    "\1\75\6\3\3\0\21\3\2\0\2\3\14\0\7\3"+
    "\1\132\3\0\21\3\2\0\2\3\14\0\7\3\1\133"+
    "\3\0\21\3\2\0\2\3\14\0\10\3\3\0\10\3"+
    "\1\134\10\3\2\0\2\3\14\0\1\3\1\135\3\3"+
    "\1\136\2\3\3\0\21\3\2\0\2\3\14\0\10\3"+
    "\3\0\1\137\20\3\2\0\2\3\14\0\10\3\3\0"+
    "\1\3\1\140\17\3\2\0\2\3\14\0\10\3\3\0"+
    "\10\3\1\141\10\3\2\0\2\3\14\0\10\3\3\0"+
    "\3\3\1\142\15\3\3\0\1\143\52\0\2\3\14\0"+
    "\10\3\3\0\1\3\1\144\1\3\1\145\15\3\2\0"+
    "\2\3\14\0\10\3\3\0\6\3\1\146\12\3\2\0"+
    "\2\3\14\0\10\3\3\0\4\3\1\147\14\3\2\0"+
    "\2\3\14\0\1\150\6\3\1\151\3\0\21\3\2\0"+
    "\2\3\14\0\10\3\3\0\1\152\20\3\2\0\2\3"+
    "\14\0\6\3\1\153\1\3\3\0\1\3\1\154\17\3"+
    "\2\0\2\3\14\0\1\155\6\3\1\125\3\0\21\3"+
    "\2\0\2\3\14\0\5\3\1\156\2\3\3\0\21\3"+
    "\2\0\2\3\14\0\10\3\3\0\10\3\1\157\10\3"+
    "\2\0\2\3\14\0\5\3\1\60\2\3\3\0\21\3"+
    "\2\0\2\3\14\0\4\3\1\160\3\3\3\0\21\3"+
    "\2\0\2\3\14\0\2\3\1\161\5\3\3\0\21\3"+
    "\2\0\2\3\14\0\3\3\1\162\4\3\3\0\21\3"+
    "\2\0\2\3\14\0\10\3\3\0\3\3\1\163\15\3"+
    "\2\0\2\3\14\0\1\125\7\3\3\0\21\3\2\0"+
    "\2\3\14\0\6\3\1\164\1\3\3\0\21\3\2\0"+
    "\2\3\14\0\10\3\3\0\12\3\1\75\6\3\2\0"+
    "\2\3\14\0\1\165\7\3\3\0\21\3\2\0\2\3"+
    "\14\0\10\3\3\0\1\3\1\166\17\3\2\0\2\3"+
    "\14\0\1\167\7\3\3\0\21\3\2\0\2\3\14\0"+
    "\1\3\1\170\6\3\3\0\21\3\2\0\2\3\14\0"+
    "\3\3\1\171\4\3\3\0\21\3\2\0\2\3\14\0"+
    "\10\3\3\0\10\3\1\172\10\3\2\0\2\3\14\0"+
    "\10\3\3\0\3\3\1\173\15\3\2\0\2\3\14\0"+
    "\7\3\1\75\3\0\21\3\2\0\2\3\14\0\2\3"+
    "\1\174\5\3\3\0\21\3\2\0\2\3\14\0\3\3"+
    "\1\75\4\3\3\0\21\3\2\0\2\3\14\0\3\3"+
    "\1\175\4\3\3\0\21\3\2\0\2\3\14\0\7\3"+
    "\1\120\3\0\21\3\2\0\2\3\14\0\5\3\1\176"+
    "\2\3\3\0\21\3\2\0\2\3\14\0\5\3\1\177"+
    "\2\3\3\0\21\3\2\0\2\3\14\0\3\3\1\142"+
    "\4\3\3\0\21\3\2\0\2\3\14\0\1\200\7\3"+
    "\3\0\21\3\2\0\2\3\14\0\10\3\3\0\17\3"+
    "\1\75\1\3\2\0\2\3\14\0\10\3\3\0\1\3"+
    "\1\201\17\3\2\0\2\3\14\0\1\202\7\3\3\0"+
    "\21\3\2\0\2\3\14\0\3\3\1\60\4\3\3\0"+
    "\21\3\2\0\2\3\14\0\1\155\7\3\3\0\21\3"+
    "\2\0\2\3\14\0\10\3\3\0\4\3\1\203\14\3"+
    "\2\0\2\3\14\0\1\3\1\176\6\3\3\0\21\3"+
    "\3\0\1\143\25\0\1\204\24\0\2\3\14\0\10\3"+
    "\3\0\2\3\1\205\16\3\2\0\2\3\14\0\1\206"+
    "\7\3\3\0\21\3\2\0\2\3\14\0\6\3\1\202"+
    "\1\3\3\0\21\3\2\0\2\3\14\0\10\3\3\0"+
    "\16\3\1\207\2\3\2\0\2\3\14\0\3\3\1\210"+
    "\4\3\3\0\21\3\2\0\2\3\14\0\1\211\7\3"+
    "\3\0\21\3\2\0\2\3\14\0\6\3\1\212\1\3"+
    "\3\0\3\3\1\142\15\3\2\0\2\3\14\0\5\3"+
    "\1\213\2\3\3\0\21\3\2\0\2\3\14\0\10\3"+
    "\3\0\5\3\1\75\13\3\2\0\2\3\14\0\10\3"+
    "\3\0\4\3\1\214\14\3\2\0\2\3\14\0\7\3"+
    "\1\123\3\0\21\3\2\0\2\3\14\0\1\215\6\3"+
    "\1\176\3\0\21\3\2\0\2\3\14\0\5\3\1\216"+
    "\2\3\3\0\21\3\2\0\2\3\14\0\10\3\3\0"+
    "\6\3\1\166\12\3\2\0\2\3\14\0\5\3\1\217"+
    "\2\3\3\0\21\3\2\0\2\3\14\0\6\3\1\220"+
    "\1\3\3\0\21\3\2\0\2\3\14\0\6\3\1\75"+
    "\1\3\3\0\21\3\2\0\2\3\14\0\10\3\3\0"+
    "\1\3\1\221\17\3\2\0\2\3\14\0\6\3\1\125"+
    "\1\3\3\0\21\3\2\0\2\3\14\0\10\3\3\0"+
    "\3\3\1\75\15\3\2\0\2\3\14\0\10\3\3\0"+
    "\1\3\1\63\17\3\2\0\2\3\14\0\7\3\1\222"+
    "\3\0\21\3\2\0\2\3\14\0\10\3\3\0\12\3"+
    "\1\223\6\3\2\0\2\3\14\0\1\3\1\224\6\3"+
    "\3\0\21\3\2\0\2\3\14\0\10\3\3\0\10\3"+
    "\1\225\10\3\2\0\2\3\14\0\1\75\7\3\3\0"+
    "\21\3\2\0\2\3\14\0\6\3\1\226\1\3\3\0"+
    "\21\3\2\0\2\3\14\0\1\3\1\227\6\3\3\0"+
    "\21\3\2\0\2\3\14\0\10\3\3\0\4\3\1\230"+
    "\14\3\2\0\2\3\14\0\10\3\3\0\1\3\1\231"+
    "\17\3\2\0\2\3\14\0\10\3\3\0\14\3\1\232"+
    "\4\3\2\0\2\3\14\0\5\3\1\111\2\3\3\0"+
    "\21\3\2\0\2\3\14\0\3\3\1\233\4\3\3\0"+
    "\21\3\2\0\2\3\14\0\5\3\1\234\2\3\3\0"+
    "\21\3\2\0\2\3\14\0\1\3\1\235\6\3\3\0"+
    "\21\3\2\0\2\3\14\0\5\3\1\236\2\3\3\0"+
    "\21\3\2\0\2\3\14\0\3\3\1\237\4\3\3\0"+
    "\21\3\2\0\2\3\14\0\1\115\7\3\3\0\21\3"+
    "\2\0\2\3\14\0\10\3\3\0\14\3\1\75\4\3"+
    "\2\0\2\3\14\0\10\3\3\0\1\3\1\240\17\3"+
    "\2\0\2\3\14\0\2\3\1\241\5\3\3\0\21\3"+
    "\2\0\2\3\14\0\10\3\3\0\16\3\1\75\2\3"+
    "\2\0\2\3\14\0\3\3\1\242\4\3\3\0\21\3"+
    "\2\0\2\3\14\0\10\3\3\0\2\3\1\125\16\3"+
    "\2\0\2\3\14\0\10\3\3\0\1\3\1\243\17\3"+
    "\2\0\2\3\14\0\10\3\3\0\10\3\1\75\10\3"+
    "\2\0\2\3\14\0\10\3\3\0\5\3\1\123\13\3"+
    "\2\0\2\3\14\0\6\3\1\244\1\3\3\0\21\3"+
    "\2\0\2\3\14\0\5\3\1\245\2\3\3\0\21\3"+
    "\2\0\2\3\14\0\1\246\7\3\3\0\21\3\2\0"+
    "\2\3\14\0\10\3\3\0\4\3\1\75\14\3\2\0"+
    "\2\3\14\0\1\3\1\247\6\3\3\0\21\3\2\0"+
    "\2\3\14\0\10\3\3\0\4\3\1\250\14\3\2\0"+
    "\2\3\14\0\10\3\3\0\17\3\1\125\1\3\2\0"+
    "\2\3\14\0\4\3\1\251\3\3\3\0\21\3\2\0"+
    "\2\3\14\0\10\3\3\0\10\3\1\252\10\3\2\0"+
    "\2\3\14\0\10\3\3\0\11\3\1\253\7\3\2\0"+
    "\2\3\14\0\10\3\3\0\10\3\1\254\10\3\2\0"+
    "\2\3\14\0\6\3\1\176\1\3\3\0\21\3\2\0"+
    "\2\3\14\0\5\3\1\224\2\3\3\0\21\3\2\0"+
    "\2\3\14\0\3\3\1\255\4\3\3\0\21\3\2\0"+
    "\2\3\14\0\10\3\3\0\13\3\1\75\5\3\2\0"+
    "\2\3\14\0\10\3\3\0\4\3\1\176\14\3\2\0"+
    "\2\3\14\0\4\3\1\256\3\3\3\0\21\3\2\0"+
    "\2\3\14\0\10\3\3\0\3\3\1\257\15\3\2\0"+
    "\2\3\14\0\1\260\7\3\3\0\21\3\2\0\2\3"+
    "\14\0\5\3\1\261\2\3\3\0\21\3\2\0\2\3"+
    "\14\0\10\3\3\0\4\3\1\262\14\3\2\0\2\3"+
    "\14\0\3\3\1\263\4\3\3\0\21\3\2\0\2\3"+
    "\14\0\2\3\1\125\5\3\3\0\21\3\2\0\2\3"+
    "\14\0\10\3\3\0\10\3\1\176\10\3\2\0\2\3"+
    "\14\0\10\3\3\0\1\75\20\3\2\0\2\3\14\0"+
    "\10\3\3\0\10\3\1\264\10\3\2\0\2\3\14\0"+
    "\3\3\1\154\4\3\3\0\21\3\2\0\2\3\14\0"+
    "\10\3\3\0\4\3\1\125\14\3\2\0\2\3\14\0"+
    "\3\3\1\265\4\3\3\0\21\3\2\0\2\3\14\0"+
    "\10\3\3\0\10\3\1\266\10\3\2\0\2\3\14\0"+
    "\10\3\3\0\1\3\1\267\17\3\2\0\2\3\14\0"+
    "\10\3\3\0\3\3\1\270\15\3\2\0\2\3\14\0"+
    "\1\123\7\3\3\0\21\3\2\0\2\3\14\0\10\3"+
    "\3\0\15\3\1\260\3\3\2\0\2\3\14\0\4\3"+
    "\1\75\3\3\3\0\21\3\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7612];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\1\11\23\1\1\11\12\1\4\11"+
    "\21\1\1\0\51\1\1\0\40\1\1\11\64\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[184];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
public String lexeme;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 178) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return ERROR;
            }
          case 13: break;
          case 2: 
            { lexeme=yytext(); return ID;
            }
          case 14: break;
          case 3: 
            { lexeme=yytext(); return NUMERO;
            }
          case 15: break;
          case 4: 
            { /*Ignore*/
            }
          case 16: break;
          case 5: 
            { lexeme = yytext(); return OP_ARITMETICO;
            }
          case 17: break;
          case 6: 
            { lexeme = yytext(); return OP_LOGICO;
            }
          case 18: break;
          case 7: 
            { lexeme = yytext(); return OP_RELACIONAL;
            }
          case 19: break;
          case 8: 
            { lexeme = yytext(); return OP_ATRIBUICAO;
            }
          case 20: break;
          case 9: 
            { lexeme = yytext(); return SEPARADOR;
            }
          case 21: break;
          case 10: 
            { lexeme = yytext(); return COMENTARIO;
            }
          case 22: break;
          case 11: 
            { lexeme = yytext(); return PALAVRA;
            }
          case 23: break;
          case 12: 
            { lexeme=yytext(); return OP_BOOLEANO;
            }
          case 24: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}