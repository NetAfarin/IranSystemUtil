public final class IranSystemUtil {
    private static final Character[] table = {
            '۰', '۱', '۲', '۳', '۴', '۵', '۶', '۷', '۸', '۹', '،', 'ـ', '؟', 'آ', 'ئ', 'ء',
            'ا', 'ا', 'ب', 'ب', 'پ', 'پ', 'ت', 'ت', 'ث', 'ث', 'ج', 'ج', 'چ', 'چ', 'ح', 'ح',
            'خ', 'خ', 'د', 'ذ', 'ر', 'ز', 'ژ', 'س', 'س', 'ش', 'ش', 'ص', 'ص', 'ض', 'ض', 'ط',
            'ظ', 'ع', 'ع', 'ع', 'ع', 'غ', 'غ', 'غ', 'غ', 'ف', 'ف', 'ق', 'ق', 'ک', 'ک', 'گ',
            'گ', 'ل', 'لا', 'ل', 'م', 'م', 'ن', 'ن', 'و', 'ه', 'ه', 'ه', 'ی', 'ی', 'ی', ' ',
    };

    private IranSystemUtil() {
        // since this class is a utility class so it must be singleton due to memory consumption.
    }

    public static String toUtf8(byte[] data, int offset, int length, boolean rtl) {
        return null;
    }
}