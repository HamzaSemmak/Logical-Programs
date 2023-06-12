export class ResponseCode {
    /*
    |--------------------------------------------------------------------------
    | Authentication 
    | 8000, 8001
    |--------------------------------------------------------------------------
    |
    | The following language lines are used during authentication for various
    | messages that we need to display to the user. You are free to modify
    | these language lines according to your application's requirements.
    |
    */

    static readonly RESPONSE_CODE_AUTH_FAILED: number = 8000;
    static readonly RESPONSE_CODE_AUTH_PASSWORD: number = 8001;

    /*
    |--------------------------------------------------------------------------
    | Validation Language Lines
    |--------------------------------------------------------------------------
    |
    | The following language lines contain the default error messages used by
    | the validator class. Some of these rules have multiple versions such
    | as the size rules. Feel free to tweak each of these messages here.
    |
    */
   
    static readonly RESPONSE_CODE_VAILDATION_FORM: number = 9000;
    static readonly RESPONSE_CODE_VAILDATION_EMPTY: number = 9001;
}