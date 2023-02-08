package step5_02.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

//# 파일 컨트롤러[2단계] : ATM

public class FileEx07_문제 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int size = 5;
		int accsCnt = 0;
		int identifier = -1;
		
		String[] accs = new String[size];
		String[]  pws = new String[size];
		int[]  moneys = new int[size];
		
		String fileName = "atm.txt";
		FileWriter fw = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		while(true) {
			
			System.out.println("\n");
			if (identifier != -1) System.out.println(accs[identifier] + "님 로그인 중\n");
			System.out.println("[MEGA ATM]");
			System.out.println("[1]회원가입");
			System.out.println("[2]회원탈퇴");
			System.out.println("[3]로그인");
			System.out.println("[4]로그아웃");
			System.out.println("[5]입금");
			System.out.println("[6]출금");
			System.out.println("[7]이체");
			System.out.println("[8]잔액조회");
			System.out.println("[9]저장");
			System.out.println("[10]로드");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			
			if		(sel == 1) {
				System.out.print("계좌번호를 입력하세요 : ");
				String newAcc = sc.next();
				int duplicateAcc = 0;
				
				
				for (int i = 0; i < accs.length; i++) {
					if (newAcc.equals(accs[i])) duplicateAcc += 1;
				}
				
				if (duplicateAcc != 0) System.out.println("중복된 계좌번호입니다. 다른 번호로 입력하세요.");
				else {
					System.out.print("비밀번호를 입력하세요 : ");
					String newPW = sc.next();
					
					accs[accsCnt] = newAcc;
					pws[accsCnt] = newPW;
					accsCnt += 1;
					
					System.out.println("\n계좌가 추가되었습니다.");
					System.out.print("Account List (Max 5EA) = ");
					for (int i = 0; i < accsCnt; i++) {
						if (accs[i] != null) System.out.print(accs[i] + " ");
					}
				}
			}
			else if (sel == 2) {
				if (accsCnt == 0) System.out.println("가입된 계좌가 없습니다.");
				else if (accsCnt == 1) {
					System.out.print("탈퇴할 계좌번호를 입력하세요 : ");
					String outAcc = sc.next();
					if (!outAcc.equals(accs[accsCnt-1])) System.out.println("계좌번호를 확인하세요.");
					else {
						System.out.print("비밀번호를 입력하세요 : ");
						String outPw = sc.next();
						
						if (!outPw.equals(pws[accsCnt-1])) System.out.println("비밀번호를 확인하세요.");
						else {
							accs[accsCnt-1] = null;
							pws[accsCnt-1] = null;
							accsCnt -= 1;
						}
					}
				}
				else {
					System.out.print("탈퇴할 계좌번호를 입력하세요 : ");
					String outAcc = sc.next();
					int outIdx = -1;
					
					for (int i = 0; i < accsCnt; i++) {
						if (outAcc.equals(accs[i])) outIdx = i;
					}
					
					if (outIdx == -1) System.out.println("계좌번호를 확인하세요.");
					else {
						System.out.print("비밀번호를 입력하세요 : ");
						String outPw = sc.next();
						
						if (!outPw.equals(pws[outIdx])) System.out.println("비밀번호가 다릅니다.");
						else {
							String[] tmpAcc = new String[accsCnt - 1];
							String[] tmpPw = new String[accsCnt - 1];
							
							for (int i = 0; i < outIdx; i++) {
								tmpAcc[i] = accs[i];
								tmpPw[i] = pws[i];
							}
							for (int i = outIdx; i < accsCnt-1; i++) {
								tmpAcc[i] = accs[i+1];
								tmpPw[i] = pws[i+1];
							}
							
							accs = tmpAcc;
							pws = tmpPw;
							accsCnt -= 1;
							System.out.println("\n" + outAcc + " 계좌가 삭제되었습니다.");
							System.out.println();
							if (accsCnt == 0) System.out.println("등록된 계좌가 없습니다.");
							else {
								System.out.print("Acount list (Max 5EA) = ");
								for (int i = 0; i < accsCnt; i++) {
									if (accs[i] != null) System.out.print(accs[i] + " ");
								}
							}
						}
					}
				}
			}
			else if (sel == 3) {
				System.out.print("계좌번호를 입력하세요 : ");
				String inAcc = sc.next();
				int inIdx = -1;
				
				for (int i = 0; i < accsCnt; i++) {
					if (inAcc.equals(accs[i])) inIdx = i;
				}
				
				if (inIdx == -1) System.out.println("계좌번호를 확인하세요.");
				else {
					System.out.print("비밀번호를 입력하세요 : ");
					String inPw = sc.next();
					
					if (!inPw.equals(pws[inIdx])) System.out.println("비밀번호를 확인하세요.");
					else {
						identifier = inIdx;
						System.out.println(accs[inIdx] + "계좌로 로그인 되었습니다.");
					}
				}
			}
			else if (sel == 4) {
				if (identifier == -1) System.out.println("로그인된 계좌가 없습니다.");
				else {
					System.out.println(accs[identifier] + "님 로그아웃 되었습니다.");
					identifier = -1;
				}
			}
			else if (sel == 5) {
				if (identifier == -1) System.out.println("로그인 후 이용하세요.");
				else {
					System.out.print("입금할 금액을 입력하세요 : ");
					int inMoney = sc.nextInt();
					moneys[identifier] = inMoney;
					
					System.out.println(accs[identifier] + "님 계좌의 잔고는 " + moneys[identifier] + "원 입니다.");
				}
			}
			else if (sel == 6) {
				if (identifier == -1) System.out.println("로그인 후 이용하세요.");
				else {
					System.out.print("출금할 금액을 입력하세요 : ");
					int outMoney = sc.nextInt();
					
					if (outMoney > moneys[identifier]) System.out.println("잔액이 부족합니다.");
					else {
						moneys[identifier] -= outMoney;
						System.out.println(accs[identifier] + "님 계좌의 잔고는 " + moneys[identifier] + "원 입니다.");
					}
				}
			}
			else if (sel == 7) {
				if (identifier == -1) System.out.println("로그인 후 이용하세요.");
				else {
					System.out.print("이체할 계좌를 입력하세요 : ");
					String sendAcc = sc.next();
					int sendIdx = -1;
					
					for (int i = 0; i < accsCnt; i++) {
						if (sendAcc.equals(accs[i])) sendIdx = i;
					}
					
					if (sendIdx == -1) System.out.println("보내는 계좌번호를 확인하세요.");
					else {
						System.out.print("이체할 금액을 입력하세요 : ");
						int sendMoney = sc.nextInt();
						
						if (sendMoney > moneys[identifier]) System.out.println("잔액이 부족합니다.");
						else {
							moneys[identifier] -= sendMoney;
							moneys[sendIdx] += sendMoney;
							
							System.out.println(accs[sendIdx] + "님에게 " + sendMoney + "원 이체되었습니다.");
							System.out.println("잔액은 " + moneys[identifier] + "원 입니다.");
						}
					}
				}
			}
			else if (sel == 8) {
				if (identifier == -1) System.out.println("로그인 후 이용하세요.");
				else {
					System.out.println(accs[identifier] + "님 의 잔액은 " + moneys[identifier] + "원 입니다.");
				}
			}
			else if (sel == 9) {
				System.out.println("ATM data를 파일로 저장합니다.");
				
				try {
					fw = new FileWriter(fileName);
					
					fw.write("Acc\tPW\tmoney\n");
					
					for (int i = 0; i < accsCnt; i++) {
						String data = accs[i] + "\t" + pws[i] + "\t" + moneys[i] + "\n";
						fw.write(data);
					}
				} catch (Exception e) {
				} finally {
					if (fw != null) try {fw.close();} catch (Exception e2) {e2.printStackTrace();}
				}
			}
			else if (sel == 10) {
				System.out.println("저장된 ATM file 을 불러옵니다.");
				
				try {
					fr = new FileReader(fileName);
					br = new BufferedReader(fr);
					
					String[] tmpAcc = new String[size];
					String[] tmpPw = new String[size];
					int[] tmpMoney = new int[size];
					int i = 0;
					
					String accInfo = br.readLine();
					
					while (true) {
						
						String accData = br.readLine();
						if (accInfo == null) break;
						
						String[] accDataSplit = accData.split("\t");
						
						tmpAcc[i] = accDataSplit[0];
						tmpPw[i] = accDataSplit[1];
						tmpMoney[i++] = Integer.parseInt(accDataSplit[2]);
					}
					accs = tmpAcc;
					pws = tmpPw;
					moneys = tmpMoney;
					
					System.out.println("불러온 계좌 리스트는 다음과 같습니다.");
					for (int k = 0; k < accsCnt; k++) {
						if (accs[k] != null) System.out.print(accs[k] + " ");
					}
					System.out.println();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					if (br != null) try {br.close();} catch (Exception e2) {e2.printStackTrace();}
					if (fr != null) try {fr.close();} catch (Exception e2) {e2.printStackTrace();}
				}
			}
			else if (sel == 0) {
				System.out.println("ATM을 종료합니다.");
				break;
			}
		}
		sc.close();
	}
}