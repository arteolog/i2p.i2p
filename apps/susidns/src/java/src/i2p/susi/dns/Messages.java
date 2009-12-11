package i2p.susi.dns;

import net.i2p.I2PAppContext;
import net.i2p.util.Translate;

/**
 * Translate strings for this package.
 */
public class Messages {
    private static final String BUNDLE_NAME = "i2p.susi.dns.messages";
    private final I2PAppContext _context;

    public Messages() {
        _context = I2PAppContext.getGlobalContext();
    }

    /** lang in routerconsole.lang property, else current locale */
    public String _(String key) {
        return Translate.getString(key, _context, BUNDLE_NAME);
    }

    /**
     *  translate a string with a parameter
     *  This is a lot more expensive than getString(s, ctx), so use sparingly.
     *
     *  @param s string to be translated containing {0}
     *    The {0} will be replaced by the parameter.
     *    Single quotes must be doubled, i.e. ' -> '' in the string.
     *  @param o parameter, not translated.
     *    To tranlslate parameter also, use _("foo {0} bar", _("baz"))
     *    Do not double the single quotes in the parameter.
     *    Use autoboxing to call with ints, longs, floats, etc.
     */
    public String _(String s, Object o) {
        return Translate.getString(s, o, _context, BUNDLE_NAME);
    }
}
