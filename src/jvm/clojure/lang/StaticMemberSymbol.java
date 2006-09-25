/**
 *   Copyright (c) Rich Hickey. All rights reserved.
 *   The use and distribution terms for this software are covered by the
 *   Common Public License 1.0 (http://opensource.org/licenses/cpl.php)
 *   which can be found in the file CPL.TXT at the root of this distribution.
 *   By using this software in any fashion, you are agreeing to be bound by
 * 	 the terms of this license.
 *   You must not remove this notice, or any other, from this software.
 **/

package clojure.lang;

public class StaticMemberSymbol extends HostSymbol implements IFn{
final public String className;
final public String memberName;

public StaticMemberSymbol(String name) {
    super(name);
    int lastDot = name.lastIndexOf('.');
    this.className = name.substring(0,lastDot);
    this.memberName = name.substring(lastDot + 1);
}

public Object invoke() throws Exception {
    return Reflector.invokeStaticMethod(memberName, className );
}

public Object invoke(Object obj) throws Exception {

    return Reflector.invokeStaticMethod(memberName, className , obj);
}

public Object invoke(Object obj, Object val) throws Exception {

    return Reflector.invokeStaticMethod(memberName, className , obj, val);
}

public Object invoke(Object arg1, Object arg2, Object arg3) throws Exception {
    return Reflector.invokeStaticMethod(memberName, className , arg1, arg2, arg3);
}

public Object invoke(Object arg1, Object arg2, Object arg3, Object arg4) throws Exception {
    return Reflector.invokeStaticMethod(memberName, className , arg1, arg2, arg3, arg4);
}

public Object invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5) throws Exception {
    return Reflector.invokeStaticMethod(memberName, className , arg1, arg2, arg3, arg4, arg5);
}

public Object invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6) throws Exception {
    return Reflector.invokeStaticMethod(memberName, className , arg1, arg2, arg3, arg4, arg5, arg6);
}

public Object invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7)
        throws Exception {
    return Reflector.invokeStaticMethod(memberName, className , arg1, arg2, arg3, arg4, arg5, arg6, arg7);
}

public Object invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7,
                     Object arg8) throws Exception {
    return Reflector.invokeStaticMethod(memberName, className , arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
}

public Object invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7,
                     Object arg8, Object arg9) throws Exception {
    return Reflector.invokeStaticMethod(memberName, className , arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
}

public Object invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7,
                     Object arg8, Object arg9, Object arg10) throws Exception {
    return Reflector.invokeStaticMethod(memberName, className , arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
}

public Object invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7,
                     Object arg8, Object arg9, Object arg10, Object arg11) throws Exception {
    return Reflector
            .invokeStaticMethod(memberName, className , arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
}

public Object invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7,
                     Object arg8, Object arg9, Object arg10, Object arg11, Object arg12) throws Exception {
    return Reflector.invokeStaticMethod(memberName, className , arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10,
                                          arg11, arg12);
}

public Object invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7,
                     Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13)
        throws Exception {
    return Reflector.invokeStaticMethod(memberName, className , arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10,
                                          arg11, arg12, arg13);
}

public Object invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7,
                     Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13, Object arg14)
        throws Exception {
    return Reflector.invokeStaticMethod(memberName, className , arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10,
                                          arg11, arg12, arg13, arg14);
}

public Object invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7,
                     Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13, Object arg14,
                     Object arg15) throws Exception {
    return Reflector.invokeStaticMethod(memberName, className , arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10,
                                          arg11, arg12, arg13, arg14, arg15);
}

public Object invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7,
                     Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13, Object arg14,
                     Object arg15, Object arg16) throws Exception {
    return Reflector.invokeStaticMethod(memberName, className , arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10,
                                          arg11, arg12, arg13, arg14, arg15, arg16);
}

public Object invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7,
                     Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13, Object arg14,
                     Object arg15, Object arg16, Object arg17) throws Exception {
    return Reflector.invokeStaticMethod(memberName, className , arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10,
                                          arg11, arg12, arg13, arg14, arg15, arg16, arg17);
}

public Object invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7,
                     Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13, Object arg14,
                     Object arg15, Object arg16, Object arg17, Object arg18) throws Exception {
    return Reflector.invokeStaticMethod(memberName, className , arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10,
                                          arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18);
}

public Object invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7,
                     Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13, Object arg14,
                     Object arg15, Object arg16, Object arg17, Object arg18, Object arg19) throws Exception {
    return Reflector.invokeStaticMethod(memberName, className , arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10,
                                          arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
}

public Object invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7,
                     Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13, Object arg14,
                     Object arg15, Object arg16, Object arg17, Object arg18, Object arg19, Object arg20)
        throws Exception {
    return Reflector.invokeStaticMethod(memberName, className , arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10,
                                          arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20);
}


public Object invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7,
                     Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13, Object arg14,
                     Object arg15, Object arg16, Object arg17, Object arg18, Object arg19, Object arg20
        , Object... args)
        throws Exception {
    throw new IllegalArgumentException("Can't call functions of more than 20 arguments");
}

public Object applyTo(ISeq arglist) throws Exception {
    return AFn.applyToHelper(this, arglist);
}

}
